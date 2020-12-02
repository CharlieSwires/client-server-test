package com.charlie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.charlie.Countries.Country;
import com.charlie.Countries.Country.Currencies;

@Service
@ComponentScan(basePackages = {"com.charlie"})
public class MyService {
    private static final Logger LOGGER = LoggerFactory.getLogger(Service.class);

    @Autowired
    private RestTemplate restTemplate;

    public List<Country> getCountryForCurrency(String currency) {
        LOGGER.info("GET currency="+currency);

        final String uri = "https://restcountries.eu/rest/v2/currency/"+currency;
        Country[] response = restTemplate.getForObject(uri, Country[].class);
        return Arrays.asList(response);
    }
    public List<Country> getCurrencyForCountry(String country) {

        final String uri = "https://restcountries.eu/rest/v2/alpha?codes="+country;
        Country[] response = restTemplate.getForObject(uri, Country[].class);
        return Arrays.asList(response);
    }
    @SuppressWarnings("unchecked")
    public List<List<String>> testCode(String currency){
        List<String> result = new ArrayList<String>();
        List<String> bordersThatDontShareCurrency = new ArrayList<String>();
        List<Country> countries =  getCountryForCurrency(currency);
        if (countries.size() >= 1) {
            for(Country cu: countries) {
                LOGGER.info(cu.getAlpha3Code());
                result.add(cu.getAlpha3Code());
                String[] neighbours = cu.getBorders();
                List<String> neighboursList = Arrays.asList(neighbours);
                Stream<?> neighbourStream = neighboursList.parallelStream()
                            //get the currencies for the neighbours if not match map to the country code
                            //otherwise false
                        .map((x) -> 
                            !hasCurrency(getCurrencyForCountry(x).get(0).getCurrencies(),currency)
                            ? (x) : "false")
                            //filter out the falses.
                        .filter((y) -> !y.equals("false"));

                bordersThatDontShareCurrency.addAll((List<String>)neighbourStream.collect(Collectors.toList()));
            }
        }
        List<List<String>> overallResult = new ArrayList<List<String>>();
        overallResult.add(result);
        overallResult.add(bordersThatDontShareCurrency);
        return overallResult;
    }

    private Boolean hasCurrency(Currencies [] possibleCurrencies, String currency) {
        for(Currencies c : possibleCurrencies) {
            if (c.getCode().equals(currency.toUpperCase())) return true;
        }
        return false;
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

package com.charlie;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(path = "/borderInfo")
public class ClientServer  {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientServer.class);

    @Autowired
    private MyService service;

    @GetMapping(path="", produces="application/json")
    public List<List<String>> getCountry(@RequestParam(value = "currency", required = true) String currency) {

        List<List<String>> response = service.testCode(currency);
        LOGGER.info(response.toString());
        return response;
    }


}
package com.charlie;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Countries {

    private Country[] countries;

    public Country[] getCountries() {
        return countries;
    }

    public void setCountries(Country[] countries) {
        this.countries = countries;
    }


    public Countries() {
    }

 
    public static class Country {
        private String name;//": "Colombia",
        private String[] topLevelDomain;//": [".co"],
        private String alpha2Code;//": "CO",
        private String alpha3Code;//": "COL",
        private String[] callingCodes;//": ["57"],
        private String capital;//": "Bogotá",
        private String[] altSpellings;//": ["CO", "Republic of Colombia", "República de Colombia"],
        private String region;//": "Americas",
        private String subregion;//": "South America",
        private Long population;
        private Double[] latlng;
        private String demonym;//": "Colombian",
        private Double area;//": 1141748.0,
        private Double gini;//": 55.9,
        private String[] timezones;//": ["UTC-05:00"],
        private String[] borders;//": ["BRA", "ECU", "PAN", "PER", "VEN"],
        private String nativeName;//": "Colombia",
        private Integer numericCode;//": "170",
        private Currencies[] currencies; 
        static class Currencies{//": [{
            private String code;//": "COP",
            private String name;//": "Colombian peso",
            private String symbol;//": "$"
            public String getCode() {
                return code;
            }
            public void setCode(String code) {
                this.code = code;
            }
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public String getSymbol() {
                return symbol;
            }
            public void setSymbol(String symbol) {
                this.symbol = symbol;
            }
            @Override
            public String toString() {
                return "Currencies [code=" + code + ", name=" + name + ", symbol=" + symbol + "]";
            }
            
        }
        private Languages[] languages;
        static class Languages{//": [{
            private String iso639_1;//": "es",
            private String iso639_2;//": "spa",
            private String name;//": "Spanish",
            private String nativeName;//": "Español"
            public String getIso639_1() {
                return iso639_1;
            }
            public void setIso639_1(String iso639_1) {
                this.iso639_1 = iso639_1;
            }
            public String getIso639_2() {
                return iso639_2;
            }
            public void setIso639_2(String iso639_2) {
                this.iso639_2 = iso639_2;
            }
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public String getNativeName() {
                return nativeName;
            }
            public void setNativeName(String nativeName) {
                this.nativeName = nativeName;
            }
            @Override
            public String toString() {
                return "Languages [iso639_1=" + iso639_1 + ", iso639_2=" + iso639_2 + ", name=" + name
                        + ", nativeName=" + nativeName + "]";
            }
            
        }
        private Translations translations;
        static class Translations{//": {
            private String de;//": "Kolumbien",
            private String es;//": "Colombia",
            private String fr;//": "Colombie",
            private String ja;//": "コロンビア",
            private String it;//": "Colombia",
            private String br;//": "Colômbia",
            private String pt;//": "Colômbia"
            public String getDe() {
                return de;
            }
            public void setDe(String de) {
                this.de = de;
            }
            public String getEs() {
                return es;
            }
            public void setEs(String es) {
                this.es = es;
            }
            public String getFr() {
                return fr;
            }
            public void setFr(String fr) {
                this.fr = fr;
            }
            public String getJa() {
                return ja;
            }
            public void setJa(String ja) {
                this.ja = ja;
            }
            public String getIt() {
                return it;
            }
            public void setIt(String it) {
                this.it = it;
            }
            public String getBr() {
                return br;
            }
            public void setBr(String br) {
                this.br = br;
            }
            public String getPt() {
                return pt;
            }
            public void setPt(String pt) {
                this.pt = pt;
            }
            @Override
            public String toString() {
                return "Translations [de=" + de + ", es=" + es + ", fr=" + fr + ", ja=" + ja + ", it="
                        + it + ", br=" + br + ", pt=" + pt + "]";
            }
            
        }
        private URL flag;//": "https://restcountries.eu/data/col.svg",
        private RegionalBlocs[] regionalBlocs;//": [{
        static class RegionalBlocs{//": [{
            private String acronym;//": "PA",
            private String name;//": "Pacific Alliance",
            private String[] otherAcronyms;//": [],
            private String[] otherNames;//": ["Alianza del Pacífico"]
            public String getAcronym() {
                return acronym;
            }
            public void setAcronym(String acronym) {
                this.acronym = acronym;
            }
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public String[] getOtherAcronyms() {
                return otherAcronyms;
            }
            public void setOtherAcronyms(String[] otherAcronyms) {
                this.otherAcronyms = otherAcronyms;
            }
            public String[] getOtherNames() {
                return otherNames;
            }
            public void setOtherNames(String[] otherNames) {
                this.otherNames = otherNames;
            }
            @Override
            public String toString() {
                return "RegionalBlocs [acronym=" + acronym + ", name=" + name + ", otherAcronyms="
                        + Arrays.toString(otherAcronyms) + ", otherNames=" + Arrays.toString(otherNames)
                        + "]";
            }
            
        }
        private String cioc;//": "COL"
        
        @Override
        public String toString() {
            return "Country [name=" + name + ", topLevelDomain=" + Arrays.toString(topLevelDomain)
            + ", alpha2Code=" + alpha2Code + ", alpha3Code=" + alpha3Code
            + ", callingCodes=" + Arrays.toString(callingCodes) + ", capital=" + capital
            + ", altSpellings=" + Arrays.toString(altSpellings) + ", region=" + region
            + ", subregion=" + subregion + ", population=" + population + ", latlng="
            + Arrays.toString(latlng) + ", demonym=" + demonym + ", area=" + area
            + ", gini=" + gini + ", timezones=" + Arrays.toString(timezones) + ", borders="
            + Arrays.toString(borders) + ", nativeName=" + nativeName + ", numericCode="
            + numericCode + ", currencies=" + Arrays.toString(currencies) + ", languages="
            + Arrays.toString(languages) + ", translations=" + translations + ", flag="
            + flag + ", regionalBlocs=" + Arrays.toString(regionalBlocs) + ", cioc=" + cioc
            + "]";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String[] getTopLevelDomain() {
            return topLevelDomain;
        }

        public void setTopLevelDomain(String[] topLevelDomain) {
            this.topLevelDomain = topLevelDomain;
        }

        public String getAlpha2Code() {
            return alpha2Code;
        }

        public void setAlpha2Code(String alpha2Code) {
            this.alpha2Code = alpha2Code;
        }

        public String getAlpha3Code() {
            return alpha3Code;
        }

        public void setAlpha3Code(String alpha3Code) {
            this.alpha3Code = alpha3Code;
        }

        public String[] getCallingCodes() {
            return callingCodes;
        }

        public void setCallingCodes(String[] callingCodes) {
            this.callingCodes = callingCodes;
        }

        public String getCapital() {
            return capital;
        }

        public void setCapital(String capital) {
            this.capital = capital;
        }

        public String[] getAltSpellings() {
            return altSpellings;
        }

        public void setAltSpellings(String[] altSpellings) {
            this.altSpellings = altSpellings;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getSubregion() {
            return subregion;
        }

        public void setSubregion(String subregion) {
            this.subregion = subregion;
        }

        public Long getPopulation() {
            return population;
        }

        public void setPopulation(Long population) {
            this.population = population;
        }

        public Double[] getLatlng() {
            return latlng;
        }

        public void setLatlng(Double[] latlng) {
            this.latlng = latlng;
        }

        public String getDemonym() {
            return demonym;
        }

        public void setDemonym(String demonym) {
            this.demonym = demonym;
        }

        public Double getArea() {
            return area;
        }

        public void setArea(Double area) {
            this.area = area;
        }

        public Double getGini() {
            return gini;
        }

        public void setGini(Double gini) {
            this.gini = gini;
        }

        public String[] getTimezones() {
            return timezones;
        }

        public void setTimezones(String[] timezones) {
            this.timezones = timezones;
        }

        public String[] getBorders() {
            return borders;
        }

        public void setBorders(String[] borders) {
            this.borders = borders;
        }

        public String getNativeName() {
            return nativeName;
        }

        public void setNativeName(String nativeName) {
            this.nativeName = nativeName;
        }

        public Integer getNumericCode() {
            return numericCode;
        }

        public void setNumericCode(Integer numericCode) {
            this.numericCode = numericCode;
        }

        public Currencies[] getCurrencies() {
            return currencies;
        }

        public void setCurrencies(Currencies[] currencies) {
            this.currencies = currencies;
        }

        public Languages[] getLanguages() {
            return languages;
        }

        public void setLanguages(Languages[] languages) {
            this.languages = languages;
        }

        public Translations getTranslations() {
            return translations;
        }

        public void setTranslations(Translations translations) {
            this.translations = translations;
        }

        public URL getFlag() {
            return flag;
        }

        public void setFlag(URL flag) {
            this.flag = flag;
        }

        public RegionalBlocs[] getRegionalBlocs() {
            return regionalBlocs;
        }

        public void setRegionalBlocs(RegionalBlocs[] regionalBlocs) {
            this.regionalBlocs = regionalBlocs;
        }

        public String getCioc() {
            return cioc;
        }

        public void setCioc(String cioc) {
            this.cioc = cioc;
        }

    }


    @Override
    public String toString() {
        return "Countries [countries=" + Arrays.toString(countries) + "]";
    }


}

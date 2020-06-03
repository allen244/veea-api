package com.veea.interview.client;

import com.veea.interview.model.Places;
import com.veea.interview.model.Root;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class VeeaFourSquareClient {

    private String apihost = "https://api.foursquare.com/v2/venues/search?ll=40.7,-74&client_id=QU1ZR2JJYOG0T25XD5UPZC0CWJBIZW5KWX125XPPWJH1WY2L&client_secret=EWYDKCLLYKHFAELYGBTIQ4C5YBUML5SZD2J5OTZQ04KY5Q3V&v=20200602";
    private final String clientId = "QU1ZR2JJYOG0T25XD5UPZC0CWJBIZW5KWX125XPPWJH1WY2L";
    private final String secret = "EWYDKCLLYKHFAELYGBTIQ4C5YBUML5SZD2J5OTZQ04KY5Q3V";
    private final RestTemplate restTemplate;

    public VeeaFourSquareClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    public Places getAllVenues() {
        Root result = restTemplate.getForObject(apihost, Root.class);
        return new Places(result.getResponse().getVenues());
    }
}

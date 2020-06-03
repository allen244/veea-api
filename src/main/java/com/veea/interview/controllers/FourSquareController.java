package com.veea.interview.controllers;

import com.veea.interview.client.VeeaFourSquareClient;
import com.veea.interview.model.Places;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/veea/api/v1/")
@RestController
public class FourSquareController {

    @Autowired
    VeeaFourSquareClient veeaFourSquareClient;

    @RequestMapping(value = "/foursquare")
    @ResponseStatus(HttpStatus.OK)
    public Places getAllVenues() {
        return veeaFourSquareClient.getAllVenues();
    }
}

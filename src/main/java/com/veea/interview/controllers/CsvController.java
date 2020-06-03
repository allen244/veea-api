package com.veea.interview.controllers;

import com.veea.interview.client.VeeaCsvClient;
import com.veea.interview.domain.User;
import com.veea.interview.domain.Wrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@RequiredArgsConstructor
@RequestMapping("/veea/api/v1/")
@RestController
public class CsvController {

    @Autowired
    VeeaCsvClient veeaCsvClient;
    @Autowired
    ResourceLoader resourceLoader;

    @RequestMapping(value = "/csv")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getCsvUsers() throws IOException {
        List<User> userList = new ArrayList<>();
        Resource resource = resourceLoader.getResource("classpath:config/test.csv");
        InputStream csvFile = resource.getInputStream();
        try {
            userList = veeaCsvClient.readCsv(csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @RequestMapping(value = "/csv/names")
    @ResponseStatus(HttpStatus.OK)
    public String getCsvUsersCountAndNames() throws IOException {
        List<User> userList = new ArrayList<>();
        Resource resource = resourceLoader.getResource("classpath:config/test.csv");
        InputStream csvFile = resource.getInputStream();
        try {
            Map colorMap = veeaCsvClient.printColorAndCountAndNames(veeaCsvClient.readCsv(csvFile));
            Set<Wrapper> colorlist = new HashSet<>(colorMap.values());
            return veeaCsvClient.convertObjectToJson(colorlist, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "/csv/count")
    @ResponseStatus(HttpStatus.OK)
    public String getCsvUsersCount() throws IOException {
        List<User> userList = new ArrayList<>();
        Resource resource = resourceLoader.getResource("classpath:config/test.csv");
        InputStream csvFile = resource.getInputStream();
        try {
            Map colorMap = veeaCsvClient.printColorAndCountAndNames(veeaCsvClient.readCsv(csvFile));
            Set<Wrapper> colorlist = new HashSet<>(colorMap.values());
            return veeaCsvClient.convertObjectToJson(colorlist, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

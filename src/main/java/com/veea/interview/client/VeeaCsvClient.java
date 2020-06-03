package com.veea.interview.client;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.veea.interview.domain.User;
import com.veea.interview.domain.Wrapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@Component
public class VeeaCsvClient {

    public VeeaCsvClient() {
    }

    public List<User> readCsv(InputStream csvFile) throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema csvSchema = csvMapper
                .typedSchemaFor(User.class)
                .withColumnSeparator(',')
                .withComments();
        MappingIterator<User> userMappingIterator = csvMapper
                .readerWithTypedSchemaFor(User.class)
                .with(csvSchema)
                .readValues(csvFile);
        return userMappingIterator.readAll();
    }


    public Map<String, Wrapper> printColorAndCountAndNames(List<User> users) {
        Map<String, Wrapper> colorMap = new HashMap<String, Wrapper>();
        for (User user : users) {
            if (colorMap.containsKey(user.getColor())) {
                Wrapper wrapper = colorMap.get(user.getColor());
                wrapper.setColor(user.getColor());
                wrapper.addToNames(user.getFullName());
                colorMap.put(user.getColor(), wrapper);
            } else {
                Wrapper wrapper = new Wrapper();
                wrapper.setColor(user.getColor());
                wrapper.addToNames(user.getFullName());
                colorMap.put(user.getColor(), wrapper);
            }
        }

        return colorMap;
    }


    public static void printMap(Map mp, boolean names) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            Wrapper wrapper = (Wrapper) pair.getValue();
            if (names) {
                System.out.printf("%-5.5s  %-5.5s  %-50.50s%n", pair.getKey(), wrapper.getCount(), wrapper.getNames().toString().replace("[", "").replace("]", ""));
            } else {
                System.out.printf("%-5.5s  %-5.5s%n", pair.getKey(), wrapper.getCount());
            }
        }
    }

    public String convertObjectToJson(Set<Wrapper> wrapper, boolean shownames) {
        ObjectMapper objectMapper = new ObjectMapper();
        FilterProvider filters = null;
        try {

            if (shownames) {
                filters = new SimpleFilterProvider().addFilter(
                        "nameFilter", SimpleBeanPropertyFilter.serializeAll());
            } else {
                filters = new SimpleFilterProvider().addFilter(
                        "nameFilter", SimpleBeanPropertyFilter.serializeAllExcept("names"));
            }

            String jsonStr = objectMapper.writer(filters)
                    .withDefaultPrettyPrinter()
                    .writeValueAsString(wrapper);
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

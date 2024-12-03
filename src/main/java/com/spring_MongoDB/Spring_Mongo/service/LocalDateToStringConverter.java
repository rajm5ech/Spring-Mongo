package com.spring_MongoDB.Spring_Mongo.service;

import com.mongodb.DBObject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Component
public class LocalDateToStringConverter implements Converter<LocalDate, String> {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public String convert(LocalDate source) {
        if (source != null) {
            return source.format(formatter);  // Convert LocalDate to string (e.g., "2024-12-03")
        }
        return null;
    }
}




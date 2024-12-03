package com.spring_MongoDB.Spring_Mongo.service;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class StringToLocalDateConverter implements Converter<String, LocalDate> {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public LocalDate convert(String source) {
        if (source != null) {
            return LocalDate.parse(source, formatter);  // Convert string back to LocalDate
        }
        return null;
    }
}
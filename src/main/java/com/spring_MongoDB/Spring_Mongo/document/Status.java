package com.spring_MongoDB.Spring_Mongo.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
    ACTIVE, INACTIVE;


    @JsonCreator
    public static Status fromString(String status) {
        if (status != null) {
            for (Status s : Status.values()) {
                if (status.equalsIgnoreCase(s.name())) {
                    return s;
                }
            }
        }
        throw new IllegalArgumentException("Unknown enum type " + status);
    }

    @JsonValue
    public String toValue() {
        return this.name();  // or return the string value if needed, e.g., return ACTIVE
    }
}

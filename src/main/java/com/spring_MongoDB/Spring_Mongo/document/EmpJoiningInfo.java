package com.spring_MongoDB.Spring_Mongo.document;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class EmpJoiningInfo {
    @Field("office")
    private String joiningOffice;
    @Field(value = "joining_dt")
    @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy")
    private LocalDate joiningDate;
}

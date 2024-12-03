package com.spring_MongoDB.Spring_Mongo.document;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
   // @BsonProperty(value = "emp_Id")
   @Id
   @Field(value = "emp_id")
   @NotNull
   @NotBlank
    private Integer employeeId;
    @Field(value = "first_Name")
    private String firstName;
    @Field(value = "middle_Name")
    @NotNull
    @NotBlank
    private String middleName;
   @Field(value = "last_Name")
    private String lastName;
    @Field(value = "emp_age")
    private int age;
    @Field(value = "emp_status")
    private Status status;
    @Field(value = "created_dt", targetType = FieldType.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime createdDate;
    @Field("emp_joining_info")
    private EmpJoiningInfo empJoiningInfo;
//    @BsonProperty(value = "emp_image")
//    private byte[] employeeImage;

}

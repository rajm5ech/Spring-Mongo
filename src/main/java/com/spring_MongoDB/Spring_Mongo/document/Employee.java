package com.spring_MongoDB.Spring_Mongo.document;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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
    private String middleName;
   @Field(value = "last_Name")
    private String lastName;
    @Field(value = "emp_age")
    private int age;
//    @BsonProperty(value = "emp_image")
//    private byte[] employeeImage;

}

package com.icoleto.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    @Id
    private String id;
    private String name;
    @Field("lastname")
    private String lastName;
    private String gender;
    private String country;
    @Field("programming_languages")
    private List<String> programmingLanguages;
}
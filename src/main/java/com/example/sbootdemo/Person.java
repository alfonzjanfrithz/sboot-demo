package com.example.sbootdemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    Long personId;
    String lastName;
    String firstName;
    String address;
    String city;
}

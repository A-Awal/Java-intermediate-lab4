package com.lab4.api.memory_optimization;

import com.lab4.api.memory_optimization.MemoryOptimization.MovieQuoteService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
public class User {

    private String name;
    private String email;
    private String phone;
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public User(String name, String email, String phone, String street, String city, String state, String zipcode){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
       
    }
    @Getter()
    private MovieQuoteService vQuoteService;

    public void subscribe(MovieQuoteService mQuoteService){
        mQuoteService.users.add(this);
        vQuoteService = mQuoteService;

    }
}

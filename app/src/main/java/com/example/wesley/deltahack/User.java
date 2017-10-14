package com.example.wesley.deltahack;

import java.util.ArrayList;

/**
 * Created by wes on 10/14/2017.
 */

public class User {
    String username;
    String password;
    ArrayList flights = new ArrayList<Flight>();
    public User(String user, String pass) {
        username = user;
        password = pass;
    }
    public void addFlight(Flight f) {
        flights.add(f);
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}

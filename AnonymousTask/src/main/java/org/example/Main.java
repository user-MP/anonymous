package org.example;

import interfaces.Authentication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws InterruptedException {



        User bob=new User("bobU10","1234", LocalDate.of(1999,4,22), LocalDateTime.of(2022,4,18,14,33));

        bob.setExecuter(new Authentication() {
            @Override
            public void makeAuthorization() {
                System.out.println(" Logged in using account Facebook");
            }
            public void cleaningResources(){
                System.out.println("Cleaning resources");
            }
        });

        bob.LogIn();


        bob.LogOut();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Last date and time active "+bob.getUsername()+": "+bob.getLastTimeActive().format (formatter));


    }
}
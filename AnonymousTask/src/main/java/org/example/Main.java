package org.example;

import org.example.User;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws InterruptedException {

           User bob=new User("bobU10","1234", LocalDate.of(1999,4,22), LocalDateTime.of(2022,4,18,14,33) ){
            public void LogIn(){

                System.out.println(this.getUsername()+" logged in using Twitter");
            }
        };

        User mike=new User("mikeKing","1234", LocalDate.of(2002,2,12), LocalDateTime.of(2018,8,28,11,53) ){
            public void LogIn(){


                System.out.println(this.getUsername()+" log in using Facebook");
            }
        };

        User william=new User("alen","1234", LocalDate.of(2002,2,12), LocalDateTime.of(2018,8,28,11,53) );

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        bob.LogIn();

        bob.LogOut();

        mike.LogIn();

        mike.LogOut();

        System.out.println("Last date and time active "+mike.getUsername()+": "+mike.getLastTimeActive().format(formatter));


        bob.LogIn();

        System.out.println("Last date and time active "+bob.getUsername()+": "+bob.getLastTimeActive().format (formatter));

        bob.LogOut();

        william.LogIn();



        william.LogOut();

        System.out.println("Last date and time active "+william.getUsername()+": "+william.getLastTimeActive().format(formatter));


    }
}
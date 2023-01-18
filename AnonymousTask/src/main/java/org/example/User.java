package org.example;


import interfaces.Authentication;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User{

    private String username;
    private String password;

    private LocalDate dateBirthday;

    private LocalDateTime dateRegistration;

    private LocalDateTime lastTimeActive;


    Authentication executer;

    public User(){


    }

    public User(String username, String password, LocalDate dateBirthday, LocalDateTime dateRegistration){

        this.username = username;
        this.password = password;
        this.dateBirthday = dateBirthday;
        this.dateRegistration = dateRegistration;


    }

    public void setExecuter(Authentication executer){
        this.executer=executer;

    }

    public void LogIn(){

        System.out.print(username);
        executer.makeAuthorization();

    }


    public void LogOut() throws InterruptedException {
        executer.cleaningResources();
        System.out.println(username+" "+"Logged out");
        Thread.sleep(1000);
        this.lastTimeActive =LocalDateTime.now();


    }

    public void setLastTimeActive(LocalDateTime dateTime){

        this.lastTimeActive=dateTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public LocalDateTime getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(LocalDateTime dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public LocalDateTime getLastTimeActive() {
        return lastTimeActive;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", dateRegistration=" + dateRegistration +
                ", lastTimeActive=" + lastTimeActive +
                '}';
    }
}






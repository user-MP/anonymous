package org.example;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class User{

    private String username;
    private String password;

    private LocalDate dateBirthday;

    private LocalDateTime dateRegistration;

    private LocalDateTime lastTimeActive;


    public User(){


    }

    public User(String username, String password, LocalDate dateBirthday, LocalDateTime dateRegistration){

        this.username = username;
        this.password = password;
        this.dateBirthday = dateBirthday;
        this.dateRegistration = dateRegistration;


    }

    public void LogIn(){
        System.out.println(this.username+" login using username and password");

    }

    public void LogOut() throws InterruptedException {
        Thread.sleep(1000);
        this.lastTimeActive =LocalDateTime.now();
        System.out.println(this.username+ " logged out");

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






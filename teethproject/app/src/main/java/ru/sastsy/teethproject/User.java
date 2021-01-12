package ru.sastsy.teethproject;
import ru.sastsy.teethproject.Person;

public class User {

    private String login;
    private String email;
    private String password;

    public User(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public User() {

    }

    public Person addPerson(String name) {
        return null;
    }

    public void deletePerson() {

    }

    public void register(String login, String email, String password) {

    }

    public void authorize(String login, String password) {

    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return this.login;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
}

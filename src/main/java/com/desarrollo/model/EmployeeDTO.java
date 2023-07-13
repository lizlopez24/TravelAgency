
package com.desarrollo.model;

public class EmployeeDTO{
    private int id;
    private String name, lastName, cardID, email;
    private String genero;
    private String user;
    private String password;

    public EmployeeDTO(String name, String lastName, String cardID, String email, String genero, String user, String password) {
        this.name = name;
        this.lastName = lastName;
        this.cardID = cardID;
        this.email = email;
        this.genero = genero;
        this.user = user;
        this.password = password;
    }

    public EmployeeDTO(String user, String password) {
        this.user = user;
        this.password = password;
    }

    
    public int getId() {
        return id;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

}
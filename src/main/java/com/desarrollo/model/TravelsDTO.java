/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.desarrollo.model;

import java.sql.Date;

public class TravelsDTO {

    private static final int[][] DESTINATION= {
        {24,20,22},
        {64,60,62},
        {115,110,112},
        {28,24,26},
        {50,45,47},
        {135,130,133},
        {30,25,28},
        {42,38,40},
        {99,90,95}};
    
    private static final int[][] TICKETS={
        {192,170,186},
        {160,150,156},
        {325,310,320}};
    private static final int[][] FOOD={
        {7,4,6},
        {12,10,11},
        {7,3,5},
        {25,15,20}
    };
    
    private static final int[] ADITIONAL={40,80,60};

    private int id;
    private String name;
    private String lastName;
    private String cardID;
    private String phoneNum;
    private String email;
    private String destinationPlace;
    private boolean ticketsA;
    private Date startDate, endDate;
    private int adults, children, jubilate, daysTravel;
    private String hotel, food;
    private boolean aditionalTransport, aditionalGuide, aditionalPlaces;
    private double subtotal;

    public TravelsDTO() {

    }

    public TravelsDTO(String name, String lastName, String cardID, String phoneNum, String email, String destinationPlace, boolean ticketsA, Date startDate, Date endDate, int adults, int children, int jubilate, int daysTravel, String hotel, String food, boolean aditionalTransport, boolean aditionalGuide, boolean aditionalPlaces, double subtotal) {
        this.name = name;
        this.lastName = lastName;
        this.cardID = cardID;
        this.phoneNum = phoneNum;
        this.email = email;
        this.destinationPlace = destinationPlace;
        this.ticketsA = ticketsA;
        this.startDate = startDate;
        this.endDate = endDate;
        this.adults = adults;
        this.children = children;
        this.jubilate = jubilate;
        this.daysTravel = daysTravel;
        this.hotel = hotel;
        this.food = food;
        this.aditionalTransport = aditionalTransport;
        this.aditionalGuide = aditionalGuide;
        this.aditionalPlaces = aditionalPlaces;
        this.subtotal = subtotal;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDestinationPlace() {
        return destinationPlace;
    }

    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    public boolean isTicketsA() {
        return ticketsA;
    }

    public void setTicketsA(boolean ticketsA) {
        this.ticketsA = ticketsA;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getJubilate() {
        return jubilate;
    }

    public void setJubilate(int jubilate) {
        this.jubilate = jubilate;
    }

    public int getDaysTravel() {
        return daysTravel;
    }

    public void setDaysTravel(int daysTravel) {
        this.daysTravel = daysTravel;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public boolean isAditionalTransport() {
        return aditionalTransport;
    }

    public void setAditionalTransport(boolean aditionalTransport) {
        this.aditionalTransport = aditionalTransport;
    }

    public boolean isAditionalGuide() {
        return aditionalGuide;
    }

    public void setAditionalGuide(boolean aditionalGuide) {
        this.aditionalGuide = aditionalGuide;
    }

    public boolean isAditionalPlaces() {
        return aditionalPlaces;
    }

    public void setAditionalPlaces(boolean aditionalPlaces) {
        this.aditionalPlaces = aditionalPlaces;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public static int GET_VALUE_DESTINATION(int hotel, int tipeP){
        return DESTINATION[hotel][tipeP];
    }
    public static int GET_VALUE_TICKET(int destination, int tipeP){
        return TICKETS[destination][tipeP];
    }
    public static int GET_VALUE_FOOD(int food, int tipeP){
        return FOOD[food][tipeP];
    }
    public static int GET_VALUE_ADITIONAL(int tipeExtra){
        return ADITIONAL[tipeExtra];
    }
            
}

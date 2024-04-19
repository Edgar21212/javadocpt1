package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * @author Edgar Astasio
 */
// Hotel class
public class Hotel {
    private String name;
    private String address;
    private String website;
    private HotelCategory category;
    private Manager manager;
    private List<Room> rooms;
    private List<Stay> stays;

    // Constructor, getters, and setters
    
    /**
     * Constructor for the Hotel class.
     * 
     * @param name     The name of the hotel.
     * @param address  The address of the hotel.
     * @param website  The website of the hotel.
     * @param category The category of the hotel (number of stars).
     * @param manager  The manager of the hotel.
     */
    public Hotel(String name, String address, String website, HotelCategory category, Manager manager) {
        this.name = name;
        this.address = address;
        this.website = website;
        this.category = category;
        this.manager = manager;
        this.rooms = new ArrayList<>();
        this.stays = new ArrayList<>();
    }

    // Key constraints
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hotel)) return false;
        Hotel hotel = (Hotel) o;
        return name.equals(hotel.name) && address.equals(hotel.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    // Methods
    /**
     * Adds a stay to the hotel.
     * 
     * @param stay The stay to be added.
     */
    public void addStay(Stay stay) {
        // Implementation goes here
        throw new UnsupportedOperationException("Unimplemented method 'addStay'");
    }

    /**
     * Adds a room to the hotel.
     * 
     * @param room The room to be added.
     */
    public void addRoom(Room room) {
        // Implementation goes here
        throw new UnsupportedOperationException("Unimplemented method 'addRoom'");
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public HotelCategory getCategory() {
        return category;
    }

    public Manager getManager() {
        return manager;
    }
}

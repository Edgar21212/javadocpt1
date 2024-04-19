package com.example;

import java.util.Date;

/**
 * @author Edgar Astasio
 * Main class for managing a hotel chain and its hotels.
 */
public class Main {
    /**
     * The main method for executing the hotel management system.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create hotel category
        HotelCategory hotelCategory = new HotelCategory(4, "4-star hotel");

        // Create manager
        Manager manager = new Manager("Clara Farré", "12345678A", new Date(2013, 6, 1));

        // Create hotel
        Hotel hotel = new Hotel("Aiguaclara", "Carrer Montserrat número 34, Begur (Girona)",
                                "www.aiguaclara.com", hotelCategory, manager);

        // Create French guest couple
        Guest guest1 = new Guest("Sophie Dómine", "43210987B", "French");
        Guest guest2 = new Guest("Logan Rousseau", "98237645C", "French");

        // Create stay
        Stay stay = new Stay(new Date(2024, 6, 13), new Date(2024, 6, 20));

        // Assign guests to stay
        stay.addGuest(guest1);
        stay.addGuest(guest2);

        // Assign stay to hotel
        hotel.addStay(stay);

        // Create double room
        Room room = new Room(110, RoomType.DOUBLE);

        // Assign room to hotel
        hotel.addRoom(room);

        // Display hotel information
        System.out.println("Hotel Information:");
        System.out.println("Name: " + hotel.getName());
        System.out.println("Address: " + hotel.getAddress());
        System.out.println("Category: " + hotel.getCategory().getStarRating() + " stars");
        System.out.println("Manager: " + hotel.getManager().getName());
        System.out.println("Guests:");
        for (Guest guest : stay.getGuests()) {
            System.out.println("- Name: " + guest.getName() + ", ID Document: " + guest.getIdentityDocument()
                    + ", Nationality: " + guest.getNationality());
        }
        System.out.println("Stay: from " + stay.getStartDate() + " to " + stay.getEndDate());
        System.out.println("Room: Number " + room.getNumber() + ", Type: " + room.getType());
    }
}

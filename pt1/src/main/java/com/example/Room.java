package com.example;

/**
 * @author Edgar Astasio
 * Represents a room in a hotel.
 */
public class Room {
    private int number; // Room number
    private RoomType type; // Type of the room
    private Hotel hotel; // Reference to the hotel the room belongs to

    /**
     * Constructor for creating a Room object.
     * @param number The room number.
     * @param type The type of the room.
     */
    public Room(int number, RoomType type) {
        //TODO Auto-generated constructor stub
    }

    /**
     * Checks if this room is equal to another object.
     * @param o The object to compare.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return false;
    }

    /**
     * Retrieves the room number.
     * @return The room number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the room number.
     * @param number The room number to set.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Retrieves the type of the room.
     * @return The room type.
     */
    public RoomType getType() {
        return type;
    }

    /**
     * Sets the type of the room.
     * @param type The room type to set.
     */
    public void setType(RoomType type) {
        this.type = type;
    }

    /**
     * Retrieves the hotel the room belongs to.
     * @return The hotel object.
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * Sets the hotel the room belongs to.
     * @param hotel The hotel object to set.
     */
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}

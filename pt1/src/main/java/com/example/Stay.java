package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Edgar Astasio
 * Class representing a stay at a hotel.
 */
public class Stay {
    private Date checkInDate; // Check-in date
    private Date checkOutDate; // Check-out date
    private List<Guest> guests; // List of guests staying

    /**
     * Constructs a stay with the given check-in and check-out dates.
     * 
     * @param checkInDate  The check-in date of the stay.
     * @param checkOutDate The check-out date of the stay.
     */
    public Stay(Date checkInDate, Date checkOutDate) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guests = new ArrayList<>();
    }

    /**
     * Gets the check-in date of the stay.
     * 
     * @return The check-in date.
     */
    public Date getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the check-in date of the stay.
     * 
     * @param checkInDate The check-in date to set.
     */
    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    /**
     * Gets the check-out date of the stay.
     * 
     * @return The check-out date.
     */
    public Date getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * Sets the check-out date of the stay.
     * 
     * @param checkOutDate The check-out date to set.
     */
    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    /**
     * Gets the list of guests staying during the stay.
     * 
     * @return The list of guests.
     */
    public List<Guest> getGuests() {
        return guests;
    }

    /**
     * Sets the list of guests staying during the stay.
     * 
     * @param guests The list of guests to set.
     */
    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    /**
     * Adds a guest to the list of guests staying during the stay.
     * 
     * @param guest The guest to add.
     */
    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    /**
     * Gets the start date of the stay as a string.
     * 
     * @return The start date of the stay.
     */
    public String getStartDate() {
        // TODO: Implement method to return start date as a string
        throw new UnsupportedOperationException("Unimplemented method 'getStartDate'");
    }

    /**
     * Gets the end date of the stay as a string.
     * 
     * @return The end date of the stay.
     */
    public String getEndDate() {
        // TODO: Implement method to return end date as a string
        throw new UnsupportedOperationException("Unimplemented method 'getEndDate'");
    }
}

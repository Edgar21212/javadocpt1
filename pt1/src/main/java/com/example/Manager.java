package com.example;

import java.util.Date;

/**
 * @author Edgar Astasio
 * Represents a manager in the hotel management system.
 */
public class Manager extends Person {
    private int experienceYears;

    /**
     * Constructor for creating a Manager object.
     * @param name The name of the manager.
     * @param idDocument The identification document of the manager.
     * @param experienceYears The years of experience of the manager.
     */
    public Manager(String name, String idDocument, int experienceYears) {
        super(name, idDocument);
        this.experienceYears = experienceYears;
    }

    /**
     * Constructor for creating a Manager object with a specific start date.
     * @param name The name of the manager.
     * @param idDocument The identification document of the manager.
     * @param date The start date of the manager.
     */
    public Manager(String name, String idDocument, Date date) {
        super(name, idDocument);
    }        

    /**
     * Retrieves the years of experience of the manager.
     * @return The years of experience.
     */
    public int getExperienceYears() {
        return experienceYears;
    }

    /**
     * Sets the years of experience of the manager.
     * @param experienceYears The years of experience to set.
     */
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    /**
     * Retrieves the name of the manager.
     * @return The name of the manager.
     */
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}

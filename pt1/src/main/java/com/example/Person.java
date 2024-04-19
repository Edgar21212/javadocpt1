package com.example;

import java.util.Objects;

/**
 * @author Edgar Astasio
 * Represents a person in the hotel management system.
 */
public class Person {
    private String identifier; // Unique identifier

    /**
     * Constructor for creating a Person object.
     * @param name The name of the person.
     * @param idDocument The identification document of the person.
     */
    public Person(String name, String idDocument) {
        //TODO Auto-generated constructor stub
    }

    /**
     * Checks if this person is equal to another object based on their identifiers.
     * @param o The object to compare.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return identifier.equals(person.identifier);
    }

    /**
     * Generates a hash code for this person based on their identifier.
     * @return The hash code value.
     */
    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }

    /**
     * Retrieves the identifier of the person.
     * @return The identifier.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the identifier of the person.
     * @param identifier The identifier to set.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}

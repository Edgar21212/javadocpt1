package com.example;

/**
 * @author Edgar Astasio
 * Class representing a guest with a specific nationality.
 * Extends the Person class.
 */
public class Guest extends Person {
    private String nationality;

    /**
     * Constructor for the Guest class.
     *
     * @param name         The name of the guest.
     * @param idDocument   The identity document of the guest.
     * @param nationality  The nationality of the guest.
     */
    public Guest(String name, String idDocument, String nationality) {
        super(name, idDocument);
        this.nationality = nationality;
    }

    /**
     * Getter method for the nationality attribute.
     *
     * @return The nationality of the guest.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Setter method for the nationality attribute.
     *
     * @param nationality The new nationality of the guest.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Getter method for the identity document of the guest.
     * This method is not implemented in the Guest class and throws an
     * UnsupportedOperationException.
     *
     * @return The identity document of the guest.
     */
    public String getIdentityDocument() {
        throw new UnsupportedOperationException("Unimplemented method 'getIdentityDocument'");
    }

    /**
     * Getter method for the name of the guest.
     * This method is not implemented in the Guest class and throws an
     * UnsupportedOperationException.
     *
     * @return The name of the guest.
     */
    public String getName() {
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}


   


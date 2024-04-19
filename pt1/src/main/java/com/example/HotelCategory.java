package com.example;



/**
 * @author Edgar Astasio
 * Represents the category of a hotel.
 */
public class HotelCategory {
    private int starRating;
    private String description;

    /**
     * Constructs a new HotelCategory with the specified star rating and description.
     *
     * @param starRating   the star rating of the hotel category
     * @param description  the description of the hotel category
     */
    public HotelCategory(int starRating, String description) {
        this.starRating = starRating;
        this.description = description;
    }

    /**
     * Retrieves the star rating of the hotel category.
     *
     * @return the star rating
     */
    public int getStarRating() {
        return starRating;
    }

    /**
     * Sets the star rating of the hotel category.
     *
     * @param starRating the new star rating to set
     */
    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    /**
     * Retrieves the description of the hotel category.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the hotel category.
     *
     * @param description the new description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}

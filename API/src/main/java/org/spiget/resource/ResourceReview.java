package org.spiget.resource;

import org.spiget.user.User;

public class ResourceReview {

    private final User user;
    private final Resource resource;
    private double rating;
    private final String comment;

    public ResourceReview(User user, Resource resource, double rating, String comment) {
        this.user = user;
        this.resource = resource;
        this.rating = rating;
        this.comment = comment;
    }

    public double getRating() {
        return rating;
    }

    public Resource getResource() {
        return resource;
    }

    public String getComment() {
        return comment;
    }

    public User getUser() {
        return user;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

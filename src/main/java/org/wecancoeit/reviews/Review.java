package org.wecancoeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
@Id
@GeneratedValue

    private Long id;
    private String title;
    private String image;
    private String reviewType;
    private String description;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getReviewType() {
        return reviewType;
    }

    public String getDescription() {
        return description;
    }

    public Review(long id, String title, String image, String reviewType, String description) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.reviewType = reviewType;
        this.description = description;
    }


}


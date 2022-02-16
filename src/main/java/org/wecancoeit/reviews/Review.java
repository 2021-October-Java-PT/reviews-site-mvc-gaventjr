package org.wecancoeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
@Id
@GeneratedValue

    private Long id;
    private String name;
    private String image;
    private String reviewType;
    private String description;



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public Review(long id, String name, String image, String reviewType, String description) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.reviewType = reviewType;
        this.description = description;
    }


}


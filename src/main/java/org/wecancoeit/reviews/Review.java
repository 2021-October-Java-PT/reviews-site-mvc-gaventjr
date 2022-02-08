package org.wecancoeit.reviews;

public class Review {


    private Long id;
    private String title;
    private String image;
    private String reviewType;
    private String description;

    public Review(long id, String title, String image, String reviewType, String description) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.reviewType = reviewType;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getReviewCategory() {
        return reviewType;
    }

    public String getContent() {
        return description;
    }
}


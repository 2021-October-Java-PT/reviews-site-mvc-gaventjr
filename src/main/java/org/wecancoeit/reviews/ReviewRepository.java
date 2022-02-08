package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

@Repository

public class ReviewRepository {
    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review Dragoon = new Review(1l, "The Legend of Dragoon","", "RPG", "");
        Review Trigger = new Review(2l, "Chrono Trigger","", "RPG", "");
        Review War = new Review(3l, "God of War","i", "Action/Adventure", "");
        Review Borderlands = new Review(4l, "Borderlands 2","", "Shooter", "");

        reviewList.put(Dragoon.getId(), Dragoon);
        reviewList.put(Trigger.getId(), Trigger);
        reviewList.put(War.getId(), War);
        reviewList.put(Borderlands.getId(), Borderlands);
    }


    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewList.put(review.getId(), review);
        }
    }

    public Review findOneReview(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAllReviews() {
        return reviewList.values();
    }



}

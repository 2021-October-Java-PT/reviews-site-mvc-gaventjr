package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

@Repository

public class ReviewRepository {
    Map<Long, Review> reviewList = new HashMap<>();

        Review Dragoon = new Review(1l, "The Legend of Dragoon", "", "RPG", "One of my favorite RPG's(Role-Playing games of all time! With an action combat system that keeps you on your toes, and a difficult final boss");
        Review Trigger = new Review(2l, "Chrono Trigger", "", "RPG", "");
        Review War = new Review(3l, "God of War", "", "Action/Adventure", "");
        Review Borderlands = new Review(4l, "Borderlands 2", "", "Shooter", "");

        public ReviewRepository() {
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

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }



}

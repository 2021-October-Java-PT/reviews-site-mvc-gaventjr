package org.wecancoeit.reviews;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    @Test

    public void shouldFindOneReview() {
        Review oneReview = new Review(1L, "Game Name", "Game image", "Game Review", "Game Description");
        ReviewRepository underTest = new ReviewRepository(oneReview);
        Review foundReview = underTest.findOne(1L);
        assertEquals(oneReview, foundReview);
    }



}

package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

@Controller
public class reviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/")
    public String homePage() {return "home";}


    @RequestMapping("/reviews")
    public String findAllReviews(Model model) {
        model.addAttribute("reviewModel", reviewRepo.findAll());
        return "templates/reviewsTemplate.html";
    }

    @RequestMapping("/review/{id}")
    public String findOneReview(@PathVariable Long id, Model model)  {
        model.addAttribute("reviewModel", reviewRepo.findOne(id));
        return "templates/reviewTemplate.html";
    }
}

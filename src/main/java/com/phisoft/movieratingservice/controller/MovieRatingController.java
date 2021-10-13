package com.phisoft.movieratingservice.controller;

import com.phisoft.movieratingservice.dto.Rating;
import com.phisoft.movieratingservice.dto.UserRating;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {
    @Value("${tony.name}")
    private String message;

    @GetMapping("/{id}")
    public Rating gatRating(@PathVariable("id") String id){
        return new Rating(id,10);
    }
    @GetMapping("/users/{id}")
    public UserRating getRating(@PathVariable("id") String id){
    List<Rating>ratingList= Arrays.asList(new Rating("1",1),new Rating("2",2));
      UserRating userRating=new UserRating();
      userRating.setRatings(ratingList);
      return userRating;
    }

    @GetMapping("/pol")
    public String getMessage(){
        return message;
    }
}

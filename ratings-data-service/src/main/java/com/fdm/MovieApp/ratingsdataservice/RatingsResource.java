package com.fdm.MovieApp.ratingsdataservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fdm.MovieApp.Models.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

     @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }
}
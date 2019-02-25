package com.fdm.MovieApp.moviecatalogservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fdm.MovieApp.Models.CatalogItem;
import com.fdm.MovieApp.Models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	{
		System.out.println("You FOund Me");
	}

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		List<Rating> ratingsList = Arrays.asList(
                new Rating("1234", 3),
                new Rating("5678", 4)
        );	
		
		return ratingsList.stream()
                .map(rating -> new CatalogItem("Name", "Desc", rating.getRating()))
                .collect(Collectors.toList());

	}

}
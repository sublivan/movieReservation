package com.sublivan.movie.controller;

import com.sublivan.movie.dto.Movie;
import com.sublivan.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    public MovieService movieService;

    @GetMapping("/movieList")
    public ModelAndView movieList() {
        ModelAndView mv = new ModelAndView("movieList");

        List<Movie> movieList = movieService.findAll();
        mv.addObject("movieList", movieList);

        return mv;
    }
}

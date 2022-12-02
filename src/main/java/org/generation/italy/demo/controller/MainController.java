package org.generation.italy.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.generation.italy.demo.pojo.Movie;
import org.generation.italy.demo.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String getHome() {
		
		return "home";
	}
	
	@GetMapping("/best-song")
	public String getBestSong(Model model) {
		
		List<Song> songs = new ArrayList<>();
		songs.add(new Song(1, "song 1"));
		songs.add(new Song(3, "song 3"));
		songs.add(new Song(6, "song 6"));
		songs.add(new Song(8, "song 8"));
		
		model.addAttribute("songs", songs);
		
		return "best_song";
	}
	
	@GetMapping("/best-movie")
	public String getBestMovie(Model model) {
		
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1, "movie 1"));
		movies.add(new Movie(2, "movie 2"));
		movies.add(new Movie(5, "movie 5"));
		movies.add(new Movie(9, "movie 9"));
		
		model.addAttribute("movies", movies);
		
		return "best_movie";
	}
}

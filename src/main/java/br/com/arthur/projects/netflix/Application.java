package br.com.arthur.projects.netflix;

import java.util.Scanner;

import br.com.arthur.projects.netflix.model.Movie;
import br.com.arthur.projects.netflix.repository.Repository;
import br.com.arthur.projects.netflix.repository.impl.RepositoryImpl;
import br.com.arthur.projects.netflix.service.MovieService;
import br.com.arthur.projects.netflix.service.impl.MovieServiceImpl;

public class Application
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Repository<Movie> repo = new RepositoryImpl<>();
		MovieService fs = new MovieServiceImpl(repo);
		Movie movie1 = new Movie();
		Movie movie1new = new Movie();
		
		movie1.setName("The Fast and the Furious");
		movie1.setYearRelease(2001);
		movie1.setId(1L);		
		System.out.println(fs.saveMovie(movie1));
		System.out.println(fs.findAllMovies());
		
		movie1new.setName("Need for Speed");
		movie1new.setYearRelease(2014);
		movie1new.setId(1L);
		System.out.println(fs.updateMovie(movie1new));
		System.out.println(fs.findAllMovies());
		
		System.out.println(fs.deleteMovie(1L));
		System.out.println(fs.findAllMovies());
	}
}
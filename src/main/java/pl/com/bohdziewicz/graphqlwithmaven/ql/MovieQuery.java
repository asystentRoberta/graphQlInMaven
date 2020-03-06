package pl.com.bohdziewicz.graphqlwithmaven.ql;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import pl.com.bohdziewicz.graphqlwithmaven.MovieService;
import pl.com.bohdziewicz.graphqlwithmaven.dao.Movie;

@Component
public class MovieQuery implements GraphQLQueryResolver {

    private MovieService movieService;

    MovieQuery(MovieService movieService) {

        this.movieService = movieService;
    }

    public List<Movie> getMovies(int limitFilms) {

        return movieService.getMovies(limitFilms);
    }
}

package pl.com.bohdziewicz.graphqlwithmaven.ql;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import pl.com.bohdziewicz.graphqlwithmaven.MovieService;
import pl.com.bohdziewicz.graphqlwithmaven.dao.Movie;

@Component
public class MovieCreator implements GraphQLMutationResolver {

    private MovieService movieService;

    public MovieCreator(MovieService movieService) {

        this.movieService = movieService;
    }

    public Movie createMovie(String title, String genre){
        return movieService.save(title, genre);
    }
}

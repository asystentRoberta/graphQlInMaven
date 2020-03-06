package pl.com.bohdziewicz.graphqlwithmaven;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import pl.com.bohdziewicz.graphqlwithmaven.dao.Movie;
import pl.com.bohdziewicz.graphqlwithmaven.dao.MovieRepo;

@Service
public class MovieService {

    private MovieRepo movieRepo;

    MovieService(MovieRepo movieRepo) {

        this.movieRepo = movieRepo;
    }

    public List<Movie> getMovies(int limitFilms) {

        return movieRepo.findAll().stream().limit(limitFilms).collect(Collectors.toList());
    }

    @EventListener(ApplicationReadyEvent.class)
    public void createSomeObjectsInDataBase() {

        movieRepo.save(new Movie("Heat", "crime"));
        movieRepo.save(new Movie("Above zero", "comedy"));
        movieRepo.save(new Movie("And one more", "thiller"));
    }
}

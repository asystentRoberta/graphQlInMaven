package pl.com.bohdziewicz.graphqlwithmaven.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie, Long> {

}

package com.revature.moviereview.Repository;

import com.revature.moviereview.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}

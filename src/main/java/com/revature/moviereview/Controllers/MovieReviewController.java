package com.revature.moviereview.Controllers;
import com.revature.moviereview.Model.Comment;
import com.revature.moviereview.Model.Movie;
import com.revature.moviereview.Services.MovieReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class MovieReviewController {
    private final MovieReviewService mrs;

    public MovieReviewController(MovieReviewService mrs) {
        this.mrs = mrs;
    }

    @GetMapping ("/")
    public String getHelloWorld(){return "HelloWorld";}

    @GetMapping ("/movie")
    public List<Movie> getAllMovies() {
        return mrs.getAllMovies();
    }

    @PostMapping ("/movie")
    public Movie postMovie(@RequestBody Movie movie) {
        return mrs.postMovie(movie);
    }

    @GetMapping ("/comment")
    public List<Comment> getAllComments() {
        return mrs.getAllComments();
    }

    @PostMapping ("/comment")
    public Comment postComment(@RequestBody Comment comment) {
        return mrs.postComment(comment);
    }

    @GetMapping ("/comment/{id}")
    public List<Comment> getCommentByMovie(@PathVariable int id){
        return mrs.getCommentByMovie(id);
    }

    @GetMapping ("/movie/{id}")
    public Movie getMovieById(@PathVariable int id){
        return mrs.getMovieById(id);
    }

}

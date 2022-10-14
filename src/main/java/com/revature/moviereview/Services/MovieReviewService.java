package com.revature.moviereview.Services;

import com.revature.moviereview.Model.Comment;
import com.revature.moviereview.Model.Movie;
import com.revature.moviereview.Repository.CommentRepository;
import com.revature.moviereview.Repository.MovieRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieReviewService {

    private MovieRepository mr;
    private CommentRepository cr;

    public MovieReviewService(MovieRepository mr, CommentRepository cr) {
        this.mr = mr;
        this.cr = cr;
    }



    public List<Movie> getAllMovies() {
        return mr.findAll();
    }


    public Movie postMovie(Movie movie) {
        return mr.save(movie);
    }

    public List<Comment> getAllComments() {
        return cr.findAll();
    }

    public Comment postComment(Comment comment) {
        return cr.save(comment);
    }

    public List<Comment> getCommentByMovie(int id) {
        return cr.findCommentByMovieId(id);
    }

    public Movie getMovieById(int id) {
        return mr.findById(id).get();
    }
}

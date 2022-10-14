package com.revature.moviereview.Repository;

import com.revature.moviereview.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findCommentByMovieId(int movieId);
}

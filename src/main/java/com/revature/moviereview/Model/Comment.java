package com.revature.moviereview.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;

    @Column
    private String message;

    @Column
    private Integer movieId;

    @Column
    private Integer parentId;

    @OneToMany
    @JoinColumn(name = "parentId")
    private List<Comment> replies;

}

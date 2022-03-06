package com.carepay.assignment.domain.entities;

import com.carepay.assignment.domain.Post;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * @author tobioye 06/03/2022
 */
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name="post_id", nullable=false)
    private Post post;
    @Length(max = 160)
    private String comment;

    public Comment() {
    }

    public Comment(Long id, Post post, String comment) {
        this.id = id;
        this.post = post;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

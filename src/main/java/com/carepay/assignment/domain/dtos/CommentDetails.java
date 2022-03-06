package com.carepay.assignment.domain.dtos;

/**
 * @author tobioye 06/03/2022
 */
public class CommentDetails {
    private Long id;
    private Long post_id;
    private String comment;

    public CommentDetails() {
    }

    public CommentDetails(Long id, Long post_id, String comment) {
        this.id = id;
        this.post_id = post_id;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPost_id() {
        return post_id;
    }

    public void setPost_id(Long post_id) {
        this.post_id = post_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

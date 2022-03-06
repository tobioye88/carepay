package com.carepay.assignment.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author tobioye 06/03/2022
 */
public class CreateCommentRequest {
    @NotNull
    private Long id;
    @NotNull
    private Long post_id;
    @NotNull
    @Size(max = 160)
    private String comment;

    public CreateCommentRequest() {
    }

    public CreateCommentRequest(Long id, Long post_id, String comment) {
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

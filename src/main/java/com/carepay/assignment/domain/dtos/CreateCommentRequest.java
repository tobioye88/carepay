package com.carepay.assignment.domain.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author tobioye 06/03/2022
 */
public class CreateCommentRequest {
    @NotNull
    @Size(max = 160)
    private String comment;

    public CreateCommentRequest() {
    }

    public CreateCommentRequest(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

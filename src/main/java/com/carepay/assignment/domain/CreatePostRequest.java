package com.carepay.assignment.domain;

import javax.validation.constraints.NotNull;

public class CreatePostRequest {
    @NotNull
    private String title;
    @NotNull
    private String content;

    public CreatePostRequest() {
    }

    public CreatePostRequest(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

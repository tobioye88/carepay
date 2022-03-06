package com.carepay.assignment.domain.dtos;

public class PostInfo {
    private Long id;
    private String title;

    public PostInfo() {
    }

    public PostInfo(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

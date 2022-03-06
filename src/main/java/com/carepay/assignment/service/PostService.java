package com.carepay.assignment.service;

import javax.validation.Valid;

import com.carepay.assignment.domain.dtos.CreatePostRequest;
import com.carepay.assignment.domain.dtos.PostDetails;
import com.carepay.assignment.domain.dtos.PostInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {
    PostDetails createPost(@Valid CreatePostRequest createPostRequest);

    Page<PostInfo> getPosts(final Pageable pageable);

    PostDetails getPostDetails(Long id);

    void deletePost(Long id);
}

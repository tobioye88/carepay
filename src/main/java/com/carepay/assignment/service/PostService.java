package com.carepay.assignment.service;

import javax.validation.Valid;

import com.carepay.assignment.domain.CreatePostRequest;
import com.carepay.assignment.domain.PostDetails;
import com.carepay.assignment.domain.PostInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {
    PostDetails createPost(@Valid CreatePostRequest createPostRequest);

    Page<PostInfo> getPosts(final Pageable pageable);

    PostDetails getPostDetails(Long id);

    void deletePost(Long id);
}

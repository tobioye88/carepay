package com.carepay.assignment.service;

import com.carepay.assignment.domain.dtos.CommentDetails;
import com.carepay.assignment.domain.dtos.CreateCommentRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;

/**
 * @author tobioye 06/03/2022
 */
public interface CommentService {
    CommentDetails createComment(Long id, @Valid CreateCommentRequest createCommentRequest);

    Page<CommentDetails> getComments(final Pageable pageable);

    CommentDetails getPostDetails(Long id);

    void deleteComment(Long id);
}

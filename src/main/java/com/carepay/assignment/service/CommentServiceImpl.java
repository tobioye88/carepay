package com.carepay.assignment.service;

import com.carepay.assignment.domain.CommentDetails;
import com.carepay.assignment.domain.CreateCommentRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author tobioye 06/03/2022
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Override
    public CommentDetails createComment(Long id, CreateCommentRequest createCommentRequest) {
        return null;
    }

    @Override
    public Page<CommentDetails> getComments(Pageable pageable) {
        return null;
    }

    @Override
    public CommentDetails getPostDetails(Long id) {
        return null;
    }

    @Override
    public void deleteComment(Long id) {

    }
}

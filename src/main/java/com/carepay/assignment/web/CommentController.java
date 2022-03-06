package com.carepay.assignment.web;

import com.carepay.assignment.domain.CommentDetails;
import com.carepay.assignment.domain.CreateCommentRequest;
import com.carepay.assignment.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author tobioye 06/03/2022
 */
@RestController
@RequestMapping(path = "/posts/{postId}/comments", produces = MediaType.APPLICATION_JSON_VALUE)
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    CommentDetails getComments(@PathVariable("postId") final Long postId, CreateCommentRequest request) {
        return commentService.createComment(postId, request);
    }
}

package com.carepay.assignment.service;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import com.carepay.assignment.domain.CreatePostRequest;
import com.carepay.assignment.domain.Post;
import com.carepay.assignment.domain.PostDetails;
import com.carepay.assignment.domain.PostInfo;
import com.carepay.assignment.repository.PostRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDetails createPost(@Valid CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setContent(createPostRequest.getContent());
        post.setTitle(createPostRequest.getTitle());

        post = postRepository.save(post);
        return new PostDetails(post.getId(), post.getTitle(), post.getContent());
    }

    @Override
    public Page<PostInfo> getPosts(Pageable pageable) {
        Page<Post> all = postRepository.findAll(pageable);
        return all.map(el -> new PostInfo(el.getId(), el.getTitle()));
    }

    @Override
    public PostDetails getPostDetails(Long id) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if(!optionalPost.isPresent()){
            throw new EntityNotFoundException(String.format("Post with id: %d not found", id));
        }
        Post post = optionalPost.get();
        return new PostDetails(post.getId(), post.getTitle(), post.getContent());
    }

    @Override
    public void deletePost(Long id) {
        getPostDetails(id);
        postRepository.deleteById(id);
    }
}

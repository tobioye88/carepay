package com.carepay.assignment.repository;

import com.carepay.assignment.domain.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tobioye 06/03/2022
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}

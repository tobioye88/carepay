# CarePay Java Assignment

## Introduction
This assignment consists of two parts:
1) Write a SpringBoot/Java restful backend;
2) Review some code

Your assignment is to write a Java application with a restful backend, which supports storing blog posts.
Each blog post should at least contain 'title' and 'content' fields, but you're free to add more fields. 
The application should be developed using Java and Spring-Boot, you can use the provided template project as a starter.

The restful backend should support the following endpoints:

| Method  | Path | Description   |
|---|---|---|
| GET  | /posts  | Returns a paginated list of posts, including only the `id` and `title` |
| POST | /posts  | Adds a new post  |
| GET  | /posts/{id} | Retrieves the full details of a single post  |
| DELETE  | /posts/{id} | Deletes a post |

And for comments:

| Method  | Path | Description   |
|---|---|---|
| GET  | /posts/{id}/comments  | Returns a paginated list of comments for a post |
| POST | /posts/{id}/comments  | Adds a new comment to a post  |
| GET  | /posts/{id}/comments/{id} | Retrieves the full details of a single comment  |
| DELETE  | /posts/{id}/comments/{id} | Deletes a comment |

## Tasks
1) Implement the missing parts of the application
2) Add support to store Comments on a Post. Each post can have many Comments

## Instructions
Use the following to run: `./gradlew bootRun`

To run the tests, use `./gradlew check`

## Providing review comments
Please have a look at the [review assignment](REVIEW-ASSIGNMENT.md) and provide comments.

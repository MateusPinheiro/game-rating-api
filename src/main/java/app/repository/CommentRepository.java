package app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import app.model.Comment;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {

}

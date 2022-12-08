package no.sbsivertsen.learningspring.repository;

import no.sbsivertsen.learningspring.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}

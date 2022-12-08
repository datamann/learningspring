package no.sbsivertsen.learningspring.repository;

import no.sbsivertsen.learningspring.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {
}

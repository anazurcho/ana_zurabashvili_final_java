package ana.zurabashvili.bookstore.repository;

import ana.zurabashvili.bookstore.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    
}

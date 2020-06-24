package ana.zurabashvili.bookstore.repository;

import ana.zurabashvili.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

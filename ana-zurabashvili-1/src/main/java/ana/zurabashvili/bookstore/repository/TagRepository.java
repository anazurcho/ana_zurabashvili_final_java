package ana.zurabashvili.bookstore.repository;

import ana.zurabashvili.bookstore.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}

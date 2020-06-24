package ana.zurabashvili.bookstore.repository;
import ana.zurabashvili.bookstore.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

}

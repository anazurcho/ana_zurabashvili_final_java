package ana.zurabashvili.bookstore.model;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String pdfUr;

    @ToString.Exclude
    @OneToOne(mappedBy = "attachment", cascade = CascadeType.ALL)
    Book book;
}

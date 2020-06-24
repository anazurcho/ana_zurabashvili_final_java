package ana.zurabashvili.bookstore.model;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;

    @ToString.Exclude
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    List<Tag> tags=new ArrayList<>();

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    List<Author> authors=new ArrayList<>();

    @ToString.Exclude
    @OneToOne(cascade = CascadeType.ALL)
    Attachment attachment;
}

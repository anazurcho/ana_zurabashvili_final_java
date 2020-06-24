package ana.zurabashvili.bookstore.model;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String secondName;

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    List<Book> books =new ArrayList<>();
}

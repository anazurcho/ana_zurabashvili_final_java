package ana.zurabashvili.bookstore;

import ana.zurabashvili.bookstore.model.Book;
import ana.zurabashvili.bookstore.model.Tag;
import ana.zurabashvili.bookstore.repository.AttachmentRepository;
import ana.zurabashvili.bookstore.repository.AuthorRepository;
import ana.zurabashvili.bookstore.repository.BookRepository;
import ana.zurabashvili.bookstore.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    TagRepository tagRepository;


    @GetMapping("test")
    public void test(){
        Book book =new Book();
        book.setTitle("სატესტო Book!");
        book.setDescription("სატესტო აღწერა");
        bookRepository.save(book);
        System.out.println("Ok");
    }


    @GetMapping("addTag")
    public void addTag(){
        Tag tag=new Tag();
        tag.setName("ისტორიული");
        tag.setBook(bookRepository.getOne(2L));
        tagRepository.save(tag);
    }

    

}

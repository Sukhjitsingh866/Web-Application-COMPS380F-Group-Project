package hkmu.comps380f.project.controller;

import hkmu.comps380f.project.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import hkmu.comps380f.project.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/index")
    public String index(Model model) {
        List<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "home_page";
    }





    private List<Book> getSampleBooks(){
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setTitle("First book");
        book1.setAuthor("author 1");
        book1.setPrice(19.99);
        book1.setDescription("Description of the book 1");
        book1.setCoverPhotoUrl("");
        book1.setAvailable(true);
        books.add(book1);

        Book book2 = new Book();
        book2.setTitle("Second book");
        book2.setAuthor("author 2");
        book2.setPrice(24.99);
        book2.setDescription("Description of the book 2");
        book2.setCoverPhotoUrl("");
        book2.setAvailable(false);
        books.add(book2);

        return books;
    }
}

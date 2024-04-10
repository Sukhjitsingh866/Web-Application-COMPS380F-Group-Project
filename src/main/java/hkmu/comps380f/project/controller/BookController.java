package hkmu.comps380f.project.controller;


import hkmu.comps380f.project.repository.BookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import hkmu.comps380f.project.model.Book;

import java.util.List;

@Controller
public class BookController {

    @Resource
    private BookService bookService;

    @GetMapping("/index")
    public String index(Model model) {
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "home_page";
    }
}


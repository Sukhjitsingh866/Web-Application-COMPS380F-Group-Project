package hkmu.comps380f.project.repository;

import hkmu.comps380f.project.exception.BookNotFound;
import hkmu.comps380f.project.model.Book;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Resource
    private BookRepository bookRepository;

    @Transactional
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Transactional
    public Book getBook(Long id) throws BookNotFound {
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null) {
            throw new BookNotFound(id);
        }
        return book;
    }

    @Transactional
    public long createBook(String title, String author, double price, String description, String coverPhotoUrl, boolean available) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);
        book.setDescription(description);
        book.setCoverPhotoUrl(coverPhotoUrl);
        book.setAvailable(available);
        Book savedBook = bookRepository.save(book);
        return savedBook.getId();
    }

    @Transactional(rollbackFor = BookNotFound.class)
    public void deleteBook(Long id) throws BookNotFound {
        Book deletedBook = bookRepository.findById(id).orElse(null);
        if (deletedBook == null) {
            throw new BookNotFound(id);
        }
        bookRepository.delete(deletedBook);
    }
}


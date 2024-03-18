package hkmu.comps380f.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import hkmu.comps380f.project.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}


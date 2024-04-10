package hkmu.comps380f.project.repository;



import hkmu.comps380f.project.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}


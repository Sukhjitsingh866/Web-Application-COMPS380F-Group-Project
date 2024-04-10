package hkmu.comps380f.project.exception;

import java.util.UUID;

public class BookNotFound extends Exception {
    public BookNotFound(Long id) {
        super("Book " + id + " does not exist.");
    }
}

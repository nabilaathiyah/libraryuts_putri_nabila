package id.ac.uin.student.forgot.databuku.service.implementation;

import id.ac.uin.student.forgot.databuku.service.framework.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private final id.ac.uin.student.forgot.databuku.repository.BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(id.ac.uin.student.forgot.databuku.repository.BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<id.ac.uin.student.forgot.databuku.entity.Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<id.ac.uin.student.forgot.databuku.entity.Book> findById(Long id) {
        return bookRepository.findById(id);
    }

//    @Override
//    public Optional<id.ac.uin.student.forgot.databuku.entity.Book> findByEmail(String email) {
//        return bookRepository.findByEmail(email);
//    }

    @Override
    public id.ac.uin.student.forgot.databuku.entity.Book save(id.ac.uin.student.forgot.databuku.entity.Book std) {
        return bookRepository.save(std);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}

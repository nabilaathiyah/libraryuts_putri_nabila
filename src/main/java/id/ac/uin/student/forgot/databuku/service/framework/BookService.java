package id.ac.uin.student.forgot.databuku.service.framework;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<id.ac.uin.student.forgot.databuku.entity.Book> getAllBook();

    Optional<id.ac.uin.student.forgot.databuku.entity.Book> findById(Long id);

//    Optional<id.ac.uin.student.forgot.databuku.entity.Book> findByEmail(String email);

    id.ac.uin.student.forgot.databuku.entity.Book save(id.ac.uin.student.forgot.databuku.entity.Book std);

    void deleteById(Long id);
}

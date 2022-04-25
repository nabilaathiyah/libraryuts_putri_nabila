package id.ac.uin.student.forgot.databuku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<id.ac.uin.student.forgot.databuku.entity.Book, Long> {

    // Query method
//    Optional<id.ac.uin.student.forgot.databuku.entity.Book> findByEmail(String email);
}

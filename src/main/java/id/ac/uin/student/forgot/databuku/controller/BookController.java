package id.ac.uin.student.forgot.databuku.controller;

import id.ac.uin.student.forgot.databuku.service.framework.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class BookController {
    private final BookService bookservice;

    @Autowired
    public BookController(BookService bookservice) {
        this.bookservice = bookservice;
    }

    @GetMapping
    public List<id.ac.uin.student.forgot.databuku.entity.Book> getAllBook() {
        return bookservice.getAllBook();
    }

    @GetMapping(value = "/{id}")
    public id.ac.uin.student.forgot.databuku.entity.Book getBookById(@PathVariable("id") @Min(1) Long id) {
        id.ac.uin.student.forgot.databuku.entity.Book std = bookservice.findById(id)
                .orElseThrow(() -> new id.ac.uin.student.forgot.databuku.exception.BookNotFoundException("Student with " + id + " is Not Found!"));
        return std;
    }

    @PostMapping
    public id.ac.uin.student.forgot.databuku.entity.Book addBook(@Valid @RequestBody id.ac.uin.student.forgot.databuku.entity.Book std) {
        return bookservice.save(std);
    }

    @PutMapping(value = "/{id}")
    public id.ac.uin.student.forgot.databuku.entity.Book updateBook(@PathVariable("id") @Min(1) Long id, @Valid @RequestBody id.ac.uin.student.forgot.databuku.entity.Book newStd) {
        id.ac.uin.student.forgot.databuku.entity.Book book = bookservice.findById(id)
                .orElseThrow(() -> new id.ac.uin.student.forgot.databuku.exception.BookNotFoundException("Student with " + id + " is Not Found!"));
        book.setNamaBuku(newStd.getNamaBuku());
        book.setNamaPengarang(newStd.getNamaPengarang());
        book.setPenerbit(newStd.getPenerbit());
        book.setTahunTerbit(newStd.getTahunTerbit());
        book.setTebalBuku(newStd.getTebalBuku());
        book.setRating(newStd.getRating());
        book.setStokBuku(newStd.getStokBuku());
        return bookservice.save(book);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteBook(@PathVariable("id") @Min(1) Long id) {
        id.ac.uin.student.forgot.databuku.entity.Book std = bookservice.findById(id)
                .orElseThrow(() -> new id.ac.uin.student.forgot.databuku.exception.BookNotFoundException("Student with " + id + " is Not Found!"));
        bookservice.deleteById(std.getId());
        return "Student with ID :" + id + " is deleted";
    }
}

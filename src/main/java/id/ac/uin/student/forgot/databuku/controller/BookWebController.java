package id.ac.uin.student.forgot.databuku.controller;

import id.ac.uin.student.forgot.databuku.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class BookWebController {
    private BookService bookService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("book", bookService.getAllBook());
        return "index2";
    }

    @GetMapping(value = "/create")
    public String create1(Model model) {
        model.addAttribute("book", new id.ac.uin.student.forgot.databuku.entity.Book());
        return "formBook";
    }

    @PostMapping(value = "/create")
    public String tambahStudent(Model model, id.ac.uin.student.forgot.databuku.entity.Book book) {
        model.addAttribute("book", bookService.save(book));
        return "redirect:/";
    }

    @GetMapping(value = "/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        return "formBook";
    }

    @GetMapping(value = "/hapus/{id}")
    public String hapusStudent(@PathVariable Long id) {
        bookService.deleteById(id);
        return "redirect:/";
    }
}

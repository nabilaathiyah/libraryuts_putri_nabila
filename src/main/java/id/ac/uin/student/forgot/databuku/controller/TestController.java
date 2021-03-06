package id.ac.uin.student.forgot.databuku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TestController {
    @GetMapping("/test1")
    public String getForm(id.ac.uin.student.forgot.databuku.entity.Book book) {
        return "index2";
    }

    @PostMapping("/save-student")
    public String submitStudentDetails(@Valid id.ac.uin.student.forgot.databuku.entity.Book book, Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            return "index2";
        } else {
            model.addAttribute("successMsg", "Details saved successfully!!");
            return "success";
        }
    }
}

package id.ac.uin.student.forgot.databuku.service.framework;

import id.ac.uin.student.forgot.databuku.entity.Mail;

public interface EmailService {
    void send(Mail mail);
}
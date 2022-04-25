package id.ac.uin.student.forgot.databuku.service.framework;

import id.ac.uin.student.forgot.databuku.entity.PasswordResetToken;

public interface PasswordResetTokenService {
    PasswordResetToken findByToken(String token);

    PasswordResetToken save(PasswordResetToken passwordResetToken);
}

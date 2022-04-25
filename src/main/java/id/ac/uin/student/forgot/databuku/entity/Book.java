package id.ac.uin.student.forgot.databuku.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Kolom wajib diisi")
    @NotNull(message = "Nama buku harus diisi!!")
    @Column(nullable = false, name = "NamaBuku")
    private String NamaBuku;

    @NotEmpty(message = "Kolom wajib diisi")
    @NotNull(message = "Nama Pengarang wajib diisi!!")
    @Column(nullable = false, name = "NamaPengarang")
    private String NamaPengarang;

    @NotEmpty(message = "Kolom wajib diisi")
    @NotNull(message = "Penerbit wajib diisi!!")
    @Column(nullable = false, name = "Penerbit")
    private String Penerbit;

    @NotEmpty(message = "Kolom wajib diisi")
    @NotNull(message = "Tahun Terbit wajib diisi!!")
    @Column(nullable = false, name = "TahunTerbit")
    private String TahunTerbit;

    @NotEmpty(message = "Kolom wajib diisi")
    @NotNull(message = "Tebal Buku wajib diisi!!")
    @Column(nullable = false, name = "TebalBuku")
    private String TebalBuku;

    @NotEmpty(message = "Kolom wajib diisi")
    @NotNull(message = "Rating wajib diisi 1-5!!")
    @Column(nullable = false, name = "Rating")
    private String Rating;

    @NotEmpty(message = "Kolom wajib diisi")
    @NotNull(message = "Stok Buku wajib diisi!!")
    @Column(nullable = false, name = "StokBuku")
    private String StokBuku;

}
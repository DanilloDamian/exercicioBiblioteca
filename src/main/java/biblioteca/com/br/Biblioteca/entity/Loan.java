package biblioteca.com.br.Biblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private LocalDate initialDate;
    @Column
    private LocalDate finalDate;
    @ManyToOne
    @JoinColumn(name="book_id", nullable=false)
    private Book book;
    @OneToOne
    @JoinColumn(name="usuario_id", nullable=false)
    private Usuario usuario;
    @Column
    private Double totalPrice;
}

package biblioteca.com.br.Biblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date initialDate;
    private Date finalDate;
    @ManyToOne
    private Book book;
    @OneToOne
    private Usuario usuario;
    private Double totalPrice;
}

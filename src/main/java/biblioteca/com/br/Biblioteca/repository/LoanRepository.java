package biblioteca.com.br.Biblioteca.repository;

import biblioteca.com.br.Biblioteca.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Long> {
}

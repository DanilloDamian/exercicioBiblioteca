package biblioteca.com.br.Biblioteca.repository;

import biblioteca.com.br.Biblioteca.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    Boolean existsByTitle(String title);
}

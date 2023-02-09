package biblioteca.com.br.Biblioteca.repository;

import biblioteca.com.br.Biblioteca.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    Boolean existsByDocumentNumber(String documentNumber);
}

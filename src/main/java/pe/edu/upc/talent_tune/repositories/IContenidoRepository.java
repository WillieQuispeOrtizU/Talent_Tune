package pe.edu.upc.talent_tune.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.talent_tune.entities.Contenido;

@Repository
public interface IContenidoRepository extends JpaRepository<Contenido, Integer> {

}

package pe.edu.upc.talent_tune.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.talent_tune.entities.Categoria;

import java.util.List;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {
    @Query("Select c from Categoria c where c.tipoCategoria like %:tipoCategoria%")
    public List<Categoria> buscar(@Param("tipoCategoria") String tipoCategoria);

}

package pe.edu.upc.talent_tune.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.talent_tune.entities.Categoria;
import pe.edu.upc.talent_tune.repositories.ICategoriaRepository;
import pe.edu.upc.talent_tune.serviceinterfaces.ICategoriaService;

import java.util.List;

@Service
public class CategoriaServiceImplement implements ICategoriaService {

    @Autowired
    private ICategoriaRepository cR;

    @Override
    public List<Categoria> list() {
        return cR.findAll();
    }

    @Override
    public void insert(Categoria categoria) {
        cR.save(categoria);
    }

    @Override
    public void update(Categoria categoria) {
        cR.save(categoria);
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public List<Categoria> buscar(String tipoCategoria) {
        return cR.buscar(tipoCategoria);
    }
}

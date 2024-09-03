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
}

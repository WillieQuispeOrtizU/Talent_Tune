package pe.edu.upc.talent_tune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talent_tune.dtos.CategoriaDTO;
import pe.edu.upc.talent_tune.entities.Categoria;
import pe.edu.upc.talent_tune.serviceinterfaces.ICategoriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private ICategoriaService cS;

    @GetMapping
    public List<CategoriaDTO> listarCategorias() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CategoriaDTO.class);
        }).collect(Collectors.toList());
    };

    @PostMapping
    public void registrar(@RequestBody CategoriaDTO dto) {
        ModelMapper m = new ModelMapper();
        Categoria ca = m.map(dto, Categoria.class);
        cS.insert(ca);
    }
    @PatchMapping
    public void modificar (@RequestBody CategoriaDTO dto){
        ModelMapper m = new ModelMapper();
        Categoria ca = m.map(dto, Categoria.class);
        cS.update(ca);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }
    @GetMapping("/busquedas")
    public List<CategoriaDTO> buscar(@RequestParam String tipoCategoria) {
        return cS.buscar(tipoCategoria).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CategoriaDTO.class);
        }).collect(Collectors.toList());
    }
}

package pe.edu.upc.talent_tune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talent_tune.dtos.CategoriaDTO;
import pe.edu.upc.talent_tune.dtos.RolDTO;
import pe.edu.upc.talent_tune.entities.Categoria;
import pe.edu.upc.talent_tune.entities.Rol;
import pe.edu.upc.talent_tune.serviceinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private IRolService rS;

    @GetMapping
    public List<RolDTO> listarRoles() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolDTO.class);
        }).collect(Collectors.toList());
    };

    @PostMapping
    public void registrar(@RequestBody RolDTO dto) {
        ModelMapper m = new ModelMapper();
        Rol rol = m.map(dto, Rol.class);
        rS.insert(rol);
    }
    @PatchMapping
    public void modificar (@RequestBody RolDTO dto){
        ModelMapper m = new ModelMapper();
        Rol rol = m.map(dto, Rol.class);
        rS.update(rol);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rS.delete(id);
    }

}

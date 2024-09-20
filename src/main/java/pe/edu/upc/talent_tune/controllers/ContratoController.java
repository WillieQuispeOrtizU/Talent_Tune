package pe.edu.upc.talent_tune.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.talent_tune.dtos.ContratoDTO;
import pe.edu.upc.talent_tune.dtos.MensajeDTO;
import pe.edu.upc.talent_tune.entities.Contrato;
import pe.edu.upc.talent_tune.entities.Mensaje;
import pe.edu.upc.talent_tune.serviceinterfaces.IContratoService;
import pe.edu.upc.talent_tune.serviceinterfaces.IMensajeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    private IContratoService ctS;

    @GetMapping
    public List<MensajeDTO> listarContrato(){
        return ctS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, MensajeDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody ContratoDTO dto){
        ModelMapper m = new ModelMapper();
        Contrato contrato = m.map(dto, Contrato.class);
        ctS.update(contrato);
    }

    @PatchMapping
    public void modificar(@RequestBody ContratoDTO dto){
        ModelMapper m = new ModelMapper();
        Contrato contrato = m.map(dto, Contrato.class);
        ctS.update(contrato);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        ctS.delete(id);
    }
}

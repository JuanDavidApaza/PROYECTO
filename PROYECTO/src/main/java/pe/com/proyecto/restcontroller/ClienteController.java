package pe.com.proyecto.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.proyecto.entity.Cliente;
import pe.com.proyecto.service.ClienteServie;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServie service;
    
    @GetMapping
    public List<Cliente> findAll(){
        return service.findAll();
    }
    
}


package pe.com.proyecto.service;

import java.util.List;
import java.util.Optional;
import pe.com.proyecto.entity.OrdenPedido;

public interface OrdenPedidoService {
    public List<OrdenPedido> findAll();
    
    public List<OrdenPedido> findAllCustom();
    
    public Optional<OrdenPedido> findById(long id);
    
    public OrdenPedido add(OrdenPedido p);
    
    public OrdenPedido update(OrdenPedido p);
    
    
    public OrdenPedido delete(OrdenPedido p);
}

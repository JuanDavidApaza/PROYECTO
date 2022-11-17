
package pe.com.proyecto.service;

import java.util.List;
import java.util.Optional;
import pe.com.proyecto.entity.Producto;

public interface ProductoService {
    public List<Producto> findAll();
    
    public List<Producto> findAllCustom();
    
    public Optional<Producto> findById(long id);
    
    public Producto add(Producto p);
    
    public Producto update(Producto p);
    
    
    public Producto delete(Producto p);
}

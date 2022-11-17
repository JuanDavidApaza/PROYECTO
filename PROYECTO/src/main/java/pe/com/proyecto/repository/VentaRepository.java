
package pe.com.proyecto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.proyecto.entity.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long >{
    @Query("select p from Venta p where p.estado = '1'")
    List<Venta> findAllCustom();
}

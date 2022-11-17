
package pe.com.proyecto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.proyecto.entity.OrdenPedido;

public interface OrdenPedidoRepository extends JpaRepository<OrdenPedido, Long > {
    @Query("select p from OrdenPedido p where p.estado = '1'")
    List<OrdenPedido> findAllCustom();
}

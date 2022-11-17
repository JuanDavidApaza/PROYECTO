
package pe.com.proyecto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Producto")
@Table(name = "Producto")
public class Producto {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idproducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nombreproducto")
    private String nombrepro;
    @Column(name = "categoriaproducto")
    private String categoriapro;
    @Column(name = "preciou")
    private double preciopro;
    @Column(name = "estado")
    private boolean estado;
}

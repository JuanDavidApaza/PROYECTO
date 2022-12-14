package pe.com.proyecto.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "BoletaDeVentaEntity")
@Table(name = "BoletaDeVenta")
public class BoletaDeVenta implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "idboleta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="fechaboleta")
    private String fecha;
    @Column(name="montopagado")
    private double monto;
    @Column(name="vuelto")
    private double vuelto; 
    @Column(name="estcat")
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name="idventa",nullable=false)
    private Venta venta;
}

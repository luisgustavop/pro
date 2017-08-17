/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author erick
 */
@Entity
@Table(name = "carrito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrito.findAll", query = "SELECT c FROM Carrito c"),
    @NamedQuery(name = "Carrito.findByIDCarrito", query = "SELECT c FROM Carrito c WHERE c.iDCarrito = :iDCarrito"),
    @NamedQuery(name = "Carrito.findByTipoVino", query = "SELECT c FROM Carrito c WHERE c.tipoVino = :tipoVino"),
    @NamedQuery(name = "Carrito.findByFecha", query = "SELECT c FROM Carrito c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Carrito.findByNombreCliente", query = "SELECT c FROM Carrito c WHERE c.nombreCliente = :nombreCliente")})
public class Carrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCarrito")
    private Integer iDCarrito;
    @Size(max = 45)
    @Column(name = "Tipo Vino")
    private String tipoVino;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 45)
    @Column(name = "Nombre Cliente")
    private String nombreCliente;

    public Carrito() {
    }

    public Carrito(Integer iDCarrito) {
        this.iDCarrito = iDCarrito;
    }

    public Integer getIDCarrito() {
        return iDCarrito;
    }

    public void setIDCarrito(Integer iDCarrito) {
        this.iDCarrito = iDCarrito;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCarrito != null ? iDCarrito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrito)) {
            return false;
        }
        Carrito other = (Carrito) object;
        if ((this.iDCarrito == null && other.iDCarrito != null) || (this.iDCarrito != null && !this.iDCarrito.equals(other.iDCarrito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "identidades.Carrito[ iDCarrito=" + iDCarrito + " ]";
    }
    
}

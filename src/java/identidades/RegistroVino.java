/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author erick
 */
@Entity
@Table(name = "registro-vino")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroVino.findAll", query = "SELECT r FROM RegistroVino r"),
    @NamedQuery(name = "RegistroVino.findById", query = "SELECT r FROM RegistroVino r WHERE r.id = :id"),
    @NamedQuery(name = "RegistroVino.findByNombredeVino", query = "SELECT r FROM RegistroVino r WHERE r.nombredeVino = :nombredeVino"),
    @NamedQuery(name = "RegistroVino.findByTipoVino", query = "SELECT r FROM RegistroVino r WHERE r.tipoVino = :tipoVino"),
    @NamedQuery(name = "RegistroVino.findByPrecio", query = "SELECT r FROM RegistroVino r WHERE r.precio = :precio")})
public class RegistroVino implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID-")
    private Integer id;
    @Size(max = 45)
    @Column(name = "Nombre de Vino")
    private String nombredeVino;
    @Size(max = 45)
    @Column(name = "Tipo Vino")
    private String tipoVino;
    @Column(name = "Precio")
    private Integer precio;

    public RegistroVino() {
    }

    public RegistroVino(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombredeVino() {
        return nombredeVino;
    }

    public void setNombredeVino(String nombredeVino) {
        this.nombredeVino = nombredeVino;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroVino)) {
            return false;
        }
        RegistroVino other = (RegistroVino) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "identidades.RegistroVino[ id=" + id + " ]";
    }
    
}

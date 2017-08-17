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
@Table(name = "registro usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroUsuario.findAll", query = "SELECT r FROM RegistroUsuario r"),
    @NamedQuery(name = "RegistroUsuario.findByIdUsuario", query = "SELECT r FROM RegistroUsuario r WHERE r.idUsuario = :idUsuario"),
    @NamedQuery(name = "RegistroUsuario.findByNombre", query = "SELECT r FROM RegistroUsuario r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "RegistroUsuario.findByApellido", query = "SELECT r FROM RegistroUsuario r WHERE r.apellido = :apellido"),
    @NamedQuery(name = "RegistroUsuario.findByEdad", query = "SELECT r FROM RegistroUsuario r WHERE r.edad = :edad"),
    @NamedQuery(name = "RegistroUsuario.findByCorreoElectronico", query = "SELECT r FROM RegistroUsuario r WHERE r.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "RegistroUsuario.findByRfc", query = "SELECT r FROM RegistroUsuario r WHERE r.rfc = :rfc"),
    @NamedQuery(name = "RegistroUsuario.findByFechanacimiento", query = "SELECT r FROM RegistroUsuario r WHERE r.fechanacimiento = :fechanacimiento"),
    @NamedQuery(name = "RegistroUsuario.findByTelefono", query = "SELECT r FROM RegistroUsuario r WHERE r.telefono = :telefono")})
public class RegistroUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id-Usuario")
    private Integer idUsuario;
    @Size(max = 45)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Edad")
    private Integer edad;
    @Size(max = 45)
    @Column(name = "Correo Electronico")
    private String correoElectronico;
    @Column(name = "RFC")
    private Integer rfc;
    @Column(name = "Fecha nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Column(name = "Telefono")
    private Integer telefono;

    public RegistroUsuario() {
    }

    public RegistroUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getRfc() {
        return rfc;
    }

    public void setRfc(Integer rfc) {
        this.rfc = rfc;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroUsuario)) {
            return false;
        }
        RegistroUsuario other = (RegistroUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "identidades.RegistroUsuario[ idUsuario=" + idUsuario + " ]";
    }
    
}

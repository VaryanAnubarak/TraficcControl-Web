/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jairo
 */
@Entity
@Table(name = "Cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente")
    , @NamedQuery(name = "Cliente.findByNombre", query = "SELECT c FROM Cliente c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Cliente.findByIdentificacion", query = "SELECT c FROM Cliente c WHERE c.identificacion = :identificacion")
    , @NamedQuery(name = "Cliente.findByFechaEntradaPeaje", query = "SELECT c FROM Cliente c WHERE c.fechaEntradaPeaje = :fechaEntradaPeaje")
    , @NamedQuery(name = "Cliente.findByHoraEntradaPeaje", query = "SELECT c FROM Cliente c WHERE c.horaEntradaPeaje = :horaEntradaPeaje")
    , @NamedQuery(name = "Cliente.findByTipoPago", query = "SELECT c FROM Cliente c WHERE c.tipoPago = :tipoPago")
    , @NamedQuery(name = "Cliente.findByPagoPeaje", query = "SELECT c FROM Cliente c WHERE c.pagoPeaje = :pagoPeaje")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCliente")
    private Integer idCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "identificacion")
    private String identificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "fechaEntradaPeaje")
    private String fechaEntradaPeaje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "horaEntradaPeaje")
    private String horaEntradaPeaje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "tipoPago")
    private String tipoPago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "pagoPeaje")
    private String pagoPeaje;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, String nombre, String identificacion, String fechaEntradaPeaje, String horaEntradaPeaje, String tipoPago, String pagoPeaje) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaEntradaPeaje = fechaEntradaPeaje;
        this.horaEntradaPeaje = horaEntradaPeaje;
        this.tipoPago = tipoPago;
        this.pagoPeaje = pagoPeaje;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaEntradaPeaje() {
        return fechaEntradaPeaje;
    }

    public void setFechaEntradaPeaje(String fechaEntradaPeaje) {
        this.fechaEntradaPeaje = fechaEntradaPeaje;
    }

    public String getHoraEntradaPeaje() {
        return horaEntradaPeaje;
    }

    public void setHoraEntradaPeaje(String horaEntradaPeaje) {
        this.horaEntradaPeaje = horaEntradaPeaje;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getPagoPeaje() {
        return pagoPeaje;
    }

    public void setPagoPeaje(String pagoPeaje) {
        this.pagoPeaje = pagoPeaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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
    @Basic(optional = false)
    @Column(name = "idCliente")
    private Integer idCliente;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "identificacion")
    private String identificacion;
    @Basic(optional = false)
    @Column(name = "fechaEntradaPeaje")
    private String fechaEntradaPeaje;
    @Basic(optional = false)
    @Column(name = "horaEntradaPeaje")
    private String horaEntradaPeaje;
    @Basic(optional = false)
    @Column(name = "tipoPago")
    private int tipoPago;
    @Basic(optional = false)
    @Column(name = "pagoPeaje")
    private String pagoPeaje;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Vehiculo vehiculo;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, String nombre, String identificacion, String fechaEntradaPeaje, String horaEntradaPeaje, int tipoPago, String pagoPeaje, String matricula, String tipoVehiculo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaEntradaPeaje = fechaEntradaPeaje;
        this.horaEntradaPeaje = horaEntradaPeaje;
        this.tipoPago = tipoPago;
        this.pagoPeaje = pagoPeaje;
        this.vehiculo = new Vehiculo(idCliente, matricula, tipoVehiculo);
        
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

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getPagoPeaje() {
        return pagoPeaje;
    }

    public void setPagoPeaje(String pagoPeaje) {
        this.pagoPeaje = pagoPeaje;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
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

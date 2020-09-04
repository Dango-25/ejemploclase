/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
 * @author gomez
 */
@Entity
@Table(name = "roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "roles.findAll", query = "SELECT i FROM roles i")
    , @NamedQuery(name = "roles.findByidrol", query = "SELECT i FROM roles i WHERE i.idrol = :idrol")
    , @NamedQuery(name = "roles.findByrol", query = "SELECT i FROM roles i WHERE i.rol = :rol")
    })
public class roles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrol")
    private Integer idrol;
    @Size(max = 45)
    @Column(name = "rol")
    private String rol;
    

    public roles() {
    }

    public roles(Integer idrol) {
        this.idrol = idrol;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer Idrol) {
        this.idrol = idrol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrol!= null ? idrol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof roles)) {
            return false;
        }
        roles other = (roles) object;
        if ((this.idrol == null && other.idrol != null) || (this.idrol != null && !this.idrol.equals(other.idrol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udem.edu.co.entities.Inventarios[ idInventario=" + idrol + " ]";
    }
    
}

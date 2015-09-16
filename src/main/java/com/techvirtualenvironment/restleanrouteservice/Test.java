/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techvirtualenvironment.restleanrouteservice;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author isaac
 */
@Entity
@Table(name = "test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Test.findAll", query = "SELECT tx FROM Test tx"),
    @NamedQuery(name = "Test.findByTes1", query = "SELECT t FROM Test t WHERE t.tes1 = :tes1"),
    @NamedQuery(name = "Test.findByTes2", query = "SELECT t FROM Test t WHERE t.tes2 = :tes2"),
    @NamedQuery(name = "Test.findByTes3", query = "SELECT t FROM Test t WHERE t.tes3 = :tes3"),
    @NamedQuery(name = "Test.findByTes4", query = "SELECT t FROM Test t WHERE t.tes4 = :tes4")})
public class Test implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tes1")
    private String tes1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tes2")
    private String tes2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tes3")
    private String tes3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tes4")
    private String tes4;

    public Test() {
    }

    public Test(String tes1) {
        this.tes1 = tes1;
    }

    public Test(String tes1, String tes2, String tes3, String tes4) {
        this.tes1 = tes1;
        this.tes2 = tes2;
        this.tes3 = tes3;
        this.tes4 = tes4;
    }

    public String getTes1() {
        return tes1;
    }

    public void setTes1(String tes1) {
        this.tes1 = tes1;
    }

    public String getTes2() {
        return tes2;
    }

    public void setTes2(String tes2) {
        this.tes2 = tes2;
    }

    public String getTes3() {
        return tes3;
    }

    public void setTes3(String tes3) {
        this.tes3 = tes3;
    }

    public String getTes4() {
        return tes4;
    }

    public void setTes4(String tes4) {
        this.tes4 = tes4;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tes1 != null ? tes1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test)) {
            return false;
        }
        Test other = (Test) object;
        if ((this.tes1 == null && other.tes1 != null) || (this.tes1 != null && !this.tes1.equals(other.tes1))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techvirtualenvironment.restleanrouteservice.Test[ tes1=" + tes1 + " ]";
    }
    
}

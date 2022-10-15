/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.danielalvesfonsecaneto.grupostrabalhos.telefone;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
@Entity
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Byte ddd;
    private Integer numero;
    
    
    public Telefone(){
    
    }
    public Telefone(Byte ddd , Integer numero){
        this.ddd=ddd;
        this.numero=numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

     public Byte getDdd() {
        return ddd;
    }

   
    public void setDdd(Byte ddd) {
        this.ddd = ddd;
    }

    
    public Integer getNumero() {
        return numero;
    }

    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    


    @Override
    public String toString() {
        return "io.github.danielalvesfonsecaneto.grupostrabalhos.telefone.Telefone[ id=" + id + " ]";
    }

    
   
    
}

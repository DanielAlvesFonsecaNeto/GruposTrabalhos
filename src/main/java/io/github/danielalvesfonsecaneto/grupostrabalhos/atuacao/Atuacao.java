/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.danielalvesfonsecaneto.grupostrabalhos.atuacao;

import io.github.danielalvesfonsecaneto.grupostrabalhos.grupo.Grupo;
import io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa.Pessoa;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
@Entity
public class Atuacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private LocalDate inicio;
    
    @Column
    private LocalDate termino;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "grupo_id")
    private Grupo grupo;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }

    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }
    
     public Pessoa getPessoa() {
        return pessoa;
    }

    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    public Grupo getGrupo() {
        return grupo;
    }

    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }


    @Override
    public String toString() {
        return "io.github.danielalvesfonsecaneto.grupostrabalhos.atuacao.Atuacao[ id=" + getId() + " ]";
    }

    
   
    
}

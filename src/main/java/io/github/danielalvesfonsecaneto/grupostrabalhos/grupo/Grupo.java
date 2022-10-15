/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.danielalvesfonsecaneto.grupostrabalhos.grupo;

import io.github.danielalvesfonsecaneto.grupostrabalhos.atuacao.Atuacao;
import io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa.Pessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */

@Entity
//@Table(name = "tbl_grupo")
public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 65)
    private String nome;

    private Boolean ativo =true;
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "lider_id")
    @JsonbTransient
    private Pessoa lider;
    
    @OneToMany(mappedBy = "grupo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Atuacao> atuacoes;
    
    public Grupo(){
        atuacoes = new ArrayList<>();
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
     public Pessoa getLider() {
        return lider;
    }

    
    public void setLider(Pessoa lider) {
        this.lider = lider;
    }

  
    public List<Atuacao> getAtuacoes() {
        return atuacoes;
    }

    
    public void setAtuacoes(Atuacao atuacao) {
        this.atuacoes.add(atuacao);
    }

    @Override
    public String toString() {
        return "io.github.danielalvesfonsecaneto.grupostrabalhos.grupo.Grupo[ id=" + getId() + " ]";
    }

    
   


}

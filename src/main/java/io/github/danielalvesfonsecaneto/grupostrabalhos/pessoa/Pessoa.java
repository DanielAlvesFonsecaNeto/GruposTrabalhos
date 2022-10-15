/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa;

import io.github.danielalvesfonsecaneto.grupostrabalhos.endereco.Endereco;
import io.github.danielalvesfonsecaneto.grupostrabalhos.telefone.Telefone;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
@Entity
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 65)
    private String nome;
    
    @Column(length = 250)
    private String email;
            
    private LocalDate nascimento;
   
    @Transient
    private Byte idade;

   
    
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "pessoa_id")
    private List <Telefone> telefones;
    
    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "pessoa_id")
    private Endereco endereco;
    
   // @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
   // @JoinColumn(name = "pessoa_id")
   // private List <Telefone> telefones;
    
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa.Pessoa[ id=" + id + " ]";
    }

   
    
}

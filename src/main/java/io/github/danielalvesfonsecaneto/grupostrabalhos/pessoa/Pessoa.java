/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa;

import io.github.danielalvesfonsecaneto.grupostrabalhos.atuacao.Atuacao;
import io.github.danielalvesfonsecaneto.grupostrabalhos.endereco.Endereco;
import io.github.danielalvesfonsecaneto.grupostrabalhos.grupo.Grupo;
import io.github.danielalvesfonsecaneto.grupostrabalhos.telefone.Telefone;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
@Entity(name = "Pessoa")
//@Table(name = "tbl_pessoa")
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p"),
    @NamedQuery(name = "Pessoa.findNome", query = "SELECT p.nome FROM Pessoa p"),
    @NamedQuery(name = "Pessoa.findNomeEndereco", query = "SELECT p.nome, p.endereco FROM Pessoa p"),
    @NamedQuery(name = "Pessoa.findNomeTelefones", query = "SELECT p.nome, t FROM Pessoa p JOIN p.telefones t"),
    @NamedQuery(name = "Pessoa.findPessoaQueMoramEmAvenida", query = "SELECT p from Pessoa p " + "WHERE p.endereco.tipoLogradouro = 1"),
    @NamedQuery(name = "Pessoa.findPessoaQueNaoMoramEmPraca", query = "SELECT p from Pessoa p " + "WHERE NOT p.endereco.tipoLogradouro = 2")
})
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
    
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pessoa_id")
    private Endereco endereco;
    
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "pessoa_id")
    private List <Atuacao> atuacao;
    
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "pessoa_id")
    private List <Grupo> grupos;
    
    public Pessoa (){
        telefones = new ArrayList<>();
        atuacao = new ArrayList<>();
        grupos = new ArrayList<>();
    }
    public Pessoa (String nome , String email , LocalDate nascimento){
        this.nome = nome;
        this.email= email;
        this.nascimento = nascimento;
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

     public List <Telefone> getTelefones() {
        return telefones;
    }

    /*public void setTelefones(List <Telefone> telefones) {
        this.telefones = telefones;
    }
*/
    public void setTelefones(Telefone telefones) {
        this.telefones.add(telefones);
    }
   
    public Endereco getEndereco() {
        return endereco;
    }

   
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    public List <Atuacao> getAtuacao() {
        return atuacao;
    }

   
    public void setAtuacao(Atuacao atuacao) {
        this.atuacao.add(atuacao);
    }

    
    public List <Grupo> getGrupos() {
        return grupos;
    }

    
    public void setGrupos(List <Grupo> grupos) {
        this.grupos = grupos;
    }

    
    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", nascimento=" + nascimento + ", idade=" + idade + ", endereco=" + endereco + ", telefones=" + telefones +"}";
    //return "io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa.Pessoa[ id=" + getId() + " ]";
    }

    
   
   
    
}

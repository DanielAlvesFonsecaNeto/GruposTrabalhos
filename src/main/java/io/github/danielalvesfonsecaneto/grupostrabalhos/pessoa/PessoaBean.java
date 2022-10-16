/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa;


import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
@Stateless
public class PessoaBean implements PessoaBeanLocal{

    @PersistenceContext(unitName = "GruposTrabalhoPU")
    private EntityManager EM1;
    @Override
    public void save(Pessoa pessoa) {
       EM1.persist(pessoa);
    }

    @Override
    public List<Pessoa> pessoaQuerryTodas() {
        Query query = EM1.createQuery("SELECT p FROM Pessoa p");
        return (List<Pessoa>) query.getResultList();
    }

    @Override
    public List<Pessoa> pessoaTypedQuerryTodas() {
        TypedQuery query = EM1.createQuery("SELECT p FROM Pessoa p",Pessoa.class);
        return query.getResultList();
    }

    @Override
    public List<Pessoa> pessoaNamedQuerryTodas() {
        return EM1.createQuery("Pessoa.findAll",Pessoa.class).getResultList();
    }

    @Override
    public List<Pessoa> pessoaQuerryNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pessoa> pessoaTypedQuerryNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pessoa> pessoaNamedQuerryNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
}


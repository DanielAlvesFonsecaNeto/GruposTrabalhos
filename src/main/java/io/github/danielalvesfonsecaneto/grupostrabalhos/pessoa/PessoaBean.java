/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
   
    
}


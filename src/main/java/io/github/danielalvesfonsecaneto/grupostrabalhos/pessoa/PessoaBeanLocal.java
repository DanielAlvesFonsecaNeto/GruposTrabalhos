/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
@Local
public interface PessoaBeanLocal {
 public void save(Pessoa pessoa);
 
 public List<Pessoa> pessoaQuerryTodas();
 
 public List<Pessoa> pessoaTypedQuerryTodas();
 
 public List<Pessoa> pessoaNamedQuerryTodas();
 
 
 
 public List<Pessoa> pessoaQuerryNome();
 
 public List<Pessoa> pessoaTypedQuerryNome();
 
 public List<Pessoa> pessoaNamedQuerryNome();
     
 
 
 
}

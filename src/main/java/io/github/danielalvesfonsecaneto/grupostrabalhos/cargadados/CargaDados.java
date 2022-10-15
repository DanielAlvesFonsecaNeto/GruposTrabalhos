/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.danielalvesfonsecaneto.grupostrabalhos.cargadados;

import io.github.danielalvesfonsecaneto.grupostrabalhos.atuacao.Atuacao;
import io.github.danielalvesfonsecaneto.grupostrabalhos.endereco.Endereco;
import io.github.danielalvesfonsecaneto.grupostrabalhos.endereco.TipoLogradouro;
import io.github.danielalvesfonsecaneto.grupostrabalhos.grupo.Grupo;
import io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa.Pessoa;
import io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa.PessoaBeanLocal;
import io.github.danielalvesfonsecaneto.grupostrabalhos.telefone.Telefone;
import java.time.LocalDate;
import java.time.Month;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
@Singleton 
@Startup
public class CargaDados implements CargaDadosLocal{

    @Inject
    private PessoaBeanLocal pessoaBeanLocal;
    
    @PostConstruct
    @Override
    public void popularBanco() {
    
    Pessoa p1 = new Pessoa();
    p1.setNome("Ana Zaira");
    p1.setEmail("ana@mail.com");
    p1.setNascimento(LocalDate.of(2001, Month.JANUARY, 1));
    p1.setEndereco(new Endereco(TipoLogradouro.PRACA , "4" , 4444 , "Quatroberto"));
    p1.setTelefones(new Telefone((byte)11 , 11111111));
    p1.setTelefones(new Telefone((byte)12 , 12121212));
    p1.setTelefones(new Telefone((byte)13 , 13131313));
    
    Pessoa p2 = new Pessoa();
    p2.setNome("Beatriz Yana");
    p2.setEmail("beatriz@mail.com");
    p2.setNascimento(LocalDate.of(2002, Month.FEBRUARY, 2));
    p2.setEndereco(new Endereco(TipoLogradouro.AVENIDA , "2" , 2222 , "Doisberto"));
    p2.setTelefones(new Telefone((byte)22 , 22222222));
    
    Pessoa p3 = new Pessoa();
    p3.setNome("Cecília Xerxes");
    p3.setEmail("cecilia@mail.com");
    p3.setNascimento(LocalDate.of(2003, Month.MARCH, 3));
    p3.setEndereco(new Endereco(TipoLogradouro.AVENIDA , "3" , 3333 , "Trêsberto"));
    
    Pessoa p4 = new Pessoa();
    p4.setNome("Débora Wendel");
    p4.setEmail("debora@mail.com");
    p4.setNascimento(LocalDate.of(2004, Month.APRIL, 4));
    p4.setEndereco(new Endereco(TipoLogradouro.PRACA , "4" , 4444 , "Quatroberto"));
    p4.setTelefones(new Telefone((byte)44 , 44444444));   
    p4.setTelefones(new Telefone((byte)45 , 45454545)); 
     
    ///Grupo 1
    
    Grupo g1 = new Grupo();
    g1.setAtivo(false);
    g1.setNome("Estudo I");
    g1.setLider(p1);
    
    Atuacao a1 = new Atuacao();
    a1.setInicio(LocalDate.of(2011, Month.JANUARY, 1));
    a1.setTermino(LocalDate.of(2021, Month.NOVEMBER, 11));
    a1.setGrupo(g1);
    a1.setPessoa(p1);
    
    p1.setAtuacao(a1);
    g1.setAtuacoes(a1);
    

    Atuacao a2 = new Atuacao();
    a2.setInicio(LocalDate.of(2012, Month.JANUARY, 1));
    a2.setTermino(LocalDate.of(2022, Month.NOVEMBER, 11));
    a2.setGrupo(g1);
    a2.setPessoa(p1);

    p1.setAtuacao(a2);
    g1.setAtuacoes(a2);

    Atuacao a3 = new Atuacao();
    a3.setInicio(LocalDate.of(2012, Month.JANUARY, 2));
    a3.setTermino(LocalDate.of(2021, Month.JANUARY, 12));
    a3.setGrupo(g1);
    a3.setPessoa(p2);

    p2.setAtuacao(a3);
    g1.setAtuacoes(a3);

    Atuacao a4 = new Atuacao();
    a4.setInicio(LocalDate.of(2013, Month.JANUARY, 3));
    a4.setTermino(LocalDate.of(2021, Month.JANUARY, 13));
    a4.setGrupo(g1);
    a4.setPessoa(p3);

    p3.setAtuacao(a4);
    g1.setAtuacoes(a4);

    Atuacao a5 = new Atuacao();
    a5.setInicio(LocalDate.of(2014, Month.JANUARY, 4));
    a5.setTermino(LocalDate.of(2021, Month.JANUARY, 14));
    a5.setGrupo(g1);
    a5.setPessoa(p4);

    p4.setAtuacao(a5);
    g1.setAtuacoes(a5);
    
    
    ///Grupo 2
    
    Grupo g2 = new Grupo();
    g2.setAtivo(true);
    g2.setNome("Estudo II");
    g2.setLider(p2);

    Atuacao a6 = new Atuacao();
    a6.setInicio(LocalDate.of(2012, Month.JANUARY, 2));
    a6.setGrupo(g2);
    a6.setPessoa(p2);

    p2.setAtuacao(a6);
    g2.setAtuacoes(a6);

    Atuacao a7 = new Atuacao();
    a7.setInicio(LocalDate.of(2012, Month.JANUARY, 2));
    a7.setGrupo(g2);
    a7.setPessoa(p4);

    p4.setAtuacao(a7);
    g2.setAtuacoes(a7);
    
    
    ///Grupo 3
    Grupo g3 = new Grupo();
    g3.setAtivo(false);
    g3.setNome("Estudo III");
    g3.setLider(p3);

    Atuacao a8 = new Atuacao();
    a8.setInicio(LocalDate.of(2012, Month.JANUARY, 3));
    a8.setTermino(LocalDate.of(2023, Month.JANUARY, 13));
    a8.setGrupo(g3);
    a8.setPessoa(p3);

    p3.setAtuacao(a8);
    g3.setAtuacoes(a8);

    Atuacao a9 = new Atuacao();
    a9.setInicio(LocalDate.of(2012, Month.JANUARY, 3));
    a9.setTermino(LocalDate.of(2023, Month.JANUARY, 13));
    a9.setGrupo(g3);
    a9.setPessoa(p4);

    p4.setAtuacao(a9);
    g3.setAtuacoes(a9);
    
    ///Grupo 4
    Grupo g4 = new Grupo();
    g4.setAtivo(true);
    g4.setNome("Estudo IV");
    g4.setLider(p2);

    Atuacao a10 = new Atuacao();
    a10.setInicio(LocalDate.of(2012, Month.JANUARY, 4));
    a10.setTermino(LocalDate.of(2024, Month.JANUARY, 14));
    a10.setGrupo(g4);
    a10.setPessoa(p2);

    p2.setAtuacao(a10);
    g4.setAtuacoes(a10);

    Atuacao a11 = new Atuacao();
    a11.setInicio(LocalDate.of(2012, Month.JANUARY, 4));
    a11.setTermino(LocalDate.of(2024, Month.JANUARY, 14));
    a11.setGrupo(g4);
    a11.setPessoa(p3);

    p3.setAtuacao(a11);
    g4.setAtuacoes(a11);

    Atuacao a12 = new Atuacao();
    a12.setInicio(LocalDate.of(2012, Month.JANUARY, 4));
    a12.setTermino(LocalDate.of(2024, Month.JANUARY, 14));
    a12.setGrupo(g4);
    a12.setPessoa(p4);

    p4.setAtuacao(a12);
    g4.setAtuacoes(a12);
    
    
    pessoaBeanLocal.save(p1);
    pessoaBeanLocal.save(p2);
    pessoaBeanLocal.save(p3);
    pessoaBeanLocal.save(p4);
    
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model.repository;

import com.example.demo.model.Produto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author cris
 */

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List<Produto> findByNome(String nomeProduto);

    public List<Produto> findByFormasEntrega_Nome(String formaEntrega);

}
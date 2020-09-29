package com.pedidos.pedidos.rest;

import com.pedidos.pedidos.entity.Produto;
import com.pedidos.pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produto")
public class ProdutoRest{
    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoRest(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto save ( @RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}

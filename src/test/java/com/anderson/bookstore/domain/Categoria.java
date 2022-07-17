package com.anderson.bookstore.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Categoria {

    private Integer id;

    private String nome;

    private String descicao;

    private List<Livro> livros = new ArrayList<>();

}

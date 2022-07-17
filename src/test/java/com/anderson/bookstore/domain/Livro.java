package com.anderson.bookstore.domain;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class Livro {

    private Integer id;

    private String titulo;

    private String nome_autor;

    private String texto;

    private Categoria categoria;

}

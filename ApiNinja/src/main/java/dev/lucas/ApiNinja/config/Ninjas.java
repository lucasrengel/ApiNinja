package dev.lucas.ApiNinja.config;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ninjas")
@Data // getters e setters atraves do lombok
@AllArgsConstructor // construtor com todos os argumentos
@NoArgsConstructor  // construtor vazio
public class Ninjas {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) // gerando o ID automaticamente, mas se algum ninja for deletado o id nao sera reutilizado
    Long id;
    String nome;
    String aldeia;
    int idade;
    String elemento;
    String imgUrl;
}

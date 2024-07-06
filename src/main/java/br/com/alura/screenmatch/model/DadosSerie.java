package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// mapeamento de como vai ficar o json para a classe
@JsonIgnoreProperties(ignoreUnknown = true) // falando para ignorar tudo o que não foi mapeado no recortd, para o sistema não tentar trazer todos os dados da API
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias ("imdbRating") String avaliacao
                         )

                         /*@JsonProperty("imdbVotes") String votos)*/ {
}


// a anotação @JsonAlias serve para indicar o nome do campo no json da API
// @JsonProperty -- ele já coloca o nome original na hora de escreve
//@JsonAlias({"Title", "Titulo"}) String titulo, // usando um array de nomes para buscar na api
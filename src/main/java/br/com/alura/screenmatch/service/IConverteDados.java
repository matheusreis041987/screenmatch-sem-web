package br.com.alura.screenmatch.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
// o <T> T diz que teremos algum retorno desser método mas não sqabemos o tipo (T).
    //Class<T> classe -- dizer qual classe ele vai devolver
}

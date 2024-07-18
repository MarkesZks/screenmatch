package br.com.aura.screenmatch.service;

public interface IConverteDados {

    //<T> T -> Definição generica do tipo
    <T> T obterDados(String json, Class<T> classe);
    // No final do parametro precisamos passar qual tipo de class equeremos
}

package br.com.alura.consultaFipe.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}

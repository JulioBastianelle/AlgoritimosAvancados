package com.company.algoritimos_avancados;

import java.io.OptionalDataException;

public class ListaAlunos {
    private static final int QUANTIDADE_LISTA = 5;
    private int tamanhoLista = 0;
    private Aluno[] lista = new Aluno[QUANTIDADE_LISTA];

    public void adicionar(Aluno aluno) {
        if (tamanhoLista == lista.length) {
            Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];

            for (int i = 0; i < lista.length; i++) {
                novaLista[i] = lista[i];
            }
            lista = novaLista;
        }
        lista[tamanhoLista] = aluno;
        tamanhoLista++;
    }
}

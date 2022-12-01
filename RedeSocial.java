package br.com.newton.poo.prova;

import javax.swing.*;
import java.util.ArrayList;

public class RedeSocial {

    String dataCriacao, nomeUsuario, dataNascimento, senha;

    ArrayList <Publicacao> publicacoes = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public void inserePublicacao(Publicacao publi){
        Publicacao publis = new Publicacao( );
        publicacoes.add(publis);
    }
    public void imprimePublicacoes(){
        for(int i =0;i<publicacoes.size();i++){
            publicacoes.get(i);
        }



    }
}

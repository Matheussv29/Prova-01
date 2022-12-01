package br.com.newton.poo.prova;

public class Publicacao {

    String dataPublicacao, textoPublicacao, linkMidia;

    public static double contadorPublicacao;

    public void Publicacao(String dataPublicacao, String textoPublicacao, String linkMidia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
    }

    public static double getContadorPublicacao() {
        Publicacao publi = new Publicacao();
        return contadorPublicacao+=1;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

}

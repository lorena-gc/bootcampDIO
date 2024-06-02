package com.logc.desafios.poo.equipamento;

import com.logc.desafios.poo.funcionalidades.NavegadorInternet;
import com.logc.desafios.poo.funcionalidades.ReprodutorMusical;
import com.logc.desafios.poo.funcionalidades.Telefone;


public class Iphone implements Telefone, ReprodutorMusical, NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando um nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz.");
    }
}

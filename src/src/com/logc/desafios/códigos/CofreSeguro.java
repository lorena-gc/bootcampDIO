package com.logc.desafios.códigos;

import com.logc.desafios.banco.IntConta;

import java.io.*;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}
public class CofreSeguro {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("cofres-seguros.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String tipoCofre = br.readLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {

            int senha = Integer.parseInt(br.readLine());
            CofreDigital cofredigital = new CofreDigital(senha);

            int confSenha = Integer.parseInt(br.readLine());

            cofredigital.imprimirInformacoes();
            if(cofredigital.validarSenha(confSenha)){
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
    }
}

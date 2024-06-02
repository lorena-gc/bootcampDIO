import com.logc.desafios.poo.equipamento.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();

        iphone1.exibirPagina("web.dio.me/play");
        iphone1.tocar();
        iphone1.pausar();
        iphone1.atender();

    }
}
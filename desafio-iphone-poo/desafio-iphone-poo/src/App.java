import models.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.ligar("99999");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.tocar("algo");
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

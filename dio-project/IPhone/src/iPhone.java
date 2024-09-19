public class iPhone implements MusicPlayer, Telephone, WebBrowser {
    // Implementação dos métodos de MusicPlayer
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos de Telephone
    @Override
    public void ligar(String phoneNumber) {
        System.out.println("Ligando para " + phoneNumber + "...");
    }

    @Override
    public void atender(String phoneNumber) {
        System.out.println("Atendendo chamada de " + phoneNumber + "...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    // Implementação dos métodos de WebBrowser
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
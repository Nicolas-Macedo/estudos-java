public class SmartTv {
    boolean ligada = false;
    int canal = 2;
    int volume = 10;
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }
    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
        
    }
}


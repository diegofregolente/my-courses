public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    /* metodos */
    public void ligar () {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume () {
        volume++;
    }

    public void diminiuirVolume () {
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

}
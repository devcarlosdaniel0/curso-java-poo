package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "FaberCastell";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        System.out.println("---------------");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Vermelha";
        c2.ponta = 1f;
        c2.carga = 40;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }

}

import java.util.Random;
import java.util.Scanner;

public class Ring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caballero caballero = new Caballero("luis",100,100,90);
        Mago mago = new Mago("clark",100,100,90,100);
        Barbaro barbaro = new Barbaro();
        Duelo duelo = new Duelo();
        duelo.enfrentamiento(caballero,mago,barbaro);
    
    }
}
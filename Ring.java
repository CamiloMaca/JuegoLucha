import java.util.Random;
import java.util.Scanner;

public class Ring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caballero caballero = new Caballero("luis",120,20,15);
        Mago mago = new Mago("clark",80,25,10,120);
        Barbaro barbaro = new Barbaro("Conan",100,25,12);
        Duelo duelo = new Duelo();
        duelo.enfrentamiento(caballero,mago,barbaro);
    
    }
}
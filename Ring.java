import java.util.Random;
import java.util.Scanner;

public class Ring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caballero caballero = new Caballero("luis",100,100,90);
        Mago mago = new Mago("clark",100,100,90,100);
        Barbaro barbaro = new Barbaro();
        Personaje personaje = new Personaje();
        caballero.mostrar();
        caballero.furiaGuerrera();
        caballero.mostrar();
        //personaje.duelo(caballero, mago, barbaro);
    
    }
    public void duelo(Caballero caballero, Mago mago, Barbaro barbaro){
        Scanner scanner = new Scanner(System.in);
        int opcClase;
        System.out.println("1.CABALLERO vs MAGO\n2.MAGO vs BARBARO.\n3.BARBARO vs CABALLERO.");
        opcClase=scanner.nextInt();
        switch (opcClase) {
            case 1:
                System.out.println("BATALLA * CABALLERO vs MAGO * ESTA POR COMENZAR.");
                System.out.println("EQUIPA A TU CABALLERO");
                caballero.armaCaballero();
                caballero.armaduraCaballero();
                System.out.println("EQUIPA A TU MAGO");
                mago.armaMago();
                mago.armaduraMago();
                while (caballero.getHp()>0 && mago.getHp()>0) {
                    Random randomCM = new Random();
                    int dadoCaballero= randomCM.nextInt(21);
                    System.out.println("dado caballero: "+dadoCaballero);
                    int dadoMago= randomCM.nextInt(21);
                    System.out.println("dado mago: "+dadoMago);
                    if (dadoCaballero>dadoMago) {
                        caballero.combo= +1;
                        caballero.setAtk(caballero.atk+caballero.combo);
                        System.out.println("ataca el caballero."+caballero.getNombre());
                        caballero.Skill();
                        mago.hp=mago.hp-(caballero.atk-mago.def);
                        mago.mostarMago();
                    }
                    else if (dadoMago>dadoCaballero) {
                        caballero.combo=0;
                        System.out.println("ataca el mago");
                        mago.habilidadesMago();
                        caballero.hp=caballero.hp-(mago.atk-caballero.def);
                        caballero.mostrar();
                    }
                    
                    //reiniciar los atributos para no acumular los buff de ambos 
                }
                break;
            case 2:
                System.out.println("BATALLA * MAGO vs BARBARO * ESTA POR COMENZAR.");
                System.out.println("EQUIPA A TU MAGO.");
                mago.armaMago();
                mago.armaduraMago();
                System.out.println("EQUIPA A TU BARBARO");
                barbaro.armaBarbaro();
                barbaro.armaduraBarbaro();
                while (mago.getHp()>0 && barbaro.getHp()>0) {
                    Random randomMB = new Random();
                    int dadoMago=randomMB.nextInt(21);
                    System.out.println("dado mago: "+dadoMago);
                    int dadoBarbaro=randomMB.nextInt(21);
                    System.out.println("dado barbaro: "+dadoBarbaro);
                    if (dadoBarbaro>dadoMago) {
                        barbaro.combo= +1;
                        barbaro.setAtk(barbaro.atk+barbaro.combo);
                        System.out.println("ATACA EL BARBARO: "+barbaro.getNombre());
                        //barbaro.Skill
                        mago.hp=mago.hp-(barbaro.atk-mago.def);
                        mago.mostarMago();
                    }
                    else if (dadoMago>dadoBarbaro) {
                        System.out.println("ATACA EL MAGO.");
                        mago.habilidadesMago();
                        barbaro.hp=barbaro.hp-(mago.atk-barbaro.def);
                        barbaro.mostrarBarbaro();
                    }
                }
            break;
            case 3:
            System.out.println("BATALLA * BARBARO vs CABALLERO * ESTA POR COMENZAR.");
            System.out.println("EQUIPA A TU BARBARO");
            barbaro.armaBarbaro();
            barbaro.armaduraBarbaro();
            System.out.println("EQUIPA A TU CABALLERO");
            caballero.armaCaballero();
            caballero.armaduraCaballero();

            while (barbaro.getHp() > 0 && caballero.getHp() > 0) {
                Random randomBC = new Random();
                int dadoBarbaro = randomBC.nextInt(21);
                System.out.println("dado barbaro: " + dadoBarbaro);
                int dadoCaballero = randomBC.nextInt(21);
                System.out.println("dado caballero: " + dadoCaballero);

                if (dadoBarbaro > dadoCaballero) {
                    barbaro.combo += 1;
                    barbaro.setAtk(barbaro.atk + barbaro.combo);
                    System.out.println("ATACA EL BARBARO: " + barbaro.getNombre());
                    barbaro.Skill();
                    caballero.hp = caballero.hp - (barbaro.atk - caballero.def);
                    caballero.mostrar();
                } else if (dadoCaballero > dadoBarbaro) {
                    caballero.combo = 0;
                    System.out.println("ATACA EL CABALLERO: " + caballero.getNombre());
                    caballero.Skill();
                    barbaro.hp = barbaro.hp - (caballero.atk - barbaro.def);
                    barbaro.mostrarBarbaro();
                }
            }
            break;
            default:
                break;
        }
    }
}


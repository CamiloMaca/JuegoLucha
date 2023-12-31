import java.util.Random;
import java.util.Scanner;

public class Mago extends Personaje {

    protected int mana;

    //
    public Mago(){

    }
    public Mago(String nombre, int hp, int atk, int def, int mana) {
        super(nombre, hp, atk, def);
        this.mana = mana;
    }


    //
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    //
    public int suerte() {
        int result = (int) (Math.random() * (20 - 1 + 1) + 1);
        return result;
    }

    public void mostarMago() {
        // Random random = new Random();
        // this.hp = random.nextInt(10) + 1;
        System.out.println("nombre: " + this.Nombre);
        System.out.println("vida: " + this.hp);
        System.out.println("ataque: " + this.atk);
        System.out.println("defensa: " + this.def);
        System.out.println("mana: " + this.mana);

    }

    // permite al mago elegir un arma
    public void armaMago() {
        Scanner sc = new Scanner(System.in);
        int opcionArma;
        System.out
                .println("Armería para magos: \n1. Varita (+1 de ataque). \n2. Báculo (+2 de ataque). \n0. Para salir");
        opcionArma = sc.nextInt();
        switch (opcionArma) {
            case 1:
                System.out.println("Has elegido la varita.");
                this.atk += 1;
                break;
            case 2:
                System.out.println("Has elegido el Baculo.");
                this.atk += 2;
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
    }

    // Permite al mago elegir una armadura
    public void armaduraMago() {
        Scanner sc = new Scanner(System.in);
        int opcionArmadura;
        System.out.println(
                "Armaduras para magos:\n1. Tunica (+1 de defensa).\n2.armadura de malla (+2 de defensa).\n0. Para sailr ");
        opcionArmadura = sc.nextInt();
        switch (opcionArmadura) {
            case 1:
                System.out.println("Has elegido la Tunica.");
                this.def += 1;
                break;
            case 2:
                System.out.println("Has elegido la Armdura de malla.");
                this.def += 2;
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
    }

    public void habilidadesMago() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Habilidades");
        System.out.println("1. buff.");
        System.out.println("2. curacion.");
        System.out.println("Elige con cuidado ya que solo tendra una oportunidad de escoger la mejor habilidad.");
        int opcionHabilidad;
        opcionHabilidad = sc.nextInt();
        switch (opcionHabilidad) {
            case 1:
                System.out.println(
                        "buffs.\n1.potenciador de atk +1.\n2.potenciador de def +3.");
                int opcBuff;
                opcBuff = sc.nextInt();
                switch (opcBuff) {
                    case 1:
                        System.out.println("potenciador de atk.");
                        this.BuffAtk();
                        break;
                    case 2:
                        System.out.println("potenciador de def.");
                        this.BuffDef();
                        break;
                    default:

                        break;
                }
                break;
            case 2:
                System.out.println(
                        "curaciones.\n1.cuarcion menor +1 de salud y -2 de mana.\n2.curacion media +2 de salud y -3 de mana.\n3.curacion mayor +3 de salud y -4 de mana.");
                int opcCuracion;
                opcCuracion = sc.nextInt();
                switch (opcCuracion) {
                    case 1:
                        if (this.mana >= 2 && this.getHp() < this.hp) {
                            System.out.println("cuarcion menor.");
                            this.mana -= 2;
                            this.CuracionMenor();
                        } else if (this.mana < 2 || this.getHp() == this.hp) {
                            System.out.println("mana insuficiente para curarse.");
                        }
                        break;
                    case 2:
                        if (this.mana >= 3 && this.getHp() < this.hp) {
                            System.out.println("cuarcion media.");
                            this.mana -= 3;
                            this.CuracionMedia();
                        } else if (this.mana < 3 || this.getHp() == this.hp) {
                            System.out.println("mana insuficiente para curarse.");
                        }
                        break;
                    case 3:
                        if (this.mana >= 4 && this.getHp() < this.hp) {
                            System.out.println("cuarcion menor.");
                            this.mana -= 4;
                            this.CuracionMayor();
                        } else if (this.mana < 4 || this.getHp() == this.hp) {
                            System.out.println("mana insuficiente para curarse.");
                        }
                        break;
                    default:
                        System.out.println("opcion no valida.");
                        break;
                }
                break;
            default:
                System.out.println("opcion no valida.");
                break;
        }
    }

    // HABILIDADES
    // CURAR
    public int CuracionMenor() {
        return this.hp = +1; 
    }

    public int CuracionMedia() {
        return this.hp = +2;
    }

    public int CuracionMayor() {
        return this.hp = +3;
    }

    // BUFF
    public int BuffAtk() {
        return this.atk = +1;
    }

    public int BuffDef() {
        return this.def = +2;
    }
}

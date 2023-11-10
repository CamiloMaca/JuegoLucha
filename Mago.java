import java.util.Scanner;

public class Mago extends Personaje {

    private int mana;

    //

    public Mago(String nombre, int hp, int atk, int def, int des, int mana) {
        super(nombre, hp, atk, def, des);
        this.mana = mana;
    }

    //
    public Mago(String nombre) {
        super(nombre);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getArma() {
        return arma;
    }

    public void setArma(int arma) {
        this.arma = arma;
    }

    //
    public int suerte() {
        int result = (int) (Math.random() * (20 - 1 + 1) + 1);
        return result;
    }

    public void mostarMago() {
        System.out.println("nombre: " + this.Nombre);
        System.out.println("vida: " + this.hp);
        System.out.println("ataque: " + this.atk);
        System.out.println("defensa: " + this.def);
        System.out.println("destreza: " + this.des);
        System.out.println("mana: " + this.mana);
    }

    public void LucharMago(Caballero l1) {
        int cont = 0;
        while (l1.hp > 0 && this.hp > 0) {
            cont++;
            int suer1 = suerte();
            System.out.println(suer1);
            int suer2 = suerte();
            System.out.println(suer2);
            System.out.println();

            this.setDes(this.des + suer1);
            l1.setDes(l1.des + suer2);

            this.mostarMago();
            System.out.println();
            l1.mostrar();
            System.out.println();

            if (this.des > l1.des) {
                System.out.println("Ataca: " + this.Nombre);
                l1.hp = l1.hp - (this.atk - l1.def);
                l1.mostrar();
            } else if (this.des < l1.des) {
                System.out.println("Ataca: " + l1.Nombre);
                this.hp = this.hp - (l1.atk - this.def);
                this.mostarMago();
            }
            if (cont == 3) {
                cont = 0;
                this.CurarMenor();
            }
            this.des = 60;
            l1.setDes(60);
        }
    }

    // permite al mago elegir un arma
    public void armaMago() {
        Scanner sc = new Scanner(System.in);
        int atkAcumulado = 0;
        while (true) {
            int opcionArma;
            System.out.println(
                    "Armería para magos: \n1. Varita (+1 de ataque). \n2. Báculo (+2 de ataque). \n0. Para salir");
            opcionArma = sc.nextInt();
            if (opcionArma == 0) {
                break;
            }
            int atkAdicional = 0;
            switch (opcionArma) {
                case 1:
                    System.out.println("Has elegido la varita.");
                    atkAdicional = 1;
                    break;
                case 2:
                    System.out.println("Has elegido el Baculo.");
                    atkAdicional = 2;
                    break;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo.");
                    break;
            }
            this.setAtk(this.getAtk() - atkAcumulado + atkAdicional);
            atkAcumulado = atkAdicional;
        }
    }

    // Permite al mago elegir una armadura
    public void armaduraMago() {
        Scanner sc = new Scanner(System.in);
        int defAcumulada = 0;
        while (true) {
            int opcionArmadura;
            System.out.println(
                    "Armaduras para magos:\n1. Tunica (+1 de defensa).\n2.armadura de malla (+2 de defensa).\n0. Para sailr ");
            opcionArmadura = sc.nextInt();
            if (opcionArmadura == 0) {
                break;
            }
            int defAdicional = 0;
            switch (opcionArmadura) {
                case 1:
                    System.out.println("Has elegido la Tunica.");
                    defAdicional = 1;
                    break;
                case 2:
                    System.out.println("Has elegido la Armdura de malla.");
                    defAdicional = 2;
                    break;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo.");
                    break;
            }
            this.setDef(this.getDef() - defAcumulada + defAdicional);
            defAcumulada = defAdicional;
        }
    }

    public void habilidadesMago() {
        System.out.println("Habilidades");
        Scanner sc = new Scanner(System.in);
        int opcionHabilidad;
        opcionHabilidad = sc.nextInt();
        switch (opcionHabilidad) {
            case 1:
                CurarMenor();
                break;
            case 2:
                ataqueFuego();
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public void balaMana() {
        this.atk += 1;
    }

    public void CurarMenor() {
        System.out.println("Elegiste el Curar +12 (3-Turnos).");
        this.hp += 12;
    }

    public void ataqueFuego() {
        System.out.println("Elegiste ataque de Fuego 10 (2-Turnos).");
        this.hp -= 10;
    }

}

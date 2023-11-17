import java.util.Scanner;

public class Caballero extends Personaje {

    private int combo;

    public Caballero(String nombre, int hp, int atk, int def, int des) {
        super(nombre, hp, atk, def, des);
        this.combo = combo;
    }

    //
    public void mostrar() {
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Salud: " + this.hp);
        System.out.println("Ataque: " + this.atk);
        System.out.println("Defensa: " + this.def);
        System.out.println("Destreza: " + this.des);
    }

    public int suerte() {
        int result = (int) (Math.random() * (20 - 1 + 1) + 1);
        return result;
    }

    public void Luchar(Mago mago) {
        while (this.hp>0 && mago.hp>0) {
            this.Skill(mago);
            this.hp = this.hp - (mago.atk - this.def);
            mago.hp = mago.hp - (this.atk - mago.def);
            this.mostrar();
            mago.mostarMago();
            this.atk = 100;
            this.def = 90;
            this.des = 60;
            
        }
    }

    public void armaduraCaballero() {
        Scanner sc = new Scanner(System.in);
        int opcionArmadura;
        System.out.println(
                "Armadura para Caballero:\n1. armadura de cuero (+1 de defensa).\n2. armadura de placas (+2 de defensa).\n0. para salir.");
        opcionArmadura = sc.nextInt();
        switch (opcionArmadura) {
            case 1:
                System.out.println("elegiste armadura de cuero.");
                this.def += 1;
                break;
            case 2:
                System.out.println("elegiste armadura de placas.");
                this.def += 2;
                break;
            default:
                System.out.println("opcion no valida.");
                break;
        }
    }

    public void armaCaballero() {
        Scanner sc = new Scanner(System.in);
        int opcionArma;
        System.out.println("Arma para Caballero:\n1.espada(+1 de atk).\n2.lanza(+2 de atk).\n0.para salir.");
        opcionArma = sc.nextInt();
        switch (opcionArma) {
            case 1:
                System.out.println("elegiste la espada.");
                this.atk += 1;
                break;
            case 2:
                System.out.println("elegiste la lanza.");
                this.atk += 2;
                break;
            default:
                System.out.println("opcion no valida.");
                break;
        }
    }

    public void Skill(Mago mag) {
        Scanner sc = new Scanner(System.in);
        int opcSkill;
        System.out.println("Skills");
        System.out.println("1.Ventajas.\n2.Habilidades Ofensivas.");
        System.out.println("Elige con cuidado ya que solo tendra una oportunidad de escoger la mejor habilidad.");
        opcSkill = sc.nextInt();
        switch (opcSkill) {
            case 1:
                System.out.println("Ventajas:\n1.Furia Guerrera.\n2.Intimidar.");
                int opcVentajas;
                opcVentajas = sc.nextInt();
                switch (opcVentajas) {
                    case 1:
                        System.out.println("Furia Guerrera.");
                        this.furiaGuerrera();
                        break;
                    case 2:
                        System.out.println("Intimidar.");
                        this.intimidar(mag);
                        break;
                    default:
                        break;
                }
                break;
            case 2:
            System.out.println("Habilidades ofensivas:\n1.Ataque Poderoso.\2.Escudo Protector.");
            int opcHabilidadOfensiva;
            opcHabilidadOfensiva=sc.nextInt();
            switch (opcHabilidadOfensiva) {
                case 1:
                    System.out.println("Ataque poderoso.");
                    this.ataquePoderoso();
                    break;
                case 2:
                    System.out.println("Escudo potector.");

                break;
                default:
                    break;
            }
            default:
                break;
        }
    }

    public void furiaGuerrera() {
        this.atk += 1;
        this.des += 1;
    }
    public void intimidar(Mago mago) {
        mago.def -= 2;
    }
    public void ataquePoderoso(){
        this.atk *=2;
    }
    public void escudoProtector(){
        this.def *=2;
    }
}

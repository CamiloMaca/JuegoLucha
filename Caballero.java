import java.util.Scanner;

public class Caballero extends Personaje {

    protected int combo;
    //
    public Caballero(){
        
    }
    public Caballero(String nombre, int hp, int atk, int def) {
        super(nombre, hp, atk, def);
        this.combo = combo;
    }
    //
   public int getCombo() {
        return combo;
    }
    public void setCombo(int combo) {
        this.combo = combo;
    }
    //
    public void mostrar() {
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Salud: " + this.hp);
        System.out.println("Ataque: " + this.getAtk());
        System.out.println("Defensa: " + this.def);
    }

    public void armaduraCaballero() {
        Scanner sc = new Scanner(System.in);
        int opcionArmadura;
        System.out.println( "Armadura para Caballero:\n1. armadura de cuero (+1 de defensa).\n2. armadura de placas (+2 de defensa).\n0. para salir.");
        opcionArmadura=sc.nextInt();
        switch (opcionArmadura) {
            case 1:
                System.out.println("elegiste armadura de cuero.");
                this.armaduraCuero();
                break;
            case 2:
                System.out.println("elegiste armadura de placas.");
                this.armaduraPlacas();
                break;
            default:
                System.out.println("opcion no valida.");
                break;
        }
        this.mostrar();
    }

    public void armaCaballero() {
        Scanner sc = new Scanner(System.in);
        int opcionArma;
        System.out.println("Arma para Caballero:\n1.espada(+1 de atk).\n2.lanza(+2 de atk).\n0.para salir.");
        opcionArma = sc.nextInt();
        switch (opcionArma) {
            case 1:
                System.out.println("elegiste la espada.");
                this.espada();
                break;
            case 2:
                System.out.println("elegiste la lanza.");
                this.lanza();
                break;
            default:
                System.out.println("opcion no valida.");
                break;
        }
    }

    public void Skill() {
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
                        this.intimidar();
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
// HABILIDADES
    public void furiaGuerrera() {
         this.setAtk(this.atk+ 1);
    }
    public int intimidar() {
       return -1;
        //probar
    }
    public int ataquePoderoso(){
        return this.atk = +10;
    }
    public int escudoProtector(){
        return this.def = +12;
    }
// ARMAS
    public int espada(){
        return this.atk = +1;
    }
    public int lanza(){
        return this.atk = +2;
    }
//ARMADURAS
    public int armaduraCuero(){
        return this.def = +1;
    }
    public int armaduraPlacas(){
        return this.def = +2;
    }

}

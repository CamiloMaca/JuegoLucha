import java.util.Scanner;

public class Barbaro extends Caballero {
    private int furia;
    //
    public Barbaro(){

    }
    public Barbaro(String nombre, int hp, int atk, int def) {
        super(nombre, hp, atk, def);
        this.furia = furia;
    }
    //
    public int getFuria() {
        return furia;
    }
    public void setFuria(int furia) {
        this.furia = furia;
    }
    //
    public void mostrarBarbaro(){
        System.out.println("nombre: " + this.Nombre);
        System.out.println("vida: " + this.hp);
        System.out.println("ataque: " + this.atk);
        System.out.println("defensa: " + this.def);
    }
    public void armaBarbaro(){
        Scanner sc = new Scanner(System.in);
        int opcArma;
        System.out.println("Armeria del BARBARO:\n1.Hacha(+1 de ataque).\n2.Martillo de guerra(+2 de ataque).");
        opcArma=sc.nextInt();
        switch (opcArma) {
            case 1:
                System.out.println("elegiste el Hacha(+1 de ataque).");
                this.atk+=1;
                break;
            case 2:
                System.out.println("elegiste el Martillo de guerra(+2 de ataque).");
                this.atk+=2;
                break;
            default:
                break;
        }
    }
    public void armaduraBarbaro(){
        Scanner sc = new Scanner(System.in);
        int armaduraBarbaro;
        System.out.println("Armaduras para BARBAROS:\n1.piel de oso(+3 de def).\n2.piel de gigante(+4 de def).)");
        armaduraBarbaro=sc.nextInt();
        switch (armaduraBarbaro) {
            case 1:
                System.out.println("elegiste la piel de oso(+3 de def).");
                this.def +=3;
                break;
            case 2:
                System.out.println("elegiste la piel de gigante(+4 de def)");
                this.def+=4;
                break;
            default:
                break;
        }
    }
    public void skillBarbaro(Caballero caballero, Mago mago) {
        Scanner sc = new Scanner(System.in);
        int opcSkill;
        System.out.println("Skills para Barbaro");
        System.out.println("1. Embestida Feroz.");
        System.out.println("2. Grito de Guerra.");
        System.out.println("3. Golpe Desgarrador.");
        opcSkill = sc.nextInt();
    
        switch (opcSkill) {
            case 1:
                System.out.println("Embestida Feroz.");
                this.embestidaFeroz(mago);
                break;
            case 2:
                System.out.println("Grito de Guerra.");
                this.gritoDeGuerra(caballero);
                break;
            case 3:
                System.out.println("Golpe Desgarrador.");
                this.golpeDesgarrador(mago, caballero);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public void embestidaFeroz(Mago mago) {
        this.atk += 2;  
        mago.setDef(mago.getDef() - 1); 
    }
    
    public void gritoDeGuerra(Caballero caballero) {
        caballero.setDef(caballero.getDef() - 2);  
        this.furia += 1;  
    }
    
    public void golpeDesgarrador(Mago mago, Caballero caballero) {
        int danioExtra = this.furia * 2;  
        caballero.setHp(caballero.getHp() - danioExtra);  
        mago.setHp(mago.getHp() - danioExtra);  
        this.furia = 0;  
    }
}

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
        int suer1 = suerte();
        System.out.println(suer1);
        int suer2 = suerte();
        System.out.println(suer2);

        this.setDes(this.des + suer1);
        mago.setDes(mago.des + suer2);

        System.out.println(
                "Nombre: " + this.Nombre + " Salud: " + this.hp + " Ataque: " + this.atk + " Defensa: " + this.def
                        + " Destreza: " + this.des);
        System.out.println(
                "Nombre: " + mago.Nombre + " Salud: " + this.hp + " Ataque: " + mago.atk + " Defensa: " + mago.def
                        + " Destreza: " + mago.des);
        System.out.println();

        if (this.des > mago.des) {
            System.out.println("Ataca: " + this.Nombre);
            mago.hp = mago.hp - (this.atk - mago.def);
            mago.mostarMago();
        } else if (this.des < mago.des) {
            System.out.println("Ataca: " + mago.Nombre);
            this.hp = this.hp - (mago.atk - this.def);
            this.mostrar();
        }
        this.des = 60;
        mago.des = 60;

    }

}

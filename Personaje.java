import java.util.Random;
import java.util.Scanner;

public class Personaje {
    protected String Nombre;
    protected int hp;
    protected int atkFisico;
    protected int atkElemental;
    protected int atk;
    protected int defFisico;
    protected int defElemental;
    protected int def;
    //
    public Personaje() {
    }
    public Personaje(String nombre, int hp, int atk, int def) {
        Nombre = nombre;
        this.hp = hp;
        this.atk=atk;
        this.def=def;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getAtkFisico() {
        return atkFisico;
    }
    public void setAtkFisico(int atkFisico) {
        this.atkFisico = atkFisico;
    }
    public int getAtkElemental() {
        return atkElemental;
    }
    public void setAtkElemental(int atkElemental) {
        this.atkElemental = atkElemental;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public int getDefFisico() {
        return defFisico;
    }
    public void setDefFisico(int defFisico) {
        this.defFisico = defFisico;
    }
    public int getDefElemental() {
        return defElemental;
    }
    public void setDefElemental(int defElemental) {
        this.defElemental = defElemental;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
    //
    
    
    
}

    
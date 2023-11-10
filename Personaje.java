public class Personaje {
    protected String Nombre;
    protected int hp;
    protected int atk;
    protected int def;
    protected int des;
    protected int arma;

    //
    public Personaje() {
    
    }

    

    public Personaje(String nombre) {
        Nombre = nombre;
    }



    public Personaje(String nombre, int hp, int atk, int def, int des) {
        Nombre = nombre;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.des = des;
        this.arma = arma;

    }

    //
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

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getDes() {
        return des;
    }

    public void setDes(int des) {
        this.des = des;
    }

    public int getArma() {
        return arma;
    }

    public void setArma(int arma) {
        this.arma = arma;
    }

    //
    public void prueba() {

    }
}

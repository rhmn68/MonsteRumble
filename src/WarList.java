import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rahman on 5/10/2017.
 */
public class WarList {
    ArrayList<Monster> dbMonster = new ArrayList<>();
    ArrayList<Weapon> dbWeapon = new ArrayList<>();
    ArrayList<Armor> dbArmor = new ArrayList<>();

    public void getMonster(Monster m){
        dbMonster.add(m);
    }
    public void getWeapon(Weapon w){
        dbWeapon.add(w);
    }
    public void getArmor(Armor a){
        dbArmor.add(a);
    }

    public Monster setMonster(int idM){
       return dbMonster.get(idM);
    }

    public Weapon setWeapon(int idW){
        return dbWeapon.get(idW);
    }

    public Armor setArmor(int idA){
        return dbArmor.get(idA);
    }

    public void addMonster(){
        Monster m1 = new Monster(1,"Badak",75,10,20);getMonster(m1);
        Monster m2 = new Monster(2,"Piton",100,20,0);getMonster(m2);
        Monster m3 = new Monster(3,"Kura",125,5,10);getMonster(m2);
    }

    public void addWeapon(){
        Weapon w1 = new Weapon();
    }

    public void addArmor(){

    }
}

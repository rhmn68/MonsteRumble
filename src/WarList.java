import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rahman on 5/10/2017.
 */
public class WarList {
    ArrayList<Monster> dbMonster = new ArrayList<>();
    ArrayList<Weapon> dbWeapon = new ArrayList<>();
    ArrayList<Armor> dbArmor = new ArrayList<>();

    public void addMonster(Monster m){
        dbMonster.add(m);
    }
    public void addWeapon(Weapon w){
        dbWeapon.add(w);
    }
    public void addArmor(Armor a){
        dbArmor.add(a);
    }

    public Monster cariMonster(int idM){
       return dbMonster.get(idM);
    }

    public Weapon cariWeapon(int idW){
        return dbWeapon.get(idW);
    }
}

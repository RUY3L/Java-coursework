import java.util.HashMap;

public class Bulbasaur extends Pokemon implements Attack{
    HashMap<String, Integer> Attacks = new HashMap<>();
    Bulbasaur(String Name){
        this.name = Name;
        this.type = "fire";
        this.health = 60;
        Attacks.put("Fire ball", 10);
        Attacks.put("Fire shot", 30);
        Attacks.put("Amaterasu", 50);
    }
    void getAttacks(){
        System.out.println("Pick and type an attack from the following: "
                + Attacks);
    }
    @Override
    public int performAttack(String attackIndex, Pokemon defender) {
        int dmg;
        if (defender.type.equals("grass")){
            dmg = 2* Attacks.get(attackIndex);
            defender.health = defender.health-dmg;
        }
        else if (defender.type.equals("water")){
            dmg = (int) (0.5 * Attacks.get(attackIndex));
            defender.health = defender.health-dmg;
        }
        else {
            dmg = Attacks.get(attackIndex);
            defender.health = defender.health-dmg;
        }
        return dmg;
    }
}

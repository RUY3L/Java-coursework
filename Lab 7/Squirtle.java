import java.util.HashMap;

public class Squirtle extends Pokemon implements Attack{
    HashMap<String, Integer> Attacks = new HashMap<>();
    Squirtle(String Name){
        this.name = Name;
        this.type = "grass";
        this.health = 80;
        Attacks.put("Grass shard", 10);
        Attacks.put("Grass shot", 30);
        Attacks.put("Grass needle", 40);
    }
    void getAttacks(){
        System.out.println("Pick and type an attack from the following: "
                + Attacks);
    }
    @Override
    public int performAttack(String attackIndex, Pokemon defender) {
        int dmg;
        if (defender.type.equals("water")){
            dmg = 2* Attacks.get(attackIndex);
            defender.health = defender.health-dmg;
        }
        else if (defender.type.equals("fire")){
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

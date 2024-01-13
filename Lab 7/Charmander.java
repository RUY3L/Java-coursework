import java.util.HashMap;

class Charmander extends Pokemon implements Attack{
    HashMap<String, Integer> Attacks = new HashMap<>();
    Charmander(String Name){
        this.name = Name;
        this.type = "water";
        this.health = 100;
        Attacks.put("Water squirt", 10);
        Attacks.put("Water shot", 20);
        Attacks.put("Water blast", 30);
    }
    void getAttacks(){
        System.out.println("Pick and type an attack from the following: "
                + Attacks);
    }
    @Override
    public int performAttack(String attackIndex, Pokemon defender) {
        int dmg;
        if (defender.type.equals("fire")){
            dmg = 2* Attacks.get(attackIndex);
            defender.health = defender.health-dmg;
        }
        else if (defender.type.equals("grass")){
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

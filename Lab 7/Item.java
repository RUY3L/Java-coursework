public class Item {
    void heal(Pokemon myPoke){
        myPoke.health = myPoke.health+15;
    }
    void smite(Pokemon myPoke){
        myPoke.health = myPoke.health-15;
    }
    void revive(Pokemon myPoke){
        myPoke.health = 20;
    }
}

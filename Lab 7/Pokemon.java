import java.util.HashMap;

abstract class Pokemon implements Attack{
    String name;
    String type;
    int health;

    String getName(){
        return "Name: "+this.name;
    }
    String getType(){
        return "Type: "+this.type;
    }
    String getHealth(){
        return "Health: "+this.health;
    }

    void getAttacks(){}
}

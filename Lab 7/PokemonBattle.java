import java.util.Scanner;

public class PokemonBattle{
    public static void main(String[] args) {
        Pokemon Charlie = new Charmander("Charlie");
        Pokemon Fred = new Charmander("Fred");
        Pokemon Silco = new Squirtle("Silco");
        Pokemon Saul = new Squirtle("Saul");
        Pokemon Ralph = new Bulbasaur("Ralph");
        Pokemon Ron = new Bulbasaur("Ron");

        Player Player1 = new Player();
        Player Player2 = new Player();
        Item Item = new Item();

        Player1.items.add(Item);
        Player1.items.add(Item);
        Player1.items.add(Item);
        Player2.items.add(Item);
        Player2.items.add(Item);
        Player2.items.add(Item);

//        for(int i = 0; i<2; i++){
//            Scanner myObj = new Scanner(System.in);
//            String pokeName = myObj.nextLine();
//            Pokemon pokeName = new Charmander(pokeName);
//        }
        Player1.team.add(Charlie);
        Player1.team.add(Silco);
        Player1.team.add(Ron);
        Player2.team.add(Fred);
        Player2.team.add(Ralph);
        Player2.team.add(Saul);

        int turn=1;
        String crp;
        boolean end=false;
        while (!end) {
            Player CurrentPLR;
            Player DefencePLR;
            Pokemon defender;
            if (turn % 2 == 0) {
                CurrentPLR = Player2;
                DefencePLR = Player1;
                crp = "Player 2";
            } else {
                CurrentPLR = Player1;
                DefencePLR = Player2;
                crp = "Player 1";
            }
            System.out.println("11111  Player One's team  11111: ");
            for(int i = 0; i<Player1.team.size(); i++){
                System.out.print((i+1)+ ") ");
                System.out.print(Player1.team.get(i).getName()+ "   ");
                System.out.print(Player1.team.get(i).getType() + "   ");
                System.out.println(Player1.team.get(i).getHealth()+ "   ");
            }
            System.out.println("22222  Player Two's team  22222: ");
            for(int i = 0; i<Player2.team.size(); i++){
                System.out.print((i+1)+ ") ");
                System.out.print(Player2.team.get(i).getName()+ "   ");
                System.out.print(Player2.team.get(i).getType() + "   ");
                System.out.println(Player2.team.get(i).getHealth()+ "   ");
            }
            System.out.println();
            System.out.println("=====Turn "+turn+"=====");
            System.out.println("Current player: "+crp);
            System.out.print("Choose a Pokemon(use number): ");
            //Pick Attacker
            Scanner myObj = new Scanner(System.in);
            int pokePick = myObj.nextInt() -1;

            System.out.print("You picked: ");
            System.out.print(CurrentPLR.team.get(pokePick).name+ "   ");
            System.out.print(CurrentPLR.team.get(pokePick).getType()+ "   ");
            System.out.println(CurrentPLR.team.get(pokePick).getHealth());
            CurrentPLR.team.get(pokePick).getAttacks();

            //Pick attack
            System.out.print("Attack: ");
            Scanner myObj2 = new Scanner(System.in);
            String attackinput = myObj2.nextLine();


            //Pick Defender
            System.out.print("Pick the opponent(use number): ");
            Scanner myObj3 = new Scanner(System.in);
            int defenderpick = myObj3.nextInt() -1;
            System.out.print("You picked: ");
            System.out.print(DefencePLR.team.get(defenderpick).name+"   ");
            System.out.print(DefencePLR.team.get(defenderpick).getType()+"    ");
            System.out.println(DefencePLR.team.get(defenderpick).getHealth());

            //Perform Attack (type the attack exactly, like "Amaterasu" or "Water blast")
            System.out.println("You did "+CurrentPLR.team.get(pokePick).performAttack(attackinput,DefencePLR.team.get(defenderpick))+" dmg to "+DefencePLR.team.get(defenderpick).name);

            //Check HP
            if (DefencePLR.team.get(defenderpick).health<=0){
                System.out.println(DefencePLR.team.get(defenderpick).name+" has fainted.");
                DefencePLR.dead.add(DefencePLR.team.get(defenderpick));
                DefencePLR.team.remove(defenderpick);
            }

            //Item Use (type the item exactly, like "heal" or "smite" in prompt)
            System.out.print("Number of usable items remaining: ");
            System.out.println(CurrentPLR.items.size()+", Options are: heal, smite, revive");
            for(int l=0;l<CurrentPLR.dead.size(); l++) {
                System.out.print("Your Fainted Pokemon(s): "+(l+1)+") ");
                System.out.println(CurrentPLR.dead.get(l).name);
            }
            System.out.print("Pick an item(else press enter): ");
            Scanner myObj4 = new Scanner(System.in);
            String Itempick = myObj4.nextLine();
            int Userpick=0;
            if (!Itempick.isEmpty()) {
                System.out.print("Pick an user(else press enter): ");
                Scanner myObj5 = new Scanner(System.in);
                Userpick = myObj5.nextInt() - 1;
            }
            //Item use executed
            if (Itempick.equals("heal")){
                CurrentPLR.items.get(0).heal(CurrentPLR.team.get(Userpick));
                System.out.println(CurrentPLR.team.get(Userpick).name+" Got healed +15");
                CurrentPLR.items.remove(0);
            } else if (Itempick.equals("smite")) {
                CurrentPLR.items.get(0).smite(DefencePLR.team.get(Userpick));
                System.out.println(DefencePLR.team.get(Userpick).name+" Got smited -15");
                CurrentPLR.items.remove(0);
            } else if (Itempick.equals("revive")) {
                CurrentPLR.items.get(0).revive(CurrentPLR.dead.get(Userpick));
                System.out.println(CurrentPLR.dead.get(Userpick).name+" Got revived");
                CurrentPLR.team.add(CurrentPLR.dead.get(Userpick));
                CurrentPLR.dead.remove(Userpick);
                CurrentPLR.items.remove(0);
            }

            //Round ends
            System.out.println("____Turn end____");
            System.out.println();
            turn++;
            if (Player2.team.size() == 0 || Player1.team.size() == 0){
                end = true;
            }
        }
        System.out.println("Battle is over!");
        if (Player2.team.size() == 0){
            System.out.println("Victory for Player 1");
        } else if (Player1.team.size()==0) {
            System.out.println("Victory for Player 2");
        }
    }
}

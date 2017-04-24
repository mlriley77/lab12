/**
 * Created by MichaelRiley on 4/23/17.
 */
public class TheSharks extends Player{
    //int [] sharkArray = {0};


    //sharkArray[0] = "Rock"



    @Override
    public void name(String name) {
        String shark = "the sharks";
        //System.out.println("The Sharks");


    }

    @Override
    public void oppChoice(String opp) {
        if(opp.equalsIgnoreCase("TheSharks"));

    }

    @Override
    public void userPick(String pick) {

    }

    @Override
    public void result(String result) {
        String [] game = new String [1];
        game [0] = "Rock";

        if(result.equalsIgnoreCase("Sharks"));
        System.out.println("The Sharks: " + game[0]);
    }
}

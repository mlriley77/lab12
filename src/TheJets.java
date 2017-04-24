

import java.util.ArrayList;
import java.util.Random;


public class TheJets extends Player {
    Random random = new Random();




    @Override
    public void name(String name) {

    }

    @Override
    public void oppChoice(String opp) {
        if(opp.equalsIgnoreCase("Jets"));
       //System.out.println("TheJets: ");
    }


    @Override
    public void userPick(String pick) {

    }

    @Override
    public void result(String result) {


    }

    public Random getRandom() {
        String [] game = new String [3];
        game [0] = "Rock";
        game [1] = "Paper";
        game [2] = "Scissors";

        int num = (int) (Math.random()*3);//this was luck - but needs more explanation

        System.out.println("The Jets: " + game[num]);

        return random;
    }
}

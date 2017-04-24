/**
 * Created by MichaelRiley on 4/21/17.
 */
public class Human extends Player {


    @Override
    public void name(String name) {//userName is called from the mainApp
        System.out.println(name);
    }

    @Override
    public void oppChoice(String opp) {
        //System.out.println(opp);
    }

    @Override
    public void userPick(String pick) {

        String [] game = new String [3];
        game [0] = "Rock";
        game [1] = "Paper";
        game [2] = "Scissors";

        if (pick.equalsIgnoreCase("r"))
            System.out.println("Michael: " + game[0]);//Michael: + game[0] was done so I could compare my result instead of printing "rock"
        else if (pick.equalsIgnoreCase("p"))
            System.out.println("Michael: " + game[1]);
        else if (pick.equalsIgnoreCase("s"))
            System.out.println("Michael: " + game[2]);
    }

    @Override
    public void result(String result) {

    }


}

/**
 * Created by MichaelRiley on 4/21/17.
 */
public abstract class Player {

    public abstract void name(String name);//this declares that a string needs to be passed through the
                                            //method before being called by other classes
    public abstract void oppChoice(String opp);
    public abstract void userPick(String pick);
    public abstract void result(String result);



}

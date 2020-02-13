package lib.logic;

import java.util.*;

public class Decider{

    private ArrayList<Horse> horses;
    private Horse prevLead;

    Decider(ArrayList<Horse> horses){
        this.horses = horses;
    }

    public String getCurrentLead(){
        return horses.get(new Random().nextInt(horses.size())).getName();
    }
}
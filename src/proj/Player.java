/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ypb83
 */
public class Player {
    
    public final String pName;
    public String pChoice;
    public String dChoice;
    public String pickup;
    public int turnCount;
    Deck t;
    DestinationDeck g;
    Route r;
    
    ArrayList<Card> THand = new ArrayList<>();
    ArrayList<DestinationTicket> DHand = new ArrayList<>();
    
    Player(String name){
        this.pName = name;
    }
    
        Player p;
    
    public String getpName(){
        return pName;
    }
    
    public String pTurn(String c){
        this.pChoice = c;
        return pChoice;
    }
    
    boolean ValidMove(){           //default true just for testing
        if (pChoice == "Draw cards")
        {
            if(t.totalC != 0)
                return true;
            return false;
        }
        else if (pChoice == "Destination ticket")
        {
            if(g.desTickets != 0)
                return true;
            return false;
        }
        else if (pChoice == "Claim Route")
        {
            for(int i =0; i < DHand.size(); i++)
            {
                if(DHand.get(i) == r.Route && r.colorNum() == r.length;)
            }
        }
    }
    
}
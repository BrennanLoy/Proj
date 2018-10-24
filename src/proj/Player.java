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
    
    
    Player(String name){
        this.pName = name;
    }
    
    public String getpName(){
        return pName;
    }
    
    public String pTurn(String c){
        this.pChoice = c;
        return pChoice;
    }
    
    boolean ValidMove(){           //default true just for testing
        if (pchoice == "Draw cards")
        {
            while(turnCount < 2)
            {
                if(dChoice == "Draw from Deck")
                {
                    if(t.draw() == "Wild")
                        turnCount = 2;
                    else
                        turnCount++;
                }
                else if(dChoice == "Draw from Pile")
                {
                    if(pickup == "Wild")
                        turnCount = 2;
                    else
                        turnCount++;
                }      
            }
        }
        else if (pchoice == "Destination ticket")
        {
            if(t.desDraw != 0)
                return true;
            else
                return false;
        }
        else if (pchoice == "Claim Route")
        {
            
        }
    }
    
    ArrayList<Card> THand = new ArrayList<>();
    ArrayList<DestinationTicket> DHand = new ArrayList<>();
}
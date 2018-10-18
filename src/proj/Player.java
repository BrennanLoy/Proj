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
        return true;
    }
    
    ArrayList<Card> THand = new ArrayList<>();
    ArrayList<DestinationTicket> DHand = new ArrayList<>();
}
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
    
    ArrayList<Card> THand = new ArrayList<>();
    ArrayList<DestinationTicket> DHand = new ArrayList<>();
    
    Player(String name){
        this.pName = name;
    }
    
    
    public String getpName(){
        return pName;
    }
    
    public static void drawTrainCardTurn(Deck d){ 
    }
    public static void drawDestinationTicketTurn(DestinationDeck d){
    }
    public static void claimRouteTurn(){
    }
    
    public void pTurn(Deck t, DestinationDeck g, Route r){
        Scanner S = new Scanner(System.in);
        System.out.println("1: Draw Car, 2: Draw Ticket, 3: Claim Route");
        int a = S.nextInt();
        switch(a){
            case 1:
                if(validMove(a,t,g,r))
                    drawTrainCardTurn(t);
                break;
            case 2:
                if(validMove(a,t,g,r))
                    drawDestinationTicketTurn(g);
                break;
            case 3:
                if(validMove(a,t,g,r))
                    claimRouteTurn();
                break;
            default:
                break;   
        }   
    }
    
    boolean validMove(int v, Deck t, DestinationDeck g, Route r){ 
        int redl = 0,bluel = 0,whitel = 0,blackl = 0,purplel = 0,orangel = 0,yellowl = 0,greenl = 0,wildl = 0;
        switch (v) {
            case 1:
                if(t.totalC != 0)
                    return true;
                return false;
            case 2:
                if(g.desTickets != 0)
                    return true;
                return false;
            case 3:
                for(int i = 0; i < DHand.size(); i++){
                    if(DHand.get(i).name.equals(r.Route)){
                        if(null != this.THand.get(i).color){
                            for(int j = 0; j < THand.size(); j++){
                                switch (this.THand.get(i).color) {
                                    case "Red":
                                        if(redl == r.length)
                                            return true;
                                        redl++;
                                        break;
                                    case "Blue":
                                        if(bluel == r.length)
                                            return true;
                                        bluel++;
                                        break;
                                    case "White":
                                        if(whitel == r.length)
                                            return true;
                                        whitel++;
                                        break;
                                    case "Black":
                                        if(blackl == r.length)
                                            return true;
                                        blackl++;
                                        break;
                                    case "Purple":
                                        if(purplel == r.length)
                                            return true;
                                        purplel++;
                                        break;
                                    case "Orange":
                                        if(orangel == r.length)
                                            return true;
                                        orangel++;
                                        break;
                                    case "Yellow":
                                        if(yellowl == r.length)
                                            return true;
                                        yellowl++;
                                        break;
                                    case "Green":
                                        if(greenl == r.length)
                                            return true;
                                        greenl++;
                                        break;
                                    case "Wild":
                                        if(wildl == r.length)
                                            return true;
                                        wildl++;
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                    }
                }   break;
            default:
                break;
        }
    return false;
    }
}
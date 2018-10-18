/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

/**
 *
 * @author Fronz
 */
import java.util.ArrayList;

public class Ticket2RideModel {

    private static void ticket2RideSetup(ArrayList<Player> order, Deck d){
        for(int i = 0; i < 2; i++)
            order.add(new Player("Player" + i)); 
        }
    private static Card drawTrainCardTurn(Deck d, Player p){
        return d.draw(p); //Return to this
    }
    private static DestinationTicket drawDestinationTicketTurn(Player p){
        
        return new DestinationTicket("Ontario"); //Return to this
    }
    private static void claimRouteTurn(){
        //Return to this
    }
    
    
    public static void main(String[] args) {
        Deck d = new Deck();
        boolean winner = false;
        ArrayList<Player> turnOrder = new ArrayList<>();
        int turnNum = 2;
        
        ticket2RideSetup(turnOrder, d);
        while(!winner){
            for(int i = 0; i < turnNum; i++)
            {
                System.out.println(turnOrder.get(i).getpName());
            }
            
        }
        

    }
    
}

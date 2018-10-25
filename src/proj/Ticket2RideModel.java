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
import java.util.List;

public class Ticket2RideModel {

    private static void ticket2RideSetup(ArrayList<Player> order, Deck d){
        
    }
    
    

    
    
    public static void main(String[] args) {
        Deck d = new Deck();
        DestinationDeck desDeck = new DestinationDeck();
        ArrayList<Player> turnOrder = new ArrayList<>();
        
        Route r1 = new Route("San Francisco to Salt Lake City", 6);
        Route r2 = new Route("San Francisco to Los Angeles", 3);
        Route r3 = new Route("San Francisco to Portland", 5);
        Route r4 = new Route("Salt Lake City to San Francisco", 6);
        Route r5 = new Route("Los Angeles to San Francisco", 3);
        Route r6 = new Route("Portland to San Francisco", 5);
        
        ticket2RideSetup(turnOrder, d);
        for(int i = 0; i < 5; i++){
            turnOrder.get(i).pTurn(d,desDeck,r2);
            
        }
        

    }
    
}

//ticket2rideView setPlayerTrainCar and setPlayerDestinationTicket
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

    private static void ticket2RideStart(ArrayList<Player> order, Deck d, DestinationDeck dt){
        for(int i = 0; i < 2; i++){
            order.add(new Player("Player"+i));
            for(int j = 0; j < 4; j++){
                
            }
            for(int j = 0; j < 3; j++){
                dt.dtDraw();
            }
            
        }
    }
    /*
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
        
        ticket2RideStart(turnOrder, d, desDeck);
        for(int i = 0; i < 2; i++){
            System.out.println(turnOrder.get(i).validMove(d, desDeck, r1));
            System.out.println(turnOrder.get(i).validMove(d, desDeck, r2));
            System.out.println(turnOrder.get(i).validMove(d, desDeck, r3));
            System.out.println(turnOrder.get(i).validMove(d, desDeck, r4));
            System.out.println(turnOrder.get(i).validMove(d, desDeck, r5));
            System.out.println(turnOrder.get(i).validMove(d, desDeck, r6));

            
            
        }
        
        
        
        
        

    }
    */
}

//ticket2rideView setPlayerTrainCar and setPlayerDestinationTicket
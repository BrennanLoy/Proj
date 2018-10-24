/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.util.ArrayList;
import java.util.Random;

public class DestinationDeck {
    public int desTickets = 30;
    ArrayList<DestinationTicket> ticDeck;
    public int dtCount = 0;

    public DestinationDeck() {
        this.ticDeck = new ArrayList<>();
        ticDeck.add(new DestinationTicket("San Francisco to Salt Lake City", 6));
        ticDeck.add(new DestinationTicket("San Francisco to Los Angeles", 3));
        ticDeck.add(new DestinationTicket("San Francisco to Portland", 5));
        ticDeck.add(new DestinationTicket("Salt Lake City to San Francisco", 6));
        ticDeck.add(new DestinationTicket("Los Angeles to San Francisco", 3));
        ticDeck.add(new DestinationTicket("Portland to San Francisco", 5));
    }
    
    public void dtDraw(Player p){
        while(dtCount != 3)
        {
            Random rand = new Random();
            int x = rand.nextInt(5);
            
            p.DHand.add(ticDeck.get(x));
        }
    }
}

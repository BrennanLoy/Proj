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
    public int tLeft = 5;

    public DestinationDeck() {
        this.ticDeck = new ArrayList<>();
        ticDeck.add(new DestinationTicket("San Francisco to Salt Lake City"));
        ticDeck.add(new DestinationTicket("San Francisco to Los Angeles"));
        ticDeck.add(new DestinationTicket("San Francisco to Portland"));
        ticDeck.add(new DestinationTicket("Salt Lake City to San Francisco"));
        ticDeck.add(new DestinationTicket("Los Angeles to San Francisco"));
        ticDeck.add(new DestinationTicket("Portland to San Francisco"));
    }
    
    public DestinationTicket dtDraw(){
        while(dtCount<5)
             return ticDeck.get(dtCount);
        return new DestinationTicket();
    }
}

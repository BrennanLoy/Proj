/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.util.Random;

/**
 *
 * @author Fronz
 */
public class Deck {
    public int purpleNum,whiteNum,blueNum,yellowNum,orangeNum,blackNum,redNum,greenNum = 12;
    public int locoNum = 14;
    public int totalC =  110;
    
    public Card draw(Player p){
        Random rand = new Random();
        int x = rand.nextInt(8);
        
	switch(x){
            case 0:
		if(this.purpleNum == 0)
                    draw(p);
                else{
                    purpleNum--;
                    totalC--;
                    p.THand.add(new Card("Purple"));}
            case 1:
                if(this.whiteNum == 0)
                   draw(p);
                else{
                    whiteNum--;
                    totalC--;
                    p.THand.add(new Card("White"));}
            case 2:
                if(this.blueNum == 0)
                    draw(p);
                else{
                    blueNum--;
                    totalC--;
                    p.THand.add(new Card("Blue"));}
            case 3:
                if(this.yellowNum == 0)
                    draw(p);
                else{
                    yellowNum--;
                    totalC--;
                    p.THand.add(new Card("Yellow"));}
            case 4:
                if(this.orangeNum == 0)
                    draw(p);
                else{
                    orangeNum--;
                    totalC--;
                    p.THand.add(new Card("Orange"));}
            case 5:
                if(this.blackNum == 0)
                   draw(p);
                else{
                    blackNum--;
                    totalC--;
                    p.THand.add(new Card("Black"));}
            case 6:
                if(this.redNum == 0)
                   draw(p);
                else{
                    redNum--;
                    totalC--;
                    p.THand.add(new Card("Red"));}
            case 7:
                if(this.greenNum == 0)
                    draw(p);
                else{
                    greenNum--;
                    totalC--;
                    p.THand.add(new Card("Green"));}
            case 8: 
                if(this.locoNum == 0)
                    draw(p);
                else{
                    locoNum--;
                    totalC--;
                    p.THand.add(new Card("Wild")) ;}
	}
        return new Card("Blank");
    }
}
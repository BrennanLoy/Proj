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
    
    public Card draw(){
        Random rand = new Random();
        int x = rand.nextInt(8);
        
	switch(x){
            case 0:
		if(this.purpleNum == 0)
                    draw();
                else{
                    purpleNum--;
                    totalC--;
                    return new Card("Purple");}
            case 1:
                if(this.whiteNum == 0)
                   draw();
                else{
                    whiteNum--;
                    totalC--;
                    return new Card("White");}
            case 2:
                if(this.blueNum == 0)
                    draw();
                else{
                    blueNum--;
                    totalC--;
                    return new Card("Blue");}
            case 3:
                if(this.yellowNum == 0)
                    draw();
                else{
                    yellowNum--;
                    totalC--;
                    return new Card("Yellow");}
            case 4:
                if(this.orangeNum == 0)
                    draw();
                else{
                    orangeNum--;
                    totalC--;
                    return new Card("Orange");}
            case 5:
                if(this.blackNum == 0)
                   draw();
                else{
                    blackNum--;
                    totalC--;
                    return new Card("Black");}
            case 6:
                if(this.redNum == 0)
                   draw();
                else{
                    redNum--;
                    totalC--;
                    return new Card("Red");}
            case 7:
                if(this.greenNum == 0)
                    draw();
                else{
                    greenNum--;
                    totalC--;
                    return new Card("Green");}
            case 8: 
                if(this.locoNum == 0)
                    draw();
                else{
                    locoNum--;
                    totalC--;
                    return new Card("Loco");}
	}
        return new Card("Blank");
    }
}
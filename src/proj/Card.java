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
public class Card
{
    
    Card(String c){color = c;}
    String color;   
    
    public String getJPGImage(){
        
        switch(color){
            case("Purple"):
                return "";
            case("White"):
                return "";
            case("Blue"):
                return "";
            case("Yellow"):
                return "";
            case("Orange"):
                return "";
            case("Black"):
                return "";
            case("Red"):
                return "";
            case("Green"):
                return "";
            case("Loco"):
                return "";
            default:
                return "";
        }
    }
}
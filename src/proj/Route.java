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
public class Route {
    Route(String r,int l,String c)
    {
        Route = r;
        length = l;
        color = c;
    }
    String Route;
    int length;
    String color;
    Player p;
    
    public int redl,bluel,whitel,blackl,purplel,orangel,yellowl,greenl,wildl = 0;
    
    public int colorNum()
    {
        for(int j=0;j<p.THand.size();j++)
        {
            if(null != p.THand.get(j).color)
                switch (p.THand.get(j).color) {
                case "Red":
                    return redl++;
                case "Blue":
                    return bluel++;
                case "White":
                    return whitel++;
                case "Black":
                    return blackl++;
                case "Purple":
                    return purplel++;
                case "Orange":
                    return orangel++;
                case "Yellow":
                    return yellowl++;
                case "Green":
                    return greenl++;
                case "Wild":
                    return wildl++;
                default:
                    break;
            }
        }
    }
}

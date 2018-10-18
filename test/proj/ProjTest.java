/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fronz
 */
public class ProjTest {
    
    @Test
    public void ticket2RideSetupTest(){
        ArrayList<Player> list = new ArrayList<>();
        Deck d = new Deck();
        
        for(int i = 0; i < 2; i++)
           list.add(new Player("Player" + i)); 
        
        assertNotSame(list.get(0),list.get(1));
        assertNotNull(list);
        }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

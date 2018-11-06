/*  
    David Peacock / SN8583
    CS-401 Software Engineering
    Due: Wed 24 Oct 2018 @ 11:59 PM
    HW_4
*/

package proj;

public class DestinationTicket
{
    String origin_destination;
    int points;
    
    // Default Constructor
    DestinationTicket()
    {   origin_destination = "SanFrancisco_LosAngeles";
        points = 4; }
   
    // Constructor w/1 argument
    DestinationTicket(String orig_des)
    {
        origin_destination = orig_des;

        if(orig_des.equals("Salt Lake City"))
            points = 1;
        else if(orig_des.equals("Portland"))
            points = 1;
        else if(orig_des.equals("Los Angeles"))
            points = 1;          
    }

    // Setter
    public void setOrigin_Destination(String orig_des)
    {   origin_destination = orig_des;  }

    public String getOrigin_Destination()
    {   return origin_destination;  }
    
    public int getPoints()
    {   return points;  }
}
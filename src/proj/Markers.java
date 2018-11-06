/*  
    David Peacock / SN8583
    CS-401 Software Engineering
    Due: Wed 24 Oct 2018 @ 11:59 PM
    HW_4
*/

package proj;

public class Markers
{
  String player1Color;
  String player2Color;
  int redPosition;
  int bluePosition;
  
  // Constructor
  Markers(int playerNo, int pos)
  {
    if(playerNo == 1)
    {   player1Color = "red";
        redPosition = 0;    }
    else if(playerNo == 2)
    {   player2Color = "blue";
        bluePosition = 0;   }
  }
  
  void setMarkerPosition(int playerNo, int pos)
  { if (playerNo == 1)
      redPosition = pos; 
    else if (playerNo == 2)
      bluePosition = pos;   }
}
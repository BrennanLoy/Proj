/*  
    David Peacock / SN8583
    CS-401 Software Engineering
    Due: Wed 24 Oct 2018 @ 11:59 PM
    HW_4
*/

package proj;

public class Marker
{
  String color;
  int position;
  
  // Constructor
  Marker(int playerNo)
  { if(playerNo == 1)
        color = "red";
    else if(playerNo == 2)
        color = "blue";
    position = 0;
  }
  
  void setMarkerPosition(int pos)
  { position = pos; }
}
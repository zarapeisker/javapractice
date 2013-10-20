
import java.util.*;

public class DotCom {

  private ArrayList<String> locationCells;
  //array of cell locations
  private String name;
  //dot com name

  public void setLocationCells(ArrayList<String> loc) {
    locationCells = loc;
  }
  //setter method that updates the DotCom's location

  public void setName(String n) {
    name = n;
  }

  public String checkYourself(String userInput) {
    String result = "miss";
      int index = locationCells.indexOf(userInput);
      //If the user guess is one of the entries in the ArrayList, indexOf() will return its ArrayList location. If not, indexOf() will return -1.
      if (index >= 0) {
        locationCells.remove(index);
        //remove an entry (ArrayList method)
        if (locationCells.isEmpty()) {
          //have all the locations been guessed?
         result = "kill";
         System.out.println("Ouch! You sunk " + name + " :(");
        }
        else {
          result = "hit";
        } //close if
      } //close if
    return result;
  }// close method
}// close class
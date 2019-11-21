package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
  LocalDate update = LocalDate.now();
  static ArrayList<MenuItem> joesDinerMenu = new ArrayList<MenuItem>();
//  private Date today = new Date();

// constructor
  public Menu(ArrayList<MenuItem> joesDinerMenu) {
    this.joesDinerMenu = joesDinerMenu;
  }
// getter
  public static ArrayList<MenuItem> getJoesDinerMenu() {
    return joesDinerMenu;
  }
// setter
  public static void setJoesDinerMenu(ArrayList<MenuItem> joesDinerMenu) {
    Menu.joesDinerMenu = joesDinerMenu;
  }

  public ArrayList<MenuItem> addItem(MenuItem item){
    // disallow duplicate items
    if (!joesDinerMenu.contains(item)) {
      this.joesDinerMenu.add(item);
    }
  return this.joesDinerMenu;
  }

  public void printMenu (){
    for (MenuItem eachMenu: joesDinerMenu) {
      eachMenu.displayItem();
    }
      System.out.println("Menu updated: " + update);
  }


}

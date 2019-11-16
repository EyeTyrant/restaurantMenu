package restaurant;

import java.util.ArrayList;

public class Menu {

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

      this.joesDinerMenu.add(item);
  return this.joesDinerMenu;
    // update and display the date
  }

  public void printMenu (){
    for (MenuItem eachMenu: joesDinerMenu) {
      eachMenu.displayItem();
    }
  }

  @Override
  public String toString() {
    return "Menu{" +
            "appetizers=" + joesDinerMenu +
            '}';
  }
}

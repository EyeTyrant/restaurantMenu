package restaurant;

import java.util.Arrays;
import java.util.Date;

public class MenuItem extends Menu {

   static String category;
  private static String name;
  private static String description;
  private static Double price;
  private static Boolean isNew;
  private Date today = new Date();


    public void displayItem(){
      if (isNew){
        System.out.println(name + "   !! NEW ITEM !! \n" + description + "\n$ " + price + "\n");
      }else {
        System.out.println(name + "\n" + description + "\n$ " + price + "\n");
      }
    }





//  public Boolean isNew(Date date){
//    if (today < today){
//      return true;
//    }
//  }



  public MenuItem(String category, String name, String description, Double price, Boolean isNew) {
    this.category = category;
    this.name = name;
    this.description = description;
    this.price = price;
    this.isNew = isNew;
  }

  public String getCategory() {
    return category;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Double getPrice() {
    return price;
  }

  public Boolean getNew() {
    return isNew;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public void setNew(Boolean aNew) {
    isNew = aNew;
  }


}

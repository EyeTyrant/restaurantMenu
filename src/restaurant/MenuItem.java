package restaurant;

import java.util.Date;

public class MenuItem {

  private String category;
  private String name;
  private String description;
  private Double price;
  private Boolean isNew;
  private Date today = new Date();

  private String st;

  public void displayItem(){
    System.out.println (name + "\n" + description + "\n" + price);
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

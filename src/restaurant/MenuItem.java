package restaurant;

public class MenuItem {

  private String category;
  private String name;
  private String description;
  private Double price;
  private Boolean isNew;

// constructor
  public MenuItem(String category, String name, String description, Double price, Boolean isNew) {
    this.category = category;
    this.name = name;
    this.description = description;
    this.price = price;
    this.isNew = isNew;

    // tried to place addItem() method here to automatically populate arraylist when instantiated.
  }

    public void displayItem(){
      if (isNew){
        System.out.println("\n" + name + "   !! NEW ITEM !! \n" + description + "\n$ " + price);
      }else {
        System.out.println("\n" + name + "\n" + description + "\n$ " + price);
      }
    }

// getters
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

// setters
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


//  @Override
//  public String toString() {
//    return "MenuItem{" +
//            "category='" + category + '\'' +
//            ", name='" + name + '\'' +
//            ", description='" + description + '\'' +
//            ", price=" + price +
//            ", isNew=" + isNew +
//            '}';
//  }

}

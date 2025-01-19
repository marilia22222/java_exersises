//icsd22026
package eshop;

public class Eshop {

    public static void main(String[] args) {
        //proionta
    Supplies laptop = new Supplies(800, "Laptop", new String[]{"computers"}, "HP", 5, "gaming laptop", 1);
    Supplies A34 = new Supplies(250, "A34", new String[]{"phone","smartphone"}, "Samsung", 0, "A brand new phone", 2);
    Supplies ipod = new Supplies(50, "ipod", new String[]{"audio devices"}, "apple", 5, "for music lovers", 3);
    Supplies xbox = new Supplies(150, "Xboxone", new String[]{"computers"}, "Microsoft", 2, "for those who know how to play", 4);
    Supplies Macbook = new Supplies(1500, "Macbook", new String[]{"computers"}, "apple", 9, "best price", 5);
    Managment shop = new Managment("www.bestshopever.gr", "2102030405", "bestshopever@yahoo.com");
    shop.add(laptop);
    shop.add(A34);
    shop.add(ipod);
     shop.add(xbox);
      shop.add(Macbook);
//kalesma sunarthseon
    shop.show();
   shop.change(A34);
   shop.change(ipod);
   shop.shortCategory("computers");
   shop.shortCategoryAndPrice("computers", 500, 2000);
   shop.shortCreator("apple");
   shop.whoIsREady();
    }
    
}

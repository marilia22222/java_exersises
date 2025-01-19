
package eshop;


public class Supplies {
    private float price; //timh
    private String name; //onoma
    private String category[]; //kathgoria 
    private String creator; //kataskevasths
     int quontity;  //pospthta
      private String discription; //perigrafh
      //private int id;
      private int id = 0; //monadiko id
    public Supplies(){  //constractor me mhdenikes times
        
        this.price = 0;  
        this.name = "";
        this.category = new String[]{};;  //pinakas me mhdenikes times
        this.creator = "";
        this.quontity = 0;
        this.discription = "";
        this.id = ++id;
        
    }
     public Supplies(float p, String n, String ca[], String cr, int q,String d, int id){ //constractor me kanonikes times
         this.price = p;
         this.name = n;
         this.category = ca;
        this.creator = cr;
        this.quontity = q;
        this.discription = d;
        this.id = ++id; 
     }
     public int check(){  //koitame thn posothta
         if(quontity == 0){
             System.out.println("Contact creator");
             return 0;
         }
         else{
             return quontity;
         }
     }
     
     
     public void show(){  //emfanishprohontos
         System.out.println("Name: " + name);
          System.out.println("Price "+ price);
           System.out.println("Category: "+ category);
           System.out.println("Creator: "+ creator);
          System.out.println("ID: "+ id);
           System.out.println("Descreption: "+ discription);
           
           
     }
     public void condition(int c){   //se ti katastash einai
          switch (c) {
            case 1: 
                if (quontity > 0) {
                    System.out.println("out for delivery.");
                    quontity--;
                } else {
                    System.out.println("Out of stock");
                }
                break;
            case 2:
                System.out.println("Available items: " + quontity);
                break;
            default:
                System.out.println("Not corect number");
        }
    }
     public String getName(){  //gia to onoma tou proiontos
         return name;
     }
      public String[] getCategoty(){ //gia thn katigoria
         return category;
     }
     public float getPrice(){  //gia thn timh
         return price;
     }
     
     public String getCreator(){ //gia ton kataskeuasth
         return creator;
     }
}

     
     

    
     

package eshop;

import java.util.ArrayList;

public class Managment {
    private  String link;
    private  String telephone;
    private  String email;
    private ArrayList<Supplies> pr = new ArrayList<>();  //lista gia ta anthkimena
    
    
    
    public Managment(String l, String t, String e){ //constractor gia ta stoixia ths eterias
        this.link = l;
        this.email = e;
        this.telephone = t;
    }
    //emfanisei xaractiristikvn
    public void show(){
    System.out.println("link: " + link);
    System.out.println("telphon: " + telephone);
    System.out.println("email: " + email);  

}
    
    //prosthikh proiontos
    public void add(Supplies p){
        pr.add(p); //prosthetoume stin lista to neo proion
        System.out.println("product:" + p.getName());
    }
    
    //allagh katastashs
    public void change(Supplies a){
        if(a.quontity == 0 ) {  //an den exei apothema 
           a.quontity += 10;  //prosthese 10
        
        } else {
            a.quontity = 0; 
        }
        a.show();
         }
    //diaxorismos basi katigorias
    public void shortCategory(String ca){
       System.out.println("\nproducts that are: " + ca);
       for(Supplies pro : pr){ //gia kathe proion
           for(String c : pro.getCategoty()){//kai kathe eisagogh 
               if(c.equalsIgnoreCase(ca)){ //pou teriazei me thn epilegmenh katigoria 
                   pro.show(); //dixe to proion
               }
           }
       }
    }
    
    //katigoria vasi ths thmhs ths katigorias
    public void shortCategoryAndPrice(String ca, float a, float b){  //akribos opos to allo alla exoyme ths times
        System.out.println("\nfor" + ca +"category from: "+a +"to"+b);
       for(Supplies pro : pr){
           for(String c : pro.getCategoty()){
               if(c.equalsIgnoreCase(ca)&&(pro.getPrice()>=a&&pro.getPrice()<=b)){
                   
                       pro.show();
                   
               }
           }
       }
    }
    
    
    //diaxorismosbash kataskevasth
       public void shortCreator(String cr){
       System.out.println("product created by:" + cr);
       for(Supplies pro : pr){
           
               if(pro.getCreator().equalsIgnoreCase(cr)){
                       pro.show();
                   }
               
           }
       }
       //diaxorismos basi ftinotero
       public void chip(){
           
           
       }
       //diaxorismos basi paragkelias
     public void whoIsREady(){
        System.out.println("product shipped: ");
       for(Supplies pro : pr){
           
               if(pro.quontity>0){
                       pro.show();
                   }
           }
       } 
}

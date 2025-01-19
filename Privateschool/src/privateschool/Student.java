
package privateschool;

import java.util.HashMap;
import java.util.HashSet;
//xaraktiristika mathith
public class Student {
     private String name;
 private int id;
 private String phone;
 private String email;
private HashSet <String> max = new HashSet<>();
 
	
 public Student(String n, int id, String ph, String email){ //constractor gia thmes
  this.name = n;
  this.id = id;
  this.phone = ph;
  this.email = email;
 }
 
 
 //sunarthseis gia ta stoixia tou mathith pou xriazomaste
 public int getid(){
     return id;
 }
 public String getname(){
     return name;
 }
 
 public String getphone(){
     return phone;
 }
 
 public String getemail(){
     return email;
 }
 
 //xrish hashmap gia thn enosh tou mathith me thn taxi
private HashMap<String, Classroom> map  = new HashMap<>();


//prosthikh mathith sthn taxi
public void addtoclass(Classroom c) {
         max.add(c.getcn());

    }

//aferesh mathith apo taxi
public void removefromclass(Classroom c){
       max.remove(c.getcn());
   }

//se poses taxis einai o mathiths
public int howmany(){
   return max.size();
}
} 
    

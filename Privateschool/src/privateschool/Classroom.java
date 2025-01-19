
package privateschool;

import java.util.ArrayList;
import java.util.HashMap;


//metablites taxis
public class Classroom {
    private String className;
    public void setclassname(String c){
        this.className = c;
    }
    public String getcn(){
        return className;
    }
    
    
     private HashMap<Integer, Student> map  = new HashMap<>(); //xrish hashmap gia thn enosh mathith me taxi
   
     public void addtoclass(Student m) {
         map.putIfAbsent(m.getid(), m); //enonh to id tou mathith me ton mathth sthn sugkekrimenh taxi
         System.out.println("student " + m.getname() + " is now on " + className + " class");  

    }
   public void removefromclass(Student m){
       map.remove(m.getid(), m); //aferei ton mathith me to id tou apo thn taxi
       System.out.println("student " + m.getname() + " is now out of " + className + " class\n");
   }
    public void findstudent(int id){
        System.out.println("the student is " + map.containsKey(id));  //briskei poios mathites einai pou
    }
    //kai briskei poioi mathites einai sthn taxi
    public void whoisthere(){
        if (map.isEmpty()) {
            System.out.println("the class is empty");
        } else {
            for (Student s : map.values()) {
                System.out.println(s.getid() + "\n" + s.getname() + "\n" + s.getphone() + s.getemail());
            }
    }
    
}
    
}



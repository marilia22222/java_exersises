//icsd22026
package privateschool;

import java.util.ArrayList;

public class Privateschool {
    
   

    public static void main(String[] args) {
        
        //mathites
         Student giannis = new Student("giannis", 1, "6901234567", "giannis@Gmail.com");
        Student maria = new Student("maria", 2, "6909876543", "maria@yahoo.com");
        Student giorgos = new Student("giorgos", 3, "6910203040", "giorgos@hotmail.com");
        Student ioanna = new Student("ioanna", 4, "6950607080", "ioanna@Gmail.com");
   //taxis
        Classroom math = new Classroom();
        math.setclassname("math");
        Classroom pysics = new Classroom();
        pysics.setclassname("pysics");
        Classroom italian = new Classroom();
        italian.setclassname("italian");
        Classroom theater = new Classroom();
        theater.setclassname("theater");
        
        //eisagogh mathiton se mia lista (htan gia to teleutaio erothma alla den trexei)
        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.add(giannis);
        allStudents.add(maria);
        allStudents.add(giorgos);
        allStudents.add(ioanna);

    //prosthikh mathiton sthn taxi
        math.addtoclass(giannis);
        math.addtoclass(maria);
        pysics.addtoclass(maria);
        pysics.addtoclass(giorgos);
        italian.addtoclass(maria);
        italian.addtoclass(ioanna);
        italian.addtoclass(giannis);
        theater.addtoclass(giorgos);
        
        
                
        //bres mathith        
        math.findstudent(1);  

    //poioi mathites einai pou
        System.out.println("\nthe studens in the math class are: ");
        math.whoisthere();
        System.out.println("\nthe studens in the pysics class are: ");
        pysics.whoisthere();
        System.out.println("\nthe studens in the italian class are: ");
        italian.whoisthere();
        System.out.println("\nthe studens in the theater class are: ");
        theater.whoisthere();
        
        
        System.out.println("\n");
        System.out.println("\n");
        
        
        //aferese apo taxi
        math.removefromclass(giannis);
//oi mathites sthn taxi poy o mathiths afereuhke
        System.out.println("\nthe studens in the math class are: ");
        math.whoisthere();
        
        System.out.println("\nthe studens in more than one class are:  ");
        //emfanish mathiton pou einai se perisoteres apo 2 taxis
       for(int i = 0; i<allStudents.size(); i++){
           Student st = allStudents.get(i);
           if (st.howmany() > 1) { 
                System.out.println(st.getname() + " with " + st.howmany() + " classes.");
            }
        }
       }
         
       
    }
    


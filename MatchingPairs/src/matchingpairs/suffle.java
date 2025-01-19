
package matchingpairs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import static matchingpairs.arrays.cards;


public class suffle {
    public static void suffle(){
        Random random = new Random();
        ArrayList<String> letter = new ArrayList<String>(); //xrish listas gia thn apothikefsh ton grammaton
        letter.add("A");
        letter.add("B");
        letter.add("C");
        letter.add("D");
        letter.add("E");
        letter.add("F");
        letter.add("G");
        letter.add("H");
        letter.add("I");
        letter.add("J");
        letter.add("K");
        letter.add("L");
        letter.add("M");
        letter.add("N");
        letter.add("O");
        letter.add("P");
        letter.add("Q");
        letter.add("R");
        letter.add("S");
        letter.add("T"); 
        letter.add("U");
        letter.add("V");
        letter.add("W");
        letter.add("X");
        letter.add("Y");
        letter.add("Z");
        
         ArrayList<String> choise = new ArrayList<String>();  //xrish neas listas gia thn xrish mono 10 zebgarion
         for (int i = 0; i < 10; i++) {
            int ran = random.nextInt(letter.size());// random epilogh apo ton pinaka letter
            choise.add(letter.get(ran));
            letter.remove(ran);
        }
        
        choise.addAll(new ArrayList<>(choise)); //topothetish sthn nea lista

        
        Collections.shuffle(choise);//anakatema zeygarivn
        int index = 0;
        for(int i = 0; i<4; i++){ 
            for(int j = 0; j<5; j++){
                //index = random.nextInt(letter.size());
                cards[i][j] = choise.get(index);
                index ++;
               // letter.remove(index); 
               //dimiourgia board me grammata
            }
        }
        
        
    
    }
    public void show(){    //gia thn emfanish tou telikou pinaka
        for(int i = 0; i<4; i++){ 
            for(int j = 0; j<5; j++){
                System.out.println(cards[i][j].toString());
    }
}
    }
}

package matchingpairs;

import java.util.Scanner;


public class arrays {
    public static String[][] board = new String [4][5]; //creating the board
    public static String[][] cards = new String [4][5]; //creating the cards
    public static Scanner scanner = new Scanner(System.in); //dimiourgia metabliths gia na dexetai times apo ton xreisth
    
    
    //creating the board
    public static void printBoard(){   //ektiposh tou board
        for(int i = 0; i<4; i++){  //gia  grames
            System.out.print("|");
            for(int j = 0; j<5; j++){ //gia steiles 
                System.out.print(board[i][j]);
                System.out.print("|");
                
            }
            System.out.println();  //emfanish tou board
        }
    }

}

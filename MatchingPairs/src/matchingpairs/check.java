
package matchingpairs;
//import ths class pou tha xrisimopoihthoun
import static matchingpairs.arrays.board;
import static matchingpairs.arrays.cards;
import static matchingpairs.arrays.printBoard;
import static matchingpairs.arrays.scanner;


public class check {
    public static void check(String[][] cards){
        int attemt = 0;
        while(true){
            if(!gameOver()){   //mexri na teliosei to paixnidi
                System.out.println("Row: (1-4)");
                int row1 = scanner.nextInt();   //o xristhw bazei thn eisodo gia th steilh
                
               // scanner.nextLine();
                System.out.println("Colum: (1-5)");
               // scanner.nextLine();
                int colum1 = scanner.nextInt();  //o xristhw bazei thn eisodo gia th grammh
               // scanner.nextLine();
                
                if(!board[row1-1][colum1-1].equals(" * ")){
                    System.out.println("already enterd");  //se periptosh poy balo dio fores to idio sundiasmo grammon kai steilon
                    System.out.println();
                    
                      printBoard();
                continue;
                }
               else{
                board[row1-1][colum1-1] = " " + cards[row1-1][colum1-1] + " ";
                printBoard(); //ektiponoume gia deuteri epilogh
            } 
               System.out.println("Row: (1-4)");
                int row2 = scanner.nextInt();
                //scanner.nextLine();
                System.out.println("Colum: (1-5)");
                int colum2 = scanner.nextInt(); 
               // scanner.nextLine();
                
                if(!board[row2-1][colum2-1].equals(" * ")){
                    System.out.println("already enterd");
                    board[row1-1][colum1-1] = " * ";
                    System.out.println();
                    
                      printBoard();
                continue;
                
            }
                else{
                    board[row2-1][colum2-1] = " " + cards[row2-1][colum2-1] + " ";
                     if(board[row1-1][colum1-1].equals(board[row2-1][colum2-1])){
                         printBoard();
                    System.out.println("Correct:)");   //an o paixths to brei sosta 
                     }
                     else{
                         printBoard();
                         System.out.println("False:(");  //an o paixths to brei lathos
                        board[row1-1][colum1-1] = " * ";
                        board[row2-1][colum2-1] = " * ";
                        attemt++;
                        printBoard();
                        if(attemt>=4){
                          System.out.println("Game Over ^_^!!!:-(");  //otan o paixths kanei 4a sfalmata
                          
                break;  
                        }
                     }
                    
                }
          
        }
            else{
                System.out.println("Game Over ^_^!!!:-)");  //otan to paixnidi kedisei
                break;
            }
            
    }

 
}

    private static boolean gameOver() {
     for(int i = 0; i<4; i++){
         for(int j = 0; j<5; j++){
             if(board[i][j].equals(" * ")){   //otan kamia thesh tou pinaka den einai kalimenei me *
                 return false;
             }
         }
     }
     return true;
    }
    
}

//icsd22026
package matchingpairs;

import static java.util.Collections.shuffle;
import static matchingpairs.arrays.board;
import static matchingpairs.arrays.cards;
import static matchingpairs.arrays.printBoard;
import static matchingpairs.arrays.scanner;
import static matchingpairs.check.check;
import static matchingpairs.suffle.suffle;



public class MatchingPairs {
//klhsh sunartisevn
   
    public static void main(String[] args) {
        while (true) {
            System.out.println("press p to play :)");  //me to p o paixthw paizei
            System.out.println("press q to quit :("); //me to q o paixthw apoxorei
            String desesion = scanner.nextLine();  //input paixth
            if(desesion.equals("q")){
                    System.out.println("it was an amazing try :D");  //an o paixths apoxorisei bgenei auto to mhnhma
                    break;
                }
            else if(desesion.equals("p")){  //an thekinhsei to paixnidi
                    suffle();
                    for(int i = 0; i<4; i++){
                        for(int j = 0; j<5; j++){
                            board[i][j] = " * ";  //gemizei to board me *
                        }
                    }    
                    printBoard();
                    check(cards);
                    
                    //break;
                }
                else {
                    System.out.println("please press one out of the two characters^_^"); //se periptosh poy patithi kati allo
                    continue;
                }
            }
        }
    }
    


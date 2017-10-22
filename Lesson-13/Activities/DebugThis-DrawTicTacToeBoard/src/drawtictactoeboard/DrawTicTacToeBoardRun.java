/*
 * DEBUG THIS! Exercise - Drawing the Tic-Tac-Toe Board
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program uses the classes in the ticktactoe package to draw a Tic-Tac-Toe
 * board. Use these classes to write a program which draws these two boards
 * in one execution of the program.
 * 
 * NOTE: you will need to debug the main() method 
 *       and the draw() method in Board.java
 * 
 * 
 * PROGRAM OUTPUT:
 * 
  0 1 2
0  | | 
  -+-+-
1  | | 
  -+-+-
2  | | 

  0 1 2
0  | | 
  -+-+-
1  |X| 
  -+-+-
2  | | 

  0 1 2
0  | | 
  -+-+-
1  |X| 
  -+-+-
2 O| | 

  0 1 2
0  | | 
  -+-+-
1  |X|X
  -+-+-
2 O| | 

  0 1 2
0  |O| 
  -+-+-
1  |X|X
  -+-+-
2 O| | 

  0 1 2
0  |O| 
  -+-+-
1 X|X|X
  -+-+-
2 O| | 

X is the Winner!

 */
package drawtictactoeboard;

import tictactoe.*;

public class DrawTicTacToeBoardRun {

    public static void main(String[] args) {
        Board t = new Board();
        t.Draw();
        t.Place(Marker.X, 1, 1);
        t.Draw();
        t.Place(Marker.O, 2, 0);
        t.Draw();   
        t.Place(Marker.X, 1, 2);
        t.Draw();  
        t.Place(Marker.O, 0, 1);
        t.Draw();
        t.Place(Marker.X, 1, 0);
        t.Draw();
        System.out.println();
        System.out.println("X is the Winner!");
    }

}

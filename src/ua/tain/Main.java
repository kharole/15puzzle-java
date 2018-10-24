package ua.tain;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Shall the Game begin");
    Scanner sc = new Scanner(System.in);
    Game game = new Game();
    boolean keepPlaying = true;
    while (keepPlaying) {
      game.print();
      String line = sc.nextLine();
      switch (line) {
        case "u":
          System.out.println("up");
          break;
        case "d":
          game.down();
          break;
        case "l":
          System.out.println("left");
          break;
        case "r":
          game.right();
          break;
        case "q":
          System.out.println("quit");
          keepPlaying = false;
          break;
        default:
          System.out.println("what?");
          break;
      }
    }
  }


}

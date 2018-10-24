package ua.tain;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Shall the Game begin");
    Scanner sc = new Scanner(System.in);
    boolean keepPlaying = true;
    while (keepPlaying) {
      String line = sc.nextLine();
      switch (line) {
        case "cmd1":
          System.out.println("cmd1");
          break;
        case "cmd2":
          System.out.println("cmd2");
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

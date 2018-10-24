package ua.tain;

public class Game {

  public static final int N = 3;
  private String[][] cells = new String[N][N];

  public Game() {
    for (int r = 0; r < N; r++) {
      for (int c = 0; c < N; c++) {
        int cell = 3 * r + c;
        cells[r][c] = r == N - 1 && c == N - 1 ? " " : String.valueOf(cell);
      }
    }
  }

  public String get(int r, int c) {
    return cells[r][c];
  }

  public void right() {
    int mr = -1;
    int mc = -1;
    for (int r = 0; r < N; r++) {
      for (int c = 0; c < N; c++) {
        if (" ".equals(cells[r][c])) {
          mr = r;
          mc = c;
        }
      }
    }

    if (mc > 0) {
      cells[mr][mc] = cells[mr][mc - 1];
      cells[mr][mc - 1] = " ";
    }
  }

  public void down() {
    int mr = -1;
    int mc = -1;
    for (int r = 0; r < N; r++) {
      for (int c = 0; c < N; c++) {
        if (" ".equals(cells[r][c])) {
          mr = r;
          mc = c;
        }
      }
    }

    if (mr > 0) {
      cells[mr][mc] = cells[mr - 1][mc];
      cells[mr - 1][mc] = " ";
    }
  }

  public void print() {
    for (int r = 0; r < N; r++) {
      for (int c = 0; c < N; c++) {
        System.out.print(cells[r][c] + " ");
      }
      System.out.println();
    }
  }
}

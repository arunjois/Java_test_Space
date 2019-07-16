/*
* Print the pattern
  1 5 4 3 2 1
  1 2 4 3 2 1
  1 2 3 3 2 1
  1 2 3 4 2 1
  1 2 3 4 5 1
*/
class Pattern {
  public static void main(String args[]) {
    for(int i=1;i<6;i++) {
      for(int k=1;k<i+1;k++)
        System.out.print(k);
      for(int j=6-i;j>0;j--)
        System.out.print(j);
      System.out.println();
    }
  }
}

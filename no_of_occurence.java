import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input:");
        String s= sc.nextLine();
        System.out.println("enter char:");
        char c=sc.next().charAt(0);
        int count=0;
       for(int i=0;i<=s.length()-1;i++){
           if(s.charAt(i)==c) count++;
       }
      System.out.println(count);
      sc.close();
      }
}
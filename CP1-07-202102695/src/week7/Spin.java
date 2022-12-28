package week7;

import java.util.*;
import java.util.Arrays;

public class Spin {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   Scanner sc =new Scanner(System.in);
       String star = sc.nextLine();
       String[] arr = star.split(" ");
       
       int large=0;
       for (int i=0; i<arr.length; i++) {
          if(arr[i].length() > large) {
             large = arr[i].length();
          }
       }
       
       char[][] before = new char[arr.length][large];
       for(int i=0; i<arr.length; i++) {
          for(int j=0; j<large; j++) {
             before[i][j]=' ';
          }
       }
       for(int i=0; i<arr.length; i++) {
          for(int j=0; j<arr[i].length(); j++) {
             if(arr[i].charAt(j)=='*') {
                before[i][j]='*';
             }
          }   
       }
       
       char[][] spin = new char[large][arr.length];
         for(int i=0; i < spin.length; i++) {
            for(int j=0; j < spin[i].length; j++) {
               spin[i][j]=before[j][before[0].length-1-i];
            }
         }
       for(int i=0; i < spin.length; i++) {
          for(int j=0; j < spin[i].length; j++) {
             System.out.print((spin[i][j]));
          }
          System.out.println();
       }
      }
      

}
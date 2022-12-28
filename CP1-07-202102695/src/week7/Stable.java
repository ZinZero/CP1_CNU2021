package week7;

import java.util.Scanner;
public class Stable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		int in_num = Integer.parseInt(num);
		
		String[][] di_arr = new String[in_num][2];
		
		for(int i=0; i < in_num; i++) {
			String di = sc.nextLine();
			di_arr[i][0] = di.split(" ")[0];
			di_arr[i][1] = di.split(" ")[1];
		}
		
		for(int i=0; i < di_arr.length -1; i++) {
			boolean changed = false;
			
			for(int j=0; j < di_arr.length -1 -i; j++) {
				if(Integer.parseInt(di_arr[j][0]) > Integer.parseInt(di_arr[j+1][0])) {
					String[] temp = new String[in_num];
					temp[j] = di_arr[j][0];
					di_arr[j][0] = di_arr[j+1][0];
					di_arr[j+1][0] = temp[j];
					
					temp[j] = di_arr[j][1];
					di_arr[j][1]  = di_arr[j+1][1];
					di_arr[j+1][1] = temp[j];
					changed = true;
				}
			}
			
			if(!changed) break;
		}
		
		for(int k=0; k < in_num; k++) {
			System.out.print(di_arr[k][0] + " ");
			System.out.println(di_arr[k][1]);
		}
	}

}
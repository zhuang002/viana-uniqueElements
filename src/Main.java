import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 0. create an ArrayList used for read list.
		 * 1. read n which is the number of integers we need to read in.
		 * 2. Loop for n times to read an integer. For each integer read, do following:
		 * 	2.1 check if the integer is already read (in the read list.) 
		 * 		2.1.1 if it is in the list, we do nothing.
		 * 		2.1.2 if it is not in the list, we need to add it to the list.
		 * 3. output the length(number of elements) of the list.
		 */
		
		
		ArrayList<Integer> readList = new ArrayList<>(); // create the read list.
		Scanner sc = new Scanner(System.in); // read in n
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) { // loop for n times.
			int a = sc.nextInt(); // read in an integer
			if (!readList.contains(a)) {  // if not the read list contains a.
				readList.add(a); // add a to the read list.
			}
		}
		
		System.out.println(readList.size());
		
	}

}

import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int lines = input.nextInt();
		int result = 0;
		int counter = 0;
		for(int i = 0; i<lines; i++){
			for(int j = 0; j<3; j++)
				if(input.nextInt() == 1)
					counter++;
			if(counter>1)
				result++;
			counter = 0;
		}
		System.out.println(result);
	}
}	
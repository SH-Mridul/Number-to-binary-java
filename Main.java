package Problem;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		convertIntoBinary(4);
	}
	
	public static void convertIntoBinary(int number)
	{
		int bits[] = new int[35];
		int i = 0;
		
		while(number>0)
		{
			bits[i++] = number%2;
			number /= 2;
		}
		System.out.println(Arrays.toString(bits));
		printBinary(bits,i);
		
	}
	
	static void printBinary(int[] binary, int id)
    {
     
        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }
}


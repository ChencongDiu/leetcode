package Math;

/*
Given an integer, write a function to determine if it is a power of two.
 */
public class PowerofTwo {
	public boolean isPowerOfTwo(int n) {
        if (n > 1) {
			while (n % 2 == 0) 
				n = n / 2;
		}
		return (n == 1);
    }
}

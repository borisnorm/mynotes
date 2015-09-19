package bitwise;

public class Bitwise {
	public boolean getBit(int num, int i) {
		return (num & (1 << i)) != 0;
	}

	public int setBit(int num, int i) {
		return num | (1 << i);
	}

	public int clearBit(int num, int i) {
		return num & (~(1 << i));
	}

	/**
	 * Clear all bits lower than the index (inclusive)
	 */
	public int clearLowBits(int num, int index) {
		int mask = ~((1 << (index + 1)) - 1);
		return num & mask;
	}

	/**
	 * Clear all bits higher than the index (inclusive)
	 */
	public int clearHighBits(int num, int index) {
		int mask = (1 << index) - 1;
		return num & mask;
	}

	/**
	 * Clear all bits in a range (inclusive in both ends)
	 */
	public int clearBits(int num, int high, int low) {
		return clearHighBits(num, low) | clearLowBits(num, high);
	}

	/**
	 * Flip the least significant digit
	 */
	public int flip(int bit) {
		return 1 ^ bit;
	}

	/**
	 * Flip the index-th digit
	 */
	public int flip(int num, int index) {
		return (1 << index) ^ num;
	}

	/**
	 * Check if an integer is positive or negative
	 * 
	 * The sign bit of positive is 0, and is 1 for negative
	 */
	public int getSign(int n) {
		return flip((n >> 31) & 0x1);
	}

	/**
	 * Check if two integers have different signs
	 *
	 * @return true if different, false otherwise
	 */
	public boolean hasDiffSigns(int a, int b) {
		return ((a ^ b) >> 31) == 1;
	}

	/**
	 * Best way to check if an integer is a power of two - use bitwise
	 * operation!
	 */
	public boolean isPowerOfTwo(int i) {
		if (i == 0) {
			return false;
		}

		return (i & (i - 1)) == 0;
	}
	
	/**
	 * 10110110 -> 00000010
	 */
	public int getLastOne(int num) {
		return num ^ (num & (num - 1));
	}

	public int getNumberOfDiffBits1(int a, int b) {
		int count = 0;

		for (int c = a ^ b; c != 0; c >>= 1) {
			if ((c & 1) == 1) {
				count++;
			}
		}
		
		return count;
	}
	
	public int getNumberOfDiffBits2(int a, int b) {
		int count = 0;
		
		for (int c = a ^ b; c != 0; c = c & (c - 1)) {
			count += 1;
		}
		
		return count;
	}
	
	
}
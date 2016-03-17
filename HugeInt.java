
public class HugeInt {
	private int largeNumberArray[];
	private String largeNumber;
	
	
	/**
	 * Constructor method
	 * Takes in a string, largeNumber, and splices it up by digit and
	 * assigns an array of ints to each digit.
	 * @param largeNumber
	 */
	HugeInt(String largeNumber) {
		this.largeNumber = largeNumber;
		largeNumberArray = new int[largeNumber.length()];

		
		// Reverse the string to insert into the array correctly
		String reversedLargeNumber = new StringBuilder(largeNumber).reverse().toString();
		// Add each digit to an array of ints.
		for(int i=0; i < largeNumber.length() ; i++) {
			largeNumberArray[i] = Integer.parseInt(reversedLargeNumber.substring(i,i+1));
		}
	}
	
	/** 
	 * Adds a HugeInt with another HugeInt.
	 * @param hugeIntNumber
	 */
	public String add(HugeInt hugeIntNumber) {		
		// Checks to see if the numbers are the same length. 
		if(largeNumber.length() != hugeIntNumber.largeNumber.length()) {
			// Is one larger than the other.
			if(largeNumber.length() > hugeIntNumber.largeNumber.length()) {
				// Get the difference and pad the smaller one with 0s.
				int difference = largeNumber.length() - hugeIntNumber.largeNumber.length();
				for(int i=0; i < difference; i++) {
					hugeIntNumber.largeNumber = "0" + hugeIntNumber.largeNumber;
				}
				// Reallocate the size of the array to the appropriate length and values.
				hugeIntNumber.reallocateLargeNumberArray();
			}
			else {		
				// Does the same thing as above just with the other number.
				int difference = hugeIntNumber.largeNumber.length() - largeNumber.length();
				for(int i=0; i < difference; i++) {
					largeNumber = "0" + largeNumber;
				}
				// Reallocate the size of the array to the appropriate length and values.
				reallocateLargeNumberArray();
			}
		}
		
		
		// Initializes a result array of ints to 0.
		int result[] = new int[largeNumber.length()+1];
		for(int i=0; i < result.length; i++) {
			result[i] = 0;
		}
		
		// Adds the two numbers together and places their results into the
		// results array.
		for(int i=0; i < largeNumberArray.length; i++) {
			result[i] = largeNumberArray[i] + hugeIntNumber.largeNumberArray[i];
		}
		
		// Checks to see if we need to carry the result.
		for(int i=0; i < largeNumberArray.length; i++) {
			if(result[i] > 9) {
				result[i+1] += 1;
				result[i] -= 10;
			}
		}
		
		// Builds a new string of the very large number.
		String newNumber = "";
		for(int i=0; i < result.length; i++) {
			newNumber += result[i];
		}
		
		// Checks to see if the addition caused us to add another digit to the number.
		// If it didn't, then truncate the newNumber so the zero doesn't show up
		if(result[result.length-1] == 0) {
			return new StringBuilder(newNumber.substring(0, newNumber.length()-1)).reverse().toString();
		}
		else {
			return new StringBuilder(newNumber).reverse().toString();
		}
	}

	
	/**
	 * Subtracts a HugeInt from another HugeInt.
	 * @param hugeIntNumber
	 */
	public String subtract(HugeInt hugeIntNumber) {
		// Checks to see if the numbers are the same length. 
		if(largeNumber.length() != hugeIntNumber.largeNumber.length()) {
			// Is one larger than the other.
			if(largeNumber.length() > hugeIntNumber.largeNumber.length()) {
				// Get the difference and pad the smaller one with 0s.
				int difference = largeNumber.length() - hugeIntNumber.largeNumber.length();
				for(int i=0; i < difference; i++) {
					hugeIntNumber.largeNumber = "0" + hugeIntNumber.largeNumber;
				}
				// Reallocate the size of the array to the appropriate length and values.
				hugeIntNumber.reallocateLargeNumberArray();
			}
			else {		
				// Does the same thing as above just with the other number.
				int difference = hugeIntNumber.largeNumber.length() - largeNumber.length();
				for(int i=0; i < difference; i++) {
					largeNumber = "0" + largeNumber;
				}
				// Reallocate the size of the array to the appropriate length and values.
				reallocateLargeNumberArray();
			}
		}

		// Initializes a result array of ints to 0.
		int result[] = new int[largeNumber.length()+1];
		for(int i=0; i < result.length; i++) {
			result[i] = 0;
		}
		
		// Subs the two numbers together and places their results into the
		// results array.
		for(int i=0; i < largeNumberArray.length; i++) {
			result[i] = largeNumberArray[i] - hugeIntNumber.largeNumberArray[i];
		}
		
		
		// Checks to see if we need to carry the result.
		for(int i=0; i < largeNumberArray.length; i++) {
			if(result[i] < 0) {
				result[i+1] -= 1;
				result[i] = (largeNumberArray[i]+10) - hugeIntNumber.largeNumberArray[i];
			}
			
		}
		
		// Builds a new string of the very large number.
		String newNumber = "";
		for(int i=0; i < result.length; i++) {
			if(result[i] < 0) {
				result[i] = ~result[i]+1;
			}
			newNumber += result[i];
		}
		
		// Checks to see if the subtraction caused us to add another digit to the number.
		// If it didn't, then truncate the newNumber so the zero doesn't show up
		if(result[result.length-1] == 0) {
			return new StringBuilder(newNumber.substring(0, newNumber.length()-1)).reverse().toString();
		}
		else {
			return new StringBuilder(newNumber).reverse().toString();
		}
	}
	
	
	/**
	 * Multiplies a HugeInt with another HugeInt.
	 * @param hugeIntNumber
	 */
	public String multiply(HugeInt hugeIntNumber) {
		// Checks to see if the numbers are the same length. 
		if(largeNumber.length() != hugeIntNumber.largeNumber.length()) {
			// Is one larger than the other.
			if(largeNumber.length() > hugeIntNumber.largeNumber.length()) {
				// Get the difference and pad the smaller one with 0s.
				int difference = largeNumber.length() - hugeIntNumber.largeNumber.length();
				for(int i=0; i < difference; i++) {
					hugeIntNumber.largeNumber = "0" + hugeIntNumber.largeNumber;
				}
				// Reallocate the size of the array to the appropriate length and values.
				hugeIntNumber.reallocateLargeNumberArray();
			}
			else {		
				// Does the same thing as above just with the other number.
				int difference = hugeIntNumber.largeNumber.length() - largeNumber.length();
				for(int i=0; i < difference; i++) {
					largeNumber = "0" + largeNumber;
				}
				// Reallocate the size of the array to the appropriate length and values.
				reallocateLargeNumberArray();
			}
		}
		
		// The bit length of a product could be up to A+B.
		int result[] = new int[hugeIntNumber.largeNumberArray.length + largeNumberArray.length];
		for(int i=0; i < hugeIntNumber.largeNumberArray.length+largeNumberArray.length; i++) {
			result[i] = 0;
		}
		
		int carry = 0;
		// Mul
		for(int j=0; j < hugeIntNumber.largeNumberArray.length; j++) {
			for(int i=0; i < largeNumberArray.length; i++) {
				// Add the current number at the position in result + carry + the product of the 
				// two digits. Then get the carry.
				int temp = result[i+j] + carry + (largeNumberArray[i]*hugeIntNumber.largeNumberArray[j]);
				result[i+j] = temp % 10;
				carry = temp / 10;
			}
			result[j+largeNumberArray.length] += carry % 10;
			carry /= 10;
		}
		
		// Builds a new string of the very large number.
		String newNumber = "";
		for(int i=0; i < result.length; i++) {
			newNumber += result[i];
		}
		
		
		
		// Checks to see if the subtraction caused us to add another digit to the number.
		// If it didn't, then truncate the newNumber so the zero doesn't show up
		if(result[result.length-1] == 0) {
			return new StringBuilder(newNumber.substring(0, newNumber.length()-1)).reverse().toString();
		}
		else {
			return new StringBuilder(newNumber).reverse().toString();
		}
	}
	
	/**
	 * Divides a HugeInt with another HugeInt.
	 * @param hugeIntNumber
	 */
	public String divide(HugeInt hugeIntNumber) {
		// Checks to see if the numbers are the same length. 
		if(largeNumber.length() != hugeIntNumber.largeNumber.length()) {
			// Is one larger than the other.
			if(largeNumber.length() > hugeIntNumber.largeNumber.length()) {
				// Get the difference and pad the smaller one with 0s.
				int difference = largeNumber.length() - hugeIntNumber.largeNumber.length();
				for(int i=0; i < difference; i++) {
					hugeIntNumber.largeNumber = "0" + hugeIntNumber.largeNumber;
				}
				// Reallocate the size of the array to the appropriate length and values.
				hugeIntNumber.reallocateLargeNumberArray();
			}
			else {		
				// Does the same thing as above just with the other number.
				int difference = hugeIntNumber.largeNumber.length() - largeNumber.length();
				for(int i=0; i < difference; i++) {
					largeNumber = "0" + largeNumber;
				}
				// Reallocate the size of the array to the appropriate length and values.
				reallocateLargeNumberArray();
			}
		}
		
		if(!this.greaterThan(hugeIntNumber)) {
			return "0";
		}
		
		// Counts how many zeros there are in our number we are dividing by.
		int zeroCounter = 0;
		for(int i=0; i < hugeIntNumber.largeNumberArray.length-1; i++) {
			if(hugeIntNumber.largeNumberArray[i] == 0) {
				zeroCounter++;
			}
		}
		
		// Checks to see if we are dividing by zero. If it is, then throw error
		// and return.
		if(hugeIntNumber.largeNumberArray.length == zeroCounter) {
			System.out.println("ERROR: Division by 0");
			return "";
		}
		
		
		int quotient = 1;
		int i=0;
		HugeInt hi = new HugeInt(this.subtract(hugeIntNumber));
		while(i < 100) {
			i++;
			if(!isZero(hi)) {
				quotient++;
			}
			else {
				break;
			}
			
			hi = new HugeInt(hi.subtract(hugeIntNumber));
			for(int j=0; j < hugeIntNumber.largeNumberArray.length; j++) {
				System.out.print(hugeIntNumber.largeNumberArray[j]);
			}
		}
		
		String x = "" + quotient;	
		return x;
		
	}
	
	/**
	 * Mods a HugeInt with another HugeInt.
	 * @param hugeIntNumber
	 */
	public String mod(HugeInt hugeIntNumber) {
		// Checks to see if the numbers are the same length. 
		if(largeNumber.length() != hugeIntNumber.largeNumber.length()) {
			// Is one larger than the other.
			if(largeNumber.length() > hugeIntNumber.largeNumber.length()) {
				// Get the difference and pad the smaller one with 0s.
				int difference = largeNumber.length() - hugeIntNumber.largeNumber.length();
				for(int i=0; i < difference; i++) {
					hugeIntNumber.largeNumber = "0" + hugeIntNumber.largeNumber;
				}
				// Reallocate the size of the array to the appropriate length and values.
				hugeIntNumber.reallocateLargeNumberArray();
			}
			else {		
				// Does the same thing as above just with the other number.
				int difference = hugeIntNumber.largeNumber.length() - largeNumber.length();
				for(int i=0; i < difference; i++) {
					largeNumber = "0" + largeNumber;
				}
				// Reallocate the size of the array to the appropriate length and values.
				reallocateLargeNumberArray();
			}
		}
		
		if(!this.greaterThan(hugeIntNumber)) {
			return this.largeNumber;
		}
		
		String remainder = "";
		HugeInt hi = new HugeInt(this.subtract(hugeIntNumber));
		while(true) {
			if(isZero(hi)) {
				break;
			}
			hi = new HugeInt(hi.subtract(hugeIntNumber));
			remainder = hi.toString();
		}
	
		return remainder;
	}
	
	
	/**
	 * Checks to see if the 
	 * @param hugeIntNumber
	 * @return
	 */
	public boolean greaterThan(HugeInt hugeIntNumber) {
		
		if(largeNumber.length() > hugeIntNumber.largeNumber.length()) {
			return true;
		}
		
		if(largeNumber.length() < hugeIntNumber.largeNumber.length()) {
			return false;
		}
		
		for(int i=largeNumberArray.length-1; i >= 0; i--) {
			if(largeNumberArray[i] > hugeIntNumber.largeNumberArray[i]) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean isZero(HugeInt hugeIntNumber) {
		int count =0;
		for(int i=0; i < hugeIntNumber.largeNumber.length(); i++) {
			if(Integer.parseInt(hugeIntNumber.largeNumber.substring(i,i+1)) <= 0)
				count++;
		}
		
		if(count == hugeIntNumber.largeNumberArray.length) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * If for some reason the largeNumber changes in size by any number of
	 * digits, then reallocate the largeNumberArray to the appropriate size.
	 */
	public void reallocateLargeNumberArray() {
		largeNumberArray = new int[largeNumber.length()];
		
		// Reverse the string to insert into the array correctly
		String reversedLargeNumber = new StringBuilder(largeNumber).reverse().toString();
		// Add each digit to an array of ints.
		for(int i=0; i < largeNumber.length() ; i++) {
			largeNumberArray[i] = Integer.parseInt(reversedLargeNumber.substring(i,i+1));
		}
	}
	
	/**
	 * Prints out the large number into a string format.
	 */
	public String toString() {
		return largeNumber;
	}
}

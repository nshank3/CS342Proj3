import java.util.*;
public class MyInt {
	int[] MyArr;
	String LargeInteger;
	
	public MyInt(String LargeNumber){		//String to array
		this.LargeInteger = new StringBuilder(LargeNumber).reverse().toString();
		MyArr = new int[LargeInteger.length()];
		for(int i=0; i<LargeInteger.length(); i++){
			MyArr[i] = Character.getNumericValue(LargeInteger.charAt(i));
		}
	}


	
	// Math Methods for MyInt
	
	
	
	public void AddToThis(MyInt MyArr2){
		int i = 0;
		while((i < MyArr.length-1) && (i < MyArr2.MyArr.length-1)){
			MyArr[i] += MyArr2.MyArr[i];
			if (MyArr[i] > 9){
			 MyArr[i] -=10;
			 if(i < MyArr.length) MyArr[i+1] +=1;	//carry ten
			 else{
				 int[] tmp;
			 	 tmp = new int[MyArr.length+1];
			 	 int j =0;
			 	 for(j=0; i<MyArr.length; j++) tmp[j] = MyArr[j];
			 	 tmp[j++] = 1;
			 	 MyArr = tmp;	//Create new array because j would go out of bounds
			 }
			 }
			
			i++;
		}
	}
	
	public void SubtractFromThis(MyInt MyArr2){
		int i = 0;
		while((i <= MyArr.length-1) && (i <= MyArr2.MyArr.length-1)){
			if(MyArr[i] >= MyArr2.MyArr[i]) MyArr[i] -= MyArr2.MyArr[i];
			else{		//take away
				MyArr[i] = 10 + MyArr[i] - MyArr2.MyArr[i];
				int k=1;
				while(MyArr[i+k] == 0){
					MyArr[i+1] = 9;
					k++;
				}
				MyArr[i+k] -= 1;
			}
			 
			
			i++;
		}
	}
		
		public void MultiplyToThis(MyInt MyArr2){
			MyInt zero = new MyInt("0");
			MyInt one = new MyInt("1");
			while(MyArr2.isGreater(zero)){
				this.AddToThis(this);
				MyArr2.SubtractFromThis(one);
				
			}
		}
			
			
			
			
			
		public void DivideFromThis(MyInt Quotient){
			int n = 0;
			int k = 0;
			int[] zero = new int[MyArr.length];
			while (k<zero.length){
			zero[k] = 0;
			k++;
			}
			while(MyArr!=zero){
				MyInt.this.SubtractFromThis(Quotient);
				n++;
			}
		
			String tmpstring = Integer.toString(n);
			for(int i=0; i<tmpstring.length(); i++){
				MyArr[i] = tmpstring.charAt(i);
			}
				}	
		
		
		
		public boolean isGreater(MyInt MyInt2){
			for(int i=1; i < MyArr.length; i++){
				if(MyArr[MyArr.length-i] > MyInt2.MyArr[MyInt2.MyArr.length-i]) return true;
				else if(MyArr[MyArr.length-i]< MyInt2.MyArr[MyInt2.MyArr.length-i]) return false;
			}
				return false;
	
		}
}


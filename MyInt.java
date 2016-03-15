import java.util.*;
public class MyInt {
	int[] MyArr;
	String LargeInteger;
	
	public MyInt(String LargeNumber){		//int to array
		this.LargeInteger = new StringBuilder(LargeNumber).reverse().toString();
		MyArr = new int[LargeInteger.length()];
		for(int i=0; i<LargeInteger.length(); i++){
			MyArr[i] = LargeInteger.charAt(i);
		}
	}


	
	// Math Methods for MyInt
	
	
	
	public void AddToThis(MyInt MyArr2){
		int i = 0;
		while((i < MyArr.length) && (i<MyArr2.MyArr.length)){
			MyArr[i] += MyArr2.MyArr[i];
			if (MyArr[i] > 9){
			MyArr[i] -=10;
			MyArr[i+1] +=1;
			}
			//carry ten
			i++;
		}
	}
	
	public void SubtractFromThis(MyInt MyArr2){
		int i = 0;
		while((i < MyArr.length) && (i<MyArr2.MyArr.length)){
			MyArr[i] -= MyArr2.MyArr[i];
			if (MyArr[i] < 0){
			MyArr[i] +=10;
			MyArr[i+1] -=1;
			}
			//carry -ten
			i++;
		}
	}
		
		public void MultiplyToThis(MyInt MyArr2){
			int i = 0;
			while((i < MyArr.length) && (i<MyArr2.MyArr.length)){
				MyArr[i] *= MyArr2.MyArr[i];
				if (MyArr[i] > 9){
				
				MyArr[i+1] += (MyArr[i]/10) % 10;
				MyArr[i] = MyArr[i] %=10;
				}
				//carry -ten
				i++;
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
		

	
}


import java.util.*;
public class MyInt {
	int[] MyArr;
	
	public MyInt(int LargeAssNumber){		//int to array
		String tmp = Integer.toString(LargeAssNumber);
		MyArr = new int[tmp.length()];
		for(int i=0; i<tmp.length(); i++){
			MyArr[i] =tmp.charAt(i);
		}
	}

	
	public int ArrayToInt(){
		int tmp =0;
		for(int i=0; i<MyArr.length; i++){
			tmp += MyArr[i]*Math.pow(10, MyArr.length-i);  //Multiply each number by decimal place and add to integer
		}
		
		return tmp;
	}
	
	
	// Math Methods for MyInt
	
	
	
	public void AddToThis(MyInt MyArr2){
		int tmp = this.ArrayToInt() + MyArr2.ArrayToInt();
		String tmp2 = Integer.toString(tmp);
		MyArr = new int[tmp2.length()];
		for(int i=0; i<tmp2.length(); i++){
			MyArr[i] = tmp2.charAt(i);
		}
	
	}
	
	public void SubtractFromThis(MyInt MyArr2){
		int tmp = this.ArrayToInt() - MyArr2.ArrayToInt();
		String tmp2 = Integer.toString(tmp);
		MyArr = new int[tmp2.length()];
		for(int i=0; i<tmp2.length(); i++){
			MyArr[i] = tmp2.charAt(i);
		}
	}
		
		public void MultiplyToThis(MyInt MyArr2){
			int tmp = this.ArrayToInt()*MyArr2.ArrayToInt();
			String tmp2 = Integer.toString(tmp);
			MyArr = new int[tmp2.length()];
			for(int i=0; i<tmp2.length(); i++){
				MyArr[i] =tmp2.charAt(i);
		}
	}
		public void DividetFromThis(MyInt MyArr2){
			int tmp = this.ArrayToInt() / MyArr2.ArrayToInt();
			String tmp2 = Integer.toString(tmp);
			MyArr = new int[tmp2.length()];
			for(int i=0; i<tmp2.length(); i++){
				MyArr[i] = tmp2.charAt(i);
		}
	}	
		
		public void ModuloFromThis(MyInt MyArr2){
			int tmp = this.ArrayToInt() % MyArr2.ArrayToInt();
			String tmp2 = Integer.toString(tmp);
			MyArr = new int[tmp2.length()];
			for(int i=0; i<tmp2.length(); i++){
				MyArr[i] = tmp2.charAt(i);
		}
	}
		
		public boolean IsGreaterThan(MyInt MyArr2){
			return (this.ArrayToInt() > MyArr2.ArrayToInt());	
		}
		
		public boolean IsLessThan(MyInt MyArr2){
			return (this.ArrayToInt() < MyArr2.ArrayToInt());	
		}
		
		public boolean IsEqualTo(MyInt MyArr2){
			return (this.ArrayToInt() == MyArr2.ArrayToInt());	
		}
		
	
}


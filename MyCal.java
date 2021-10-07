package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MyCal {
	
	public static void main(String args[]) {
		// 1) By using same data type but declared with data type
		Calculator cal = (int a,int b) -> {System.out.println("With using data type ");return (a+b);};
		System.out.println(cal.add(4, 8));
		
		
		// 2) By using same data type but declared without data type
		Calculator cal1 = (a,b) -> {System.out.println("Without using data type ");return (a+b);};
		System.out.println(cal1.add(4, 4));
		
		
		// 3) Using predicate functional Interface 
		Predicate<Integer> p = x ->  { return x > 10;};
		System.out.println(p.test(10));
		
		// 4) LambdaExpression Usig forEach Method
		List<String> list = new ArrayList<String>();
		
		list.add("Gayatri");
		list.add("Prabhu");
		list.add("Ingale");
		
		list.forEach((n) -> System.out.println(n));
		
		// 5) Multiple statement in lambda Expression
		
		SaySomething say = (msg) -> {String s =" My Name is Gayatri"; return s+msg;};
		
			System.out.println(say.say(",Is it correct?"));
		
			
	}

}

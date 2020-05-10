import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.FactoryBean;


public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeZone().getDisplayName());
		
		System.out.println(Class.forName("java.util.Calendar").getName());
		
		
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		for(Integer value: values) {
			System.out.println(value);
		}
		
		//Internal iterator using Lamda Expression
		//values.forEach(value -> System.out.println(value));
		
		values.forEach(System.out::println);
		
		List<String> days = Arrays.asList("Sunday","Monday","Tuesday");
		
		days.forEach(day -> System.out.print(day+"|"));
		System.out.println();
		days.forEach(System.out::print);
	

	}

}

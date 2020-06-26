package lambda_8;
import java.util.*; 
import java.util.stream.IntStream; 
public class Average {
	public static void main(String[] args) 
    {
        IntStream stream = IntStream.of(98,56,78,34); 
        OptionalDouble obj = stream.average(); 
        if (obj.isPresent()) { 
            System.out.println(obj.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    } 

}

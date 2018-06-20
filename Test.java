import java.util.regex.*;
public class Test{
    public static void main(String args[]){
        String s="Ab1";
        String patter="[a-z]";
        Pattern ptr=Pattern.compile(patter);
        
        boolean result=Pattern.matches(ptr);
        System.out.println(result);
    }
}
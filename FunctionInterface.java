/**
 * InnerFunctionInterface
 */
interface Sayable{
    public String say();
    
}
public class FunctionInterface {
    public static void main(String[] args) {
        Sayable s = () ->{
            return "I Have To Say !!";
        };
        System.out.println(s.say());
    }
}


import java.util.*;

interface Greeting {
    void greet();
}

public class app {

    public static void main(String[] args){
        System.out.println("This is my first program in java");
        Greeting xx = ()->System.out.print("Hello World");
        xx.greet();
    }
}


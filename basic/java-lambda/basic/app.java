
import java.util.*;

interface Greeting {
    void greet();
}

public class app implements Test {
    public void getSome() {
        System.out.print("xxxxxxxxxx");
    }
    public static void main(String[] args){
        System.out.println("This is my first program in java");
        Greeting xx = ()->System.out.print("Hello World");
        app a = new app();
        a.display();
        a.getSome();
        xx.greet();
    }
}


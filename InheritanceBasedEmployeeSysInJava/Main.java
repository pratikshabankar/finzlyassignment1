package InheritanceBasedEmployeeSysInJava;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Employee employee1 = new Manager(101 , " - vaibhav ", "  ITM ");
        Employee employee2 = new Developer(102 , "-  mayur ", "  Java ");
        System.out.println(employee1);
        System.out.println(employee2);

    }
}

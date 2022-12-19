import java.util.Scanner;
abstract class Calculate{
     double x,y,result;
    abstract void calc();
}

class Addition extends Calculate{
    void calc(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers to be added: ");
        x = s.nextDouble();
        y = s.nextDouble();
        result = x + y;
        System.out.println("\n Sum: "+result+"\n");
    }
}

class Subtraction extends Calculate{
    void calc(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers to be subtracted: ");
        x = s.nextDouble();
        y = s.nextDouble();
        result = x - y;
        System.out.println("\nResult: "+result+"\n");
    }
}

class Multiply extends Calculate{
    void calc(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers to be multiplied: ");
        x = s.nextDouble();
        y = s.nextDouble();
        result = x * y;
        System.out.println("Product: "+result+"\n");
    }
}

public class Q3{
    public static void main(String args[]){
        int choice;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication" +
                    "\n4. Exit the Program\n\nEnter the choice: ");
            choice = s.nextInt();
            switch(choice){
                case 1: Addition a = new Addition();
                        a.calc();
                        break;
                case 2: Subtraction su = new Subtraction();
                        su.calc();
                        break;
                case 3: Multiply m = new Multiply();
                        m.calc();
                        break;
                case 4: System.out.println("Exiting the program!");
                        System.exit(0);
                        break;
                default: System.out.println("\nInvalid Choice!\n");
            }
        }while(true);
    }
}

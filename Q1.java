import java.util.Scanner;

class Customer{
    private int customer_no, qty;
    private double price , totalprice, discount , netprice;
    private String customer_name;

    public Customer(){
        customer_name = "Pul";
        customer_no = 13;
        qty = 3;
        price = 20000;
        totalprice = price * qty;
        discount = callDiscount(totalprice);
        show();
    }

    public Customer(String customer_name , int customer_no , int qty , double price){
        this.customer_name = customer_name;
        this.customer_no = customer_no;
        this.qty = qty;
        this.price = price;
        totalprice = price * qty;
        discount = callDiscount(totalprice);
        show();
    }

    public double callDiscount(double totalprice){
        if(totalprice>=50000)
            discount = 0.25*totalprice;
        else if((totalprice>=25000)&&(totalprice<50000))
            discount = 0.1 * totalprice;
        else
            discount = 0;
        netprice = totalprice - discount;
        return discount;
    }

    public void show(){
        System.out.print("\nCustomer Name: "+customer_name);
        System.out.print("\nCustomer Number: "+customer_no);
        System.out.print("\nItem Quantity: "+qty);
        System.out.print("\nPrice per Quantity: "+price);
        System.out.print("\nTotal Price: "+totalprice);
        System.out.print("\nDiscount: "+discount);
        System.out.println("\nNet Price: "+netprice);
    }
}

public class Q1{
    public static void main(String[] args){
        Customer c = new Customer();
        Scanner s = new Scanner(System.in);
        String customer_name;
        int customer_no, qty;
        double price;
        int n, i=1;
        System.out.print("\nEnter the number of customers: ");
        n = s.nextInt();
        while(i<=n){
            System.out.print("\nEnter the Customer Name: ");
            customer_name = s.next();
            System.out.print("Enter the Customer Number: ");
            customer_no = s.nextInt();
            System.out.print("Enter the Item Quantity: ");
            qty = s.nextInt();
            System.out.print("Enter the Item Price: ");
            price = s.nextDouble();
            Customer cc = new Customer(customer_name , customer_no , qty , price);
            i++;
        }
    }
}

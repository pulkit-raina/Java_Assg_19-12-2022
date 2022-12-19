import java.util.*;


class Patient{
    Scanner sc = new Scanner(System.in);
    int p_id[] = new int[30];
    String p_name[] = new String[30];
    int p_age[] = new int[30];
    String doc[] = new String[30];

    void input(int np){

        for(int i=1; i<=np; i++){
            System.out.print("\nEnter the Details of "+i+" Patients");
            System.out.print("\nEnter the Patient ID: ");
            this.p_id[i] = sc.nextInt();
            System.out.print("Enter the Patient Name: ");
            this.p_name[i] = sc.next();
            System.out.print("Enter the Patient Age: ");
            this.p_age[i] = sc.nextInt();
            System.out.print("Enter the Doctor Name of Patient being treated: ");
            this.doc[i] = sc.next();
        }
    }

    void display(int np){
        for(int i=1; i<=np; i++) {
            System.out.println("Details of patient " + i);
            System.out.println("Patient ID: " + this.p_id[i]);
            System.out.println("Patient Name: " + this.p_name[i]);
            System.out.println("Patient Age: " + this.p_age[i]);
            System.out.println("Treated Doctor Name: " + this.doc[i]);
            System.out.println(" ");

        }
    }

    void displaypt(int np){
        int id;
        System.out.println("\nEnter patient id: ");
        id = sc.nextInt();
        for(int i=1; i<=np; i++){
            if(id == p_id[i]){
                System.out.println("Details of patient "+i);
                System.out.println("Patient ID: "+this.p_id[i]);
                System.out.println("Patient Name: "+this.p_name[i]);
                System.out.println("Patient Age: "+this.p_age[i]);
                System.out.println("Treated Doctor Name: "+this.doc[i]);
                System.out.println(" ");
            }
        }
    }

    void docpt(int np){
        String docn;
        System.out.print("\nEnter doctor name: ");
        docn = sc.next();
        for(int i=1; i<=np; i++){
            if(docn.equals(this.doc[i]))
                System.out.println("Patient Name: "+this.p_name[i]);
        }

    }

}

public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Patient p = new Patient();
        System.out.print("\nEnter the no of patients: ");
        int np = sc.nextInt();
        p.input(np);
        do{
            System.out.println("\n1.Display details of all patients\n2.Display details from patient id\n3.Display details from Doctor name\n4.Exit the program?");
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();


            switch(choice){
                case 1: p.display(np);
                        break;
                case 2: p.displaypt(np);
                        break;
                case 3: p.docpt(np);
                        break;
                case 4: System.out.println("Exiting the program!");
                        System.exit(0);
                        break;
                default: System.out.println("\nInvalid Choice!\n");
            }
        }while(true);

    }
}

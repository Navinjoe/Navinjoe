
import java.util.Scanner;
import java.util.ArrayList;
class attendance {
    public static void main(String[] args) {
        System.out.println("WELCOME TO UNIQ FSD28");
        System.out.println("PLEASE CONFIRM YOUR ATTENDANCE");
        Scanner v = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = v.next();
        System.out.println("Enter your password");
        String pass = v.next();
        System.out.println("CONFIRM your ROLL NUMBER for Attendance");
        String FSD28=v.next();

       switch (FSD28){
           case "11":
               if((name.equalsIgnoreCase("navin"))&&(pass.equalsIgnoreCase("12345"))){
                   java.util.Date date=new java.util.Date();
                   System.out.println("your are present on "+(date));
               }
               else{
                   java.util.Date date=new java.util.Date();
                   System.out.println("yor are absent on " +(date));
               }
               break;
           case"22":
               if((name.equalsIgnoreCase("Sathish"))&&(pass.equalsIgnoreCase("56789"))){
                   java.util.Date date=new java.util.Date();
                   System.out.println("your are present on "+(date));
               }
               else{
                   java.util.Date date=new java.util.Date();
                   System.out.println("yor are absent on "+(date));
               }
               break;
           case "33":
               if((name.equalsIgnoreCase("jenish"))&&(pass.equalsIgnoreCase("12123"))){
                   java.util.Date date=new java.util.Date();
                   System.out.println("your are present on "+ (date));
               }
               else{
                   java.util.Date date=new java.util.Date();
                   System.out.println(" your  are absent on "+(date));
               }
               break;
       }
    }
}

 class ClassAttendanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add a student");
            System.out.println("2. Mark attendance");
            System.out.println("3. View attendance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.next(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    students.add(studentName);
                    System.out.println(studentName + " has been added to the class.");
                    java.util.Date date=new java.util.Date ();
                    System.out.println("thank you for using Uniq Atm\n"+date);
                    break;
                case 2:
                    System.out.print("Enter the student's name to mark attendance: ");
                    String attendanceName = scanner.nextLine();
                    if (students.contains(attendanceName)) {
                        System.out.println(attendanceName + " is marked as present.");
                    } else {
                        System.out.println(attendanceName + " is not in the class list.");
                    }
                    break;
                case 3:
                    System.out.println("List of students in the class:");
                    for (String student : students) {
                        System.out.println(student);
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
class Atmmachine{

    public static void main(String[] args){
        int balance=5000;
        while(true){
            Scanner n=new Scanner(System.in);
            System.out.println("WELCOME TO UNIQ ATM ");
            System.out.println("Options");
            System.out.println("1.Account balance");
            System.out.println("2.widthdraw amount");
            System.out.println("3.Deposit amount");
            System.out.println("4.Exit");

            System.out.println("Enter your choice:");
            int choice=n.nextInt();
            switch (choice){
                case 1:
                    System.out.println("your account balnce is "+balance);
                    java.util.Date date=new java.util.Date ();
                    System.out.println("thank you for using Uniq Atm\n"+date);
                    break;
                case 2:
                    Scanner s=new Scanner(System.in);
                    System.out.println("Enter the widthdraw amount:");
                    int wa=s.nextInt();
                     balance=balance-wa;
                    System.out.println("Your widthdrawn amount is "+wa);
                    System.out.println("Your account balance  is "+balance);
                    java.util.Date date1 =new java.util.Date ();
                    System.out.println("thank you for using Uniq Atm\n"+date1);
                    break;
                case 3:
                    System.out.println("enter your password");
                    String pass=n.next();
                    System.out.println("enter your otp");
                    String otp=n.next();
                    if((pass.equalsIgnoreCase("navin5")) &&(otp.equalsIgnoreCase("5656"))){
                        Scanner t=new Scanner(System.in);
                        System.out.println("Enter the Deposit Amount:");
                        int wa1=t.nextInt();
                         balance=balance+wa1;
                        System.out.println("your deposited amount is "+wa1);
                        System.out.println("your account balance is "+balance);
                        System.out.println();
                        java.util.Date date2 =new java.util.Date ();
                        System.out.println("thank you for using Uniq Atm\n"+date2);
                    }
                    else{
                        System.out.println("invalid Otp");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using this Atm\n" +
                            "Visit again");
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        System.exit(0);
                        break;



            }

        }

    }
}




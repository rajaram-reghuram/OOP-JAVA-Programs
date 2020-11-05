import java.util.Scanner;

class Employee
{
  String name;
  String age;
  String number;
  String address;
  int salary;
 Scanner in = new Scanner(System.in);
 
public void read() 
 {
 
 
      System.out.print("Enter the name :: ");
     name = in.nextLine();
     System.out.print("Enter the age :: ");
     age = in.nextLine();
     System.out.println("Enter the phone number ::");
      number=in.nextLine();
      
      System.out.println("Enter the address ::");
      address=in.nextLine();
     System.out.print("Enter the salary :: ");
     salary = in.nextInt();
     in.nextLine();
  
 }
 
 public void display() 
  {
  
      System.out.println("Employee name = " + name);
     System.out.println("Employee age = " + age);
     System.out.println("Employee phone number = " + number);
       System.out.println("Employee address = " + address);
      System.out.println("Employee salary = " + salary);
 }
  public void printSalary()
    {
        System.out.println("The salary : :"+salary);
     }

}

class Officer extends Employee
{
  String specialization;
  public void readOff() 
 {
     System.out.println("\nEnter the details of officer ::");
     read();
    System.out.println("Specialistaion ::");
    specialization=in.nextLine();
 }
  
  public void displayOff() 
  {
  
      display();
       System.out.println("Specialistaion =" +specialization);
  }
  public void printSalary()
    {
        System.out.println("The salary : :"+salary);
     }

}

class Manager extends Employee
{
  String department;
  
  public void readmanag() 
 {
 
 
     System.out.println("\nEnter the details of manager ::");
     read();
    System.out.println("Department ::");
    department=in.nextLine();
 }
  
  public void displaymanag() 
  {
  
     display();
      System.out.println("Department ="+department);
 }
  public void printSalary()
    {
        System.out.println("The salary : :"+salary);
     }

}

 
public class Main
{
  public static void main(String[] args){
    Employee e = new Employee();
    e.read();
    System.out.println("\n\nThe Details are : ");
    e.display();
    e.printSalary();
    Manager m = new Manager();
    m.readmanag();
    System.out.println("\n\nThe Details are : ");
    m.displaymanag();
    m.printSalary();
    Officer o = new Officer();
    o.readOff();
    System.out.println("\n\nThe Details are : ");
    o.displayOff();
    o.printSalary();
  }
}			



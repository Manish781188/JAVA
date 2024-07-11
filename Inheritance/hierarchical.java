class Employee{
    int salary = 50000;
}
class employee1 extends Employee{
    int bonas= 2000;
    int em1_salary = salary+bonas;
}
class employee2 extends Employee{
int bonas = 3000;
int em2_salary = salary+bonas;
}
public class hierarchical{
    public static void main(String[] args){
        employee2 obj = new employee2();
        System.out.println("Employee2 total salary :" +obj.em2_salary);
    
    employee1 obj1 = new employee1();
        System.out.println("Employee1 total salary :" +obj1.em1_salary);
    }
}

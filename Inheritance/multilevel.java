class base_Salary{
    int B_salary = 20000;
}
class EPFO extends base_Salary{
    int epfo= 2000;
}
class total_salary extends EPFO{
    int t_salary = B_salary + epfo;
}
public class multilevel{
    public static void main(String[] args){
        total_salary obj = new total_salary();
       System.out.println(" base Salary : "+ obj.B_salary);
       System.out.println("epfo : "+ obj.epfo);
       System.out.println("Total Salary : "+ obj.t_salary);
    }
}
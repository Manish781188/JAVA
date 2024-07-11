class employee{
    int salary=100000;
};
class Engineer extends employee{
    int EPO = 5000;
};
public class single_inheritance{
public static void main(String[] args){
  Engineer obj = new Engineer();
  System.out.println("Salary : "+ obj.salary);
  System.out.println("PF : "+ obj.EPO);

  }
}

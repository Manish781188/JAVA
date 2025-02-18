abstract class parent{
  abstract public void show();

     public void display(){
    System.out.println("parnet dispay");
      }

}
class child extends parent{
public void show(){
    System.out.println("child show");
}

public void display(int x){
    
System.out.println("child display");
}
}

public class Abstruction{

    public static void main(String[] args){

     child c = new child();
     c.show();
     c.display(4);
     c.display();

    }
}
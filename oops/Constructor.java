class Demo{
    int a;
    String b;
//     public  Demo(){   // Non perametrised constructor
//     System.out.println("hello");
//   }
//    public void Demo(){   // method
//     System.out.println("hello");
//   }
//   public int Demo(){   // method
//     return 6;
//   }

      Demo(int a , String b){   // perametrised constructor 
     this.a = a;
     this.b = b;
      }
    Demo(int x, String y){   // duplicate constructor 
     a =x;
     b =y;
      }

    //   Demo(){} //constructor overloading

    public void show(){
        System.out.println(a +" " + b + " ");
    }

}

public class Constructor{

    public static void main(String[] args){
   Demo d = new Demo(4,"hi");
   d.show();
//    d.Demo(); //constructor connot call  or access by object  output ---> error
//    new Demo();
    }
}
class copy{

    int a ,b;  //shallow
   static String s;  // deep copy
    copy(int a , int b , String s){
        this.a = a;
        this.b = b;
        this.s = s;
    }
    copy(copy x){
        a=x.a;
        b=x.b;
        s=x.s;
    }

    public void show(){
        System.out.println(a + " " + b + " " + s);
    }
}
public class copy_constructor{

    public static void main(String[] args){

        copy x = new copy(4,5,"kabir");
        copy y = new copy(x);
        x.show();
        y.show();
        x.s ="manish";
        x.a =9;
         x.show();
        y.show();
    }
}
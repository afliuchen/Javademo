package deleft;

public class C implements B,A{
    public static void main(String[] args) {
       //new C().hello();

    }
    public void hello(){
        B.super.hello();
    }
}

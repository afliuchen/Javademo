package UML;

public class test {
    public static void main(String[] args) {
        Feed f=new Feed();
        f.regis(new NytIMES());
        f.regis(new Guardian());
        f.regis(new LeMonde());
        f.notifyvers("The queen said her favourite book is Modern！");
    }
}

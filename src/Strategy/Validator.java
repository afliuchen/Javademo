package Strategy;

public class Validator {
    private final Validationstr str;
    public Validator(Validationstr v){
        this.str=v;
    }
    public boolean validate(String s){
        return str.execute(s);
    }

    public static void main(String[] args) {
        Validator number=new Validator(new IsNumbers());
        boolean b1=number.validate("aaa");
     //   System.out.println(b1);
        Validator string=new Validator(new IsAlllowser());
        boolean b2=string.validate("aaa");
       // System.out.println(b2);

        Validator numbers2=new Validator((String s)->s.matches("[a-z]+"));
      boolean b3 = numbers2.validate("aaa");
        System.out.println(b3);
    }
}

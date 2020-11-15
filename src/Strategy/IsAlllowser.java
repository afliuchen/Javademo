package Strategy;

public class IsAlllowser implements Validationstr{
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}

package Strategy;

public class IsNumbers implements Validationstr{
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}

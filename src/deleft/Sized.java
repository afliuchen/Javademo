package deleft;

public interface Sized {
    int size();
    default boolean isEsizd(){
        return size()==0;
    }
}

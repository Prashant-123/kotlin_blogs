import java.util.ArrayList;

class Test<T> {
    T obj;
    Test(T obj) { this.obj = obj; }
    public T getObject() {
        return this.obj;
    }
}

public class Generics {
    public static void main(String args[]) {
        ArrayList<? super Integer> list = new ArrayList();
        list.add(1);

        Integer num = list.get(0);
    }
}
package basicprogram;

import java.util.ArrayList;
import java.util.List;


// target type is the expected type the compiler infers based on the context of the method call.
public class TargetTypeExample {
    public static void main(String[] args) {
        List<String> strListGeneralized = add(new ArrayList<>(), "abc", "def");
        System.out.println("String List: " + strListGeneralized);

        List<Integer> intListGeneralized = add(new ArrayList<>(), 1, 2);
        System.out.println("Integer List: " + intListGeneralized);

        List<Number> numListGeneralized = add(new ArrayList<>(), 1, 2.0);
        System.out.println("Number List: " + numListGeneralized);
    }

    static <T> List<T> add(List<T> list, T a, T b) {
        list.add(a);
        list.add(b);
        return list;
    }
}


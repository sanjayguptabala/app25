import java.util.*;

public class Main {

    Integer[] fun(Integer[] a) {
       HashSet<Integer> set = new HashSet<>(Arrays.asList(a));
       return set.toArray(new Integer[0]);
    }

    public static void main(String[] args) {

        Main o = new Main();
        Integer[] arr = {5, 2, 2, 1, 3};
        Integer[] result = o.fun(arr);
        System.out.println(Arrays.toString(result));
    }
}
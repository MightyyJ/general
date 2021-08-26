import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Fun with Fibs!");
        HashMap<Integer, Integer> cache = new HashMap<>();
        int[] arr = {1, 3, 5, 7, 9, 40, 50, 60};

        // for (int i = 0; i < arr.length; i++)
        //     System.out.println(String.valueOf(fib(arr[i]))); 
        
        System.out.println("Now with memoization");

        for (int i = 0; i < arr.length; i++)
            System.out.println(String.valueOf(fib(arr[i], cache))); 

    }

    public static int fib(int value){

        try{
            if (value < 2)
                return 1;
            else
                return fib(value - 1) + fib(value - 2);
        }
        catch(Exception e){
            System.out.println("We cant HANDLE the truth!");
            return -1;
        }
    }

    public static int fib(int value, HashMap<Integer, Integer> cache){

        if (cache.containsKey(value))
            return cache.get(value);
        else if (value < 2)
            return 1;
        else{
            cache.put(value, fib(value - 1) + fib(value - 2));
            return cache.get(value);
        }
    }
}

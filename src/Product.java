import java.util.ArrayList;

public class Product {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                int product = i * j;
                System.out.println(i + "*" + j + "=" + product);
            }
        }
        ArrayList<String> car=new ArrayList<>();
        car.add("BMW");
        car.add("Audi");
        car.add("Honda");
        System.out.println(car);


    }
}
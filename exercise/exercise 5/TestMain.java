import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 工厂模式
 */
public class TestMain {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a fruit name: ");
        String fruitName = reader.readLine();
        Fruit fruit = Farm.createFruit(fruitName);
        fruit.eat();
    }
}

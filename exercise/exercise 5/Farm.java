import java.util.HashMap;

public class Farm {
    public static Fruit createFruit(String name){
        Fruit fruit = null;
        HashMap<String, String> fruitMenu = new HashMap<>();
        fruitMenu.put("apple", "Apple");
        fruitMenu.put("strawberry", "Strawberry");

        String className = fruitMenu.get(name);

        try{
            Class classObj = Class.forName(className);
            fruit = (Fruit) classObj.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return fruit;
    }
}

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) throws Exception, IOException {
        User user = new User(1, "yanHang Li");
        System.out.println(user);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user"));
        oos.writeObject(user);
        oos.close();

        File file = new File("user");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        User new_user = (User) ois.readObject();
        System.out.println(new_user.toString());
    }
}

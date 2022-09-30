import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("raj");
        li.add("kumar");
        li.add("kavita");
        li.add("namo");
        li.add("surekha");
        li.add("nitin");
        System.out.println(li);

    }

    public void reverse(String name) {
        for (int index = 0; index < name.length(); index--) {
            Character charac = name.charAt(index);
            System.out.println(index);

        }
    }
}
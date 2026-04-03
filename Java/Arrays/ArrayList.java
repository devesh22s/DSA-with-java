package Java.Arrays;
import java.util.*;

public class ArrayList {

    
// | Feature        | Array    | ArrayList   |
// | -------------- | -------- | ----------- |
// | Size           | Fixed    | Dynamic     |
// | Add element    | Hard     | Easy        |
// | Remove element | Hard     | Easy        |
// | Package        | built-in | `java.util` |

    
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

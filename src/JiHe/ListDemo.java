package JiHe;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("河池学院");
        list.add("hello,word");
        list.add(1);
        list.add('A');
        System.out.println("list的中的元素个数：" + list.size());
        for (int i=0;i<list.size();i++)
        {
            System.out.println("list中的元素：" + list.get(i));
        }
    }
}

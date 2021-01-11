package JiHe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add("河池学院");
        set.add("Hello,world");
        set.add('A');
        set.add(1);
        System.out.println("set集合中的元素的个数：" + set.size());
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}

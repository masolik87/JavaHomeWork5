/*
    Создать словарь HashMap. Обобщение <Integer, String>.
    Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
    Изменить значения дописав восклицательные знаки.
    *Создать TreeMap, заполнить аналогично.
    *Увеличить количество элементов до 1000 случайными ключами и общей строкой.
    **Сравнить время последовательного и случайного перебора тысячи элементов словарей.
 */
import java.util.*;
public class HomeWork5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "White");
        map.put(2, "Green");
        map.put(3, "Red");
        System.out.println(map);
        map.replace(1, "White", "White!");
        map.replace(2, "Green", "Green!");
        map.replace(3, "Red", "Red!");
        System.out.println(map);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "Black");
        treeMap.put(5, "Yellow");
        treeMap.put(6, "Pink");
        System.out.println(treeMap);
        treeMap.putIfAbsent(4, "Black!");
        treeMap.putIfAbsent(5, "Yellow!");
        treeMap.putIfAbsent(6, "Pink!");
        System.out.println(treeMap);
    }
}

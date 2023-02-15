package Task1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    /*
1) При помощи Queue создайте
перечень товаров из 5-и наименований.+
2) Добавьте к перечню еще одно
наименование товара.
3) Выведите нумерованый перечень.+
4) Формирование перечня, добавление
элемента и вывод результата
сделайте каждый в отдельном методе.
*/
    public static void main(String[] args) {
        numberedOut(join(getQueue(), newName()));
    }
    private static Queue<String> getQueue(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Compass");
        queue.add("Map");
        queue.add("Monocle");
        queue.add("Ship");
        queue.add("Hat");
        return  queue;
    }
    private static Queue<String> newName() {
        Queue<String> queueAdd = new LinkedList<>();
        queueAdd.add("Bandage");
        return queueAdd;
    }

    private static Queue<String> join(Queue<String> queue, Queue<String> queueAdd){
        queue.addAll(queueAdd);
        return queue;
    }

    private static void numberedOut( Queue<String> queue){
        int count = 0;

        for (String num : queue) {
            count++;
            System.out.println(count + "."+ num);
        }
    }
}

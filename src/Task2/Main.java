package Task2;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    /*1) При помощи Queue создайте
перечень товаров из 5-и наименований.
2) Удалите из начала перечня один
элемент.
3) Выведите нумерованый перечень.
4) Формирование перечня, удаление
элемента и вывод результата
сделайте каждый в отдельном методе.*/
    public static void main(String[] args) {
        numberedOut(minusElem(getQueue()));
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
    private static Queue<String> minusElem(Queue<String> queue) {
        queue.remove("Hat");
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

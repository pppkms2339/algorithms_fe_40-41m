import java.util.Arrays;

public class DynamicArray {

    private int[] array;
    private int count;  // количество занятых ячеек массива

    public DynamicArray() {
        array = new int[1];
        count = 0;
    }

    // Метод, который добавляет элемент в конец массива
    public void add(int data) {
        // Проверим, а есть ли свободные ячейки
        if (count == array.length) {
            // Необходимо расширить массив
            increaseArray();    // сделать массив в два раза длиннее
        }
        array[count] = data;
        count++;
    }

    // Метод, который добавляет элемент по указанному индексу [0, count]
    public void add(int data, int index) {
        // Если индекс вне диапазона, то выходим
        if (index < 0 || index > count) {
            System.out.println("Index out of bounds exception!!!");
            return;
        }
        // Проверим, а есть ли свободное место для вставки нового элемента
        if (count == array.length) {
            // Необходимо расширить массив
            increaseArray();    // сделать массив в два раза длиннее
        }

        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = data;
        count++;
    }

    // Удаление последнего элемента
    public void remove() {
        if (count > 0) {
            array[count - 1] = 0;
            count--;
        }
    }

    // Удаление элемента с индексом index
    public void remove(int index) {
        // Если индекс вне диапазона, то выходим
        if (index < 0 || index > count - 1) {
            System.out.println("Index out of bounds exception!!!");
            return;
        }
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1];
            }
            array[count - 1] = 0;
            count--;
        }
    }

    private void increaseArray() {
        int[] temp = new int[array.length * 2];
        for (int i = 0; i < count; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    // Сужение массива - удаление нулей с конца массива
    public void trim() {
        int[] temp = new int[count];
        for (int i = 0; i < count; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void printArray() {
        System.out.println(Arrays.toString(array) + ", size = " + array.length + ", count = " + count);
    }
}

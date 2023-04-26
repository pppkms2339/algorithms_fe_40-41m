public class Main {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(10);
        da.printArray();
        da.add(20);
        da.printArray();
        da.add(30);
        da.printArray();
        da.add(40);
        da.printArray();
        da.add(50);
        da.printArray();
        da.add(60, 0);
        da.printArray();
        da.add(70, 6);
        da.printArray();
        da.add(80, 3);
        da.printArray();
        da.add(90, 3);
        da.printArray();
        da.remove();
        da.printArray();
        da.remove(3);
        da.printArray();
        da.trim();
        da.printArray();
        da.add(100);
        da.printArray();
    }
}
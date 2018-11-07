public class ExeptionMain {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        m1(array,10);


    }
    public static void m1(int[]array,int n){
        System.out.println(array[n]);

    }
    public static void m2(int[]array,int n){
        try {
            System.out.println(array[n]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ячейка"+n+"не существует,выход за пределы массива");
        }finally {
            System.out.println("m2 выполнен");
        }
    }
}

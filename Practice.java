public class Practice {
    public static void main(String[] args) {
        Practice prc = new Practice();
        prc.method();
    }
    //创建一个method方法，，该方法是用来打印一个10 x 8 的 *形矩阵在main()方法中调用method方法
    public void method() {
        int i, j;
        for(i = 0; i < 10; i++) {
            for(j = 0; j < 8; j++) {
                System.out.print("*   ");
            }
            System.out.print("\n");
        }
    }
}

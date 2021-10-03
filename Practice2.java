public class Practice {
    public static void main(String[] args) {
        Practice prc = new Practice();
        int area = prc.method();
        System.out.println("该矩阵的面积为：" + area);
//        prc.method();
    }
//    创建一个method方法，，该方法是用来打印一个10 x 8 的 *形矩阵在main()方法中调用method方法
//    public void method() {
//        int i, j;
//        for(i = 0; i < 10; i++) {
//            for(j = 0; j < 8; j++) {
//                System.out.print("*   ");
//            }
//            System.out.print("\n");
//        }
//    }
//第二题：在上面程序的基础上，除打印该矩阵外，另外计算该矩阵的面积并且返回该面积，依旧是使用method()方法
    public int method() {
        int i, j;
        for(i = 0; i < 10; i++) {
            for(j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        return 10 * 8;
    }
}

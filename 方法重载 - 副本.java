public class Learn {
    /*  1.编写程序，定义三个重载方法并调用。方法名为mOl。
        三个方法分别接收一个int参数，两个int参数，一个字符串参数.
        分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
        在主类的main()方法中用参数区别调用三个方法
        2.定义三个重载方法max()
        第一个方法求两个int中的最大值
        第二个方法求两个double中的最大值
        第三个方法求三个double值中的最大值
     **/
    public static void main(String[] args) {
        OverLoadExer test = new OverLoadExer();
        int max = test.max(2,4);
        System.out.println("最大值是:" + max);
    }
}

 class OverLoadExer {
    public void mOl(int i) {
        System.out.println(i * i);
    }
    public void mOl(int i, int j) {
        System.out.println(i * j);
    }
    public void mOl(String s) {
        System.out.println(s);
    }
    public int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
    public double max(double num1, double num2) {
        return  ( ( num1 > num2 )? num1: num2) ;
    }
    public double max(double num1, double num2, double num3) {
        double currentMax = num1 > num2 ? num1 : num2;
        return currentMax> num3 ? currentMax: num3;
    }
}

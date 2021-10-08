package Test1;
/*定义类Kids继承ManKind，并包括
成员变量int yearsOld;
成员方法printAge()打印yearsOld的值；
*/
public class Kids extends ManKind {
    private int yearsOld;
    public Kids(int age) {
        yearsOld = age;
    }
    public void printAge(int yearsOld) {
        System.out.println(yearsOld);
    }

    public int  gettAge() {
        return yearsOld;
    }

}

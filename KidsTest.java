package Test1;
/*定义类KidsTest,在类的main()方法中实例化Kids的对象someKid,
用该对象访问其父类的的成员方法变量及方法。
*/
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids(12);

       int age = someKid.getAge();
       someKid.printAge(age);

       someKid.setSex(1);
       someKid.printSex();

       someKid.setSalary(1);
       int salary = someKid.getSalary();
       someKid.employeed(salary);

    }
}

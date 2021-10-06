public class Animal {
    public static void main(String[] args) {
        Animals animals1 = new Animals();
        animals1.getAge(5);
    }
}

class Animals {
    private int age;
    int legs;
    String name;

    public void getAge(int age) {
        age = age;
        System.out.println("The age is:" + age);
        System.out.println("The legs is: " + legs);
        System.out.println("The name is :" + name);
    }
}

/*结论：当我们创建一个类的对象后，我们可以通过“对象.属性”的方法对属性进行赋值。这里，赋值操作要受
属性的数据类型和存储范围的制约。除此之外，没有其他制约条件。但是，在实际生活中，我们往往需要给属性赋值
加入额外的限制条件。但是，这个条件就不能在属性声明时体现，我们只能通过方法进行限制条件的添加。
同时，我们需要避免用户再使用“对象.属性”的方式对属性赋值，我们需要将属性声明为私有的(private)
此时，针对属性就体现了封装性。
 */
 */
 */
 */
 */

 */
 */
/
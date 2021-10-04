public class Learn {
    /**题目一： 定义student类，包含三个属性：学号number(int)，年级grade(int),成绩score(int)。
            创建二十个学生对象，学号为1到20，年级和成绩都有随机数来确定。
            问题一：打印出三年级(state值为3)的学生信息
            问题二:使用冒泡排序对学生成绩排序，并遍历所有学生信息*/
    public static void main(String[] args) {
        //创建对象数组
        student[] students = new student[20];
        for(int i = 0; i < students.length; i++) {
            /**这里一定要注意对数组中元素的理解，这里数组元素是student类，是引用数据类型，所以初始化以后是Null，如果想要使用这块空间的话，必须自己手动new一块空间
             否则是会报空指针异常的！！！没有十三行的额外自己手动开空间的话，一定会报空指针异常。
             * */
            students[i] = new student();
            students[i].number = i + 1;
            //假设这里的年级是[1, 6]
            students[i].state = (int) ( Math.random() * (6 - 1 + 1) + 1 );
            //假设这里的成绩是[0, 100]
            students[i].grade = (int) ( Math.random() * (100 + 1) );
            String information = students[i].info();
            System.out.println(information);
        }
        //遍历学生数组
        for (student value : students) {
            if (value.state == 3) {
                System.out.println(value.state);
            }
        }
        System.out.println("*******************************");
        for(int i = 0; i < students.length - 1; i++) {
            for(int j = 0; j < students.length - i - 1; j++) {
                if (students[j].grade > students[j + 1].grade) {
                    student tmpt = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmpt;
                }
            }
        }
        //输出排序后所有的学生的信息
        for (student student : students) {
            System.out.println("成绩:    " + student.grade + "    " + "年级:    " + student.state + "    " + "学号:    " + student.number);
        }
   }
}
class student {
    int number;
    int grade;
    int state;
    public String info() {
        return ("学号:    " + number +"   " + "年级:   " + state + "    " + "成绩:    " + grade );
    }
}

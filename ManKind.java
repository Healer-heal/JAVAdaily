package Test1;
/*  定义一个ManKind类，包括
成员变量int sex和int salary;
方法void manOrWoman(),根据sex的值显示"man"(sex == 1)或者"woman"(sex == 0) .
方法void employeed(),根据salary的值显示"no job"(salary == 0)或者"job"(salary == 0).
 */
public class ManKind {
    private int sex;
    private int salary;

    public void manOrWoman(int sex) {
        if (sex == 1) {
            System.out.println("man");
        }
        else if (sex == 0) {
            System.out.println("woman");
        }
    }

    public void employeed(int salary) {
        if (salary == 0) {
            System.out.println("no job");
        }
        else if (salary == 1) {
            System.out.println("job");
        }
    }

    public int  getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void printSex() {
        if (sex == 1){
            System.out.println("我是男人");
        }
        else if (sex == 0) {
            System.out.println("我是女人");
        }
    }

    public void  setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

}

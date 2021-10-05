public class PassObject {
    public static void main(String[] args) {
        Circle c = new Circle();
        PassObject obj = new PassObject();
        obj.PrintArea(c,5);
    }
    public void PrintArea(Circle c,int time) {
        int i;
        for(i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea() );
        }
        c.radius = time + 1;
        System.out.println("now the radius is " + c.radius);
    }
}
 class Circle {
    double radius;
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
package Olga.first.second.third;

public class First {

public static void main(String[] args) {
System.out.println("Hello, world");
Square s = new Square (8);
    System.out.println(+s.l+"="+s.area());
    Rectungle r = new Rectungle (9, 13);
    System.out.println(+r.a+"*"+r.b+"="+r.area());
    Point p = new Point (398, 76);
    System.out.println(+p.p1+"-"+p.p2+"="+p.area());

}

}


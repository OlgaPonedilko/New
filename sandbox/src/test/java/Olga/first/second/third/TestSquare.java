package Olga.first.second.third;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSquare {
    @Test
            public void test1 (){
        Square s = new Square(11);
        Assert.assertEquals (s.area(),121.0);
    }
@Test
    public void test2 (){
        Point p = new Point(398, 76);
        Assert.assertEquals(p.area(), 322.0);
}


}

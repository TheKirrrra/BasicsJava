package lesson_43;
/*

(4,1,5)
(6,2,8)
(10,11,15)
(15,2,5)


 */
public class PointsPrinter {

    public void printAll(Point[] points, Convert convert) {
        for (int i = 0; i < points.length; i++) {

            Point current = points[i];

            String pointToPrint = convert.from(current.getX(), current.getY(),current.getZ());

            System.out.println(pointToPrint);
        }
    }
}

public class RectangleRunner {
    public static void main (String[] args) {
        Rectangle plot1 = new Rectangle(150,200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        //Plot dimensions
        System.out.println("Plot 1 Length: " + plot1.getLength());
        System.out.println("Plot 1 Width: " + plot1.getWidth());
        System.out.println("Plot 1 Area: " + plot1.calculateArea());

        System.out.println("Plot 2 Length: " + plot2.getLength());
        System.out.println("Plot 2 Width: " + plot2.getWidth());
        System.out.println("Plot 2 Area: " + plot2.calculateArea());

        System.out.println("Plot 3 Length: " + plot3.getLength());
        System.out.println("Plot 3 Width: " + plot3.getWidth());
        System.out.println("Plot 3 Area: " + plot3.calculateArea());

        //Updated plot dimensions
        plot1.setWidth(75);

        plot2.setWidth(75);
        plot2.setLength(75);

        plot3.setWidth(75);

        //area of new plot dimensions
        int totalArea =  plot1.calculateArea() + plot2.calculateArea() + plot3.calculateArea();
        System.out.println("These three plots require " + totalArea + " square feet of seeds");


    }
}

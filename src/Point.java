public class Point {

    //instance variables
    private int x;
    private  int y;

    //constructors
        public Point (int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point (int xy) {
            this.x = xy;
            this.y = xy;
        }

        public Point () {
            x = 0;
            y = 0;
        }

    //getter methods
         public int getX() {
            return x;
         }

         public int getY() {
            return y;
         }

     //setter methods

        public void setX(int newX) {
            x = newX;
        }

    }

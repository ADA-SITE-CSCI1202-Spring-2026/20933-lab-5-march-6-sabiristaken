interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
    class Point implements Movable {
        int x, y;
    
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    
        @Override
        public void moveUp()    { y++; } 
        @Override
        public void moveDown()  { y--; }
        @Override
        public void moveLeft()  { x--; }
        @Override
        public void moveRight() { x++; }
    
        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }
    class Circle implements Movable {
        private Point center;
        private int radius;
    
        public Circle(int x, int y, int radius) {
            this.center = new Point(x, y);
            this.radius = radius;
        }
    
        @Override
        public void moveUp()    { center.moveUp(); }
        @Override
        public void moveDown()  { center.moveDown(); }
        @Override
        public void moveLeft()  { center.moveLeft(); }
        @Override
        public void moveRight() { center.moveRight(); }
    
        @Override
        public String toString() {
            return "Circle at center " + center + " with radius " + radius;
        }
    }
}
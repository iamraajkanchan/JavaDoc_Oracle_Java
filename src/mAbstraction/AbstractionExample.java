package mAbstraction;

abstract class Shape {

    abstract void draw();
    abstract void paint();
    abstract void sketch();
    abstract void redraw();
    abstract void delete();
}

abstract class ShapeImplementer extends Shape {

    ShapeImplementer() {
        super();
    }

    public void createShape() {
        sketch();
        draw();
        paint();
    }

    public void modifyShape() {
        delete();
        redraw();
        paint();
    }
}

class Rectangle extends ShapeImplementer {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    void paint() {
        System.out.println("Painting Rectangle");
    }

    @Override
    void sketch() {
        System.out.println("Sketching Rectangle");
    }

    @Override
    void redraw() {
        System.out.println("Redrawing Rectangle");
    }

    @Override
    void delete() {
        System.out.println("Deleting Rectangle");
    }
}

class Circle extends ShapeImplementer {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void paint() {
        System.out.println("Painting Circle");
    }

    @Override
    void sketch() {
        System.out.println("Sketching Circle");
    }

    @Override
    void redraw() {
        System.out.println("Redrawing Circle");
    }

    @Override
    void delete() {
        System.out.println("Deleting Circle");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.createShape();
        r.modifyShape();

    }
}

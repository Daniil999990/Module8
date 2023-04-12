
abstract class Shape {
    protected String name;

    protected Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void printName() {
        System.out.println("Фігура: " + name);
    }
}


class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Quad extends Shape {
    protected double[] sides;

    public Quad(String name, double[] sides) {
        super(name);
        this.sides = sides;
    }

    @Override
    public double calculateArea() {
        if (sides.length != 4) {
            throw new IllegalArgumentException("Квадрат має рівно 4 сторони!");
        }

        if (sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3]) {
            // Площа квадрата
            return sides[0] * sides[0];
        } else {
            // Площа прямокутника
            return sides[0] * sides[1];
        }
    }
}


class ShapePrinter {
    public void printShapeName(Shape shape) {
        shape.printName();
    }
}

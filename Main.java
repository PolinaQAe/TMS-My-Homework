import java.util.Random;
import java.util.Scanner;

abstract class Figure {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Rectangle extends Figure {
    double width;
    double height;

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Square extends Rectangle {
    @Override
    double calculateArea() {
        return width * width;
    }

    @Override
    double calculatePerimeter() {
        return 4 * width;
    }
}

class Circle extends Figure {
    double radius;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figure[] figures = new Figure[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Choose figure (1 - Rectangle, 2 - Square, 3 - Circle):");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Rectangle rectangle = new Rectangle();
                    System.out.println("Enter width and height of rectangle:");
                    rectangle.width = scanner.nextDouble();
                    rectangle.height = scanner.nextDouble();
                    figures[i] = rectangle;
                    break;
                case 2:
                    Square square = new Square();
                    System.out.println("Enter side length of square:");
                    square.width = scanner.nextDouble();
                    figures[i] = square;
                    break;
                case 3:
                    Circle circle = new Circle();
                    System.out.println("Enter radius of circle:");
                    circle.radius = scanner.nextDouble();
                    figures[i] = circle;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        double totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += figure.calculatePerimeter();
        }

        System.out.println("Total perimeter of all figures: " + totalPerimeter);
    }
}
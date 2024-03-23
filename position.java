
// Интерфейс
interface Position {
    void displayPosition();
}

// Класс Директор
class Director implements Position {
    @Override
    public void displayPosition() {
        System.out.println("Директор");
    }
}

// Класс Рабочий
class Worker implements Position {
    @Override
    public void displayPosition() {
        System.out.println("Рабочий");
    }
}

// Класс Бухгалтер
class Accountant implements Position {
    @Override
    public void displayPosition() {
        System.out.println("Бухгалтер");
    }
}

public class position {
    public static void main(String[] args) {
        // Пример использования
        Position director = new Director();
        Position worker = new Worker();
        Position accountant = new Accountant();

        director.displayPosition();
        worker.displayPosition();
        accountant.displayPosition();
    }
}
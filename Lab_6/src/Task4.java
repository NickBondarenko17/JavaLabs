abstract class Car {
    String model;
    String color;
    int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println("Газуємо!");
    }

    public abstract void brake();
}

class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Седан гальмує.");
    }
}

class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Грузовик гальмує.");
    }
}

public class Task4 implements TaskInterface{
    public void StartTask(){
        Sedan sedan = new Sedan("BAЗ 2101", "Фіолет", 160);
        Truck truck = new Truck("КАМАЗ 33501", "Жовтий", 80);

        System.out.println("Інформація про седан:");
        System.out.println("Модель: " + sedan.model);
        System.out.println("Колір: " + sedan.color);
        System.out.println("Максимальна швидкість: " + sedan.maxSpeed);
        sedan.gas();
        sedan.brake();

        System.out.println();

        System.out.println("Інформація про грузовик:");
        System.out.println("Модель: " + truck.model);
        System.out.println("Колір: " + truck.color);
        System.out.println("Максимальна швидкість: " + truck.maxSpeed);
        truck.gas();
        truck.brake();
    }
}
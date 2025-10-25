public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2018, "Red", 25000.0, "A123BC"),
            new Car(2, "Toyota", "Corolla", 2020, "Blue", 22000.0, "B456DE"),
            new Car(3, "BMW", "X5", 2019, "Black", 50000.0, "C789FG"),
            new Car(4, "Toyota", "RAV4", 2017, "White", 20000.0, "D012HI")
        };

        Car[] toyotas = getCarByBrend(cars, "Toyota");
        System.out.println("Машины марки Toyota:");
        for (Car car : toyotas) {
            if (car != null) {
                System.out.println(car.getId() + ": " + car.getMarka() + " " + car.getModel());
            }
        }

 getCarByBrendAndYearOperational
        Car[] oldToyotas = getCarByBrendAndYearOperational(cars, "Toyota", 5);
        System.out.println("\nToyota, эксплуатируются более 5 лет:");
        for (Car car : oldToyotas) {
            if (car != null) {
                System.out.println(car.getId() + ": " + car.getMarka() + " " + car.getModel() + " (" + car.getYear() + ")");
            }
        }
    }

    public static Car[] getCarByBrend(Car[] cars, String brend) {
        int count = 0;
        for (Car car : cars) {
            if (car != null && car.getMarka().equals(brend)) {
                count++;
            }
        }

        if (count == 0) {
            return new Car[0];
        }

        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car != null && car.getMarka().equals(brend)) {
                result[index++] = car;
            }
        }
        return result;
    }

    
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years) {
        int currentYear = 2025; 
        int count = 0;

        for (Car car : cars) {
            if (car != null && car.getMarka().equals(brend)) {
                int age = currentYear - car.getYear();
                if (age > years) {
                    count++;
                }
            }
        }

        if (count == 0) {
            return new Car[0];
        }

        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car != null && car.getMarka().equals(brend)) {
                int age = currentYear - car.getYear();
                if (age > years) {
                    result[index++] = car;
                }
            }
        }
        return result;
    }
}

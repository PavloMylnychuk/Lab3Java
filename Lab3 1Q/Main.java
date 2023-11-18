import java.util.Scanner;


class Ship {
    private String name;

    public Ship(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Тип судна: " + name);
    }
}


class Steamship extends Ship {
    public Steamship(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Це пароплав.");
    }
}


class Sailboat extends Ship {
    public Sailboat(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Це вітрильник.");
    }
}


class Corvette extends Ship {
    public Corvette(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Це корвет.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = 4;

        Ship[] ships = new Ship[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Об'єкт " + (i + 1));
            System.out.println("Введіть назву судна:");
            String name = scanner.nextLine();


            switch (i) {
                case 0:
                    ships[i] = new Ship(name);
                    break;
                case 1:
                    ships[i] = new Steamship(name);
                    break;
                case 2:
                    ships[i] = new Sailboat(name);
                    break;
                case 3:
                    ships[i] = new Corvette(name);
                    break;
                default:
                    break;
            }
        }


        System.out.println("Друк масиву об'єктів:");
        for (Ship ship : ships) {
            if (ship != null) {
                ship.show();
            }
        }
    }
}

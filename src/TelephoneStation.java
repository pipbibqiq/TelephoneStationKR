// Класс, представляющий космический корабль
public class TelephoneStation {
    private final String name;                // Название станции
    private final int maxCapacity;            // Максимальное количество телефонов
    private int numberOfConnectedPhones;      // Количество уже подключенных телефонов
    private float loadingCapacity;            // Нагруженность станции
    private boolean work;                     // Статус работает ли станция

    public TelephoneStation(String name, int maxCapacity, int numberOfConnectedPhones, float loadingCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.numberOfConnectedPhones = 0;
        this.loadingCapacity = 0;
        this.work = true;
    }

    // С целью человеческого вида вывода стека в консоль
    @Override
    public String toString() {
        return "{" + name + '}';
    }

    // Получение информации которая хранится в maxCapacity
    public int getMaxCapacity() {
        return maxCapacity;
    }

    // Получение информации которая хранится в numberOfConnectedPhones
    public int getNumberOfConnectedPhones() {
        return numberOfConnectedPhones;
    }

    // Запись информации в переменную loadingCapacity
    public void setLoadingCapacity(float loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    // Получение информации которая хранится в name
    public String getName() {
        return name;
    }

    // Метод для запуска телефонной станции
    public void startStation() {
        if (!work) {
            work = true;
            System.out.println("\n" + name + " начала работать!\n");
        } else {
            System.out.println("\nОшибка: " + name + " уже и так работает!\n");
        }
    }

    // Метод для остановки работы телефонной станции
    public void stopStation() {
        if (work) {
            work = false;
            System.out.println("\n" + name + " временно закрылась!\n");
        } else {
            System.out.println("\nОшибка: " + name + " уже была закрыта!\n");
        }
    }

    // Метод для подключения 1 телефона к станции
    public void connectPhone() {
        if ((numberOfConnectedPhones < maxCapacity) && work) {
            numberOfConnectedPhones++;
            System.out.print("\n+1 телефон успешно подключен\n");
        }
        else {System.out.println("\nСтанция перегружена. Подключение новых телефонов невозможно! Либо станция временно не работает!\n");}
    }

    // Метод для отключения 1 телефона от станции
    public void turnOffThePhone() {
        if ((numberOfConnectedPhones > 0) && work) {
            numberOfConnectedPhones--;
            System.out.print("\n1 телефон успешно отключен\n");
        }
        else { System.out.println("\nНету телефонов для отключения, либо станция временно не работает!\n");}
    }

    // Метод для вывода информации о корабле
    public void printStationInfo() {
        System.out.println("\nНазвание станции: " + name);
        System.out.println("Максимальное количество телефонов: " + maxCapacity);
        System.out.println("Количество уже подключенных телефонов: " + numberOfConnectedPhones);
        System.out.println("Статус работает ли станция: " + work);
    }
}
import java.util.Stack;

public class TelephoneStationStack {
    private static final Stack<TelephoneStation> stack = new Stack<>();

    // Метод для добавления станции в стек
    public static void addStation(TelephoneStation station) {
        if (!stack.contains(station)) {
            stack.push(station);
        } else {
            System.out.println("\nСтанция уже находится в стеке.");
        }
    }

    // Метод для удаления станции с определенным именем из стека
    public static TelephoneStation removeStationByName(String stationName) {
        TelephoneStation removedStation = null;
        Stack<TelephoneStation> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            TelephoneStation station = stack.pop();
            if (station.getName().equals(stationName)) {
                removedStation = station;
                break; // Найдена станция, можно завершить цикл
            } else {
                tempStack.push(station); // Записать остальные станции во временный стек
            }
        }

        // Вернуть станции обратно в исходный стек
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return null; // Возвращение null, так как нужно что-то возвращать :)
    }

    // Метод для проверки, пуст ли стек
    public static boolean isEmpty() {
        return stack.isEmpty();
    }

    // Метод для получения стека станций
    public static Stack<TelephoneStation> getStack() {
        return stack;
    }
}
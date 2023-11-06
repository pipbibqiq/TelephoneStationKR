import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TelephoneStation station1 = new TelephoneStation("Станция 1", 10, 0,0);
        TelephoneStation station2 = new TelephoneStation("Станция 2", 20,0,0);
        TelephoneStation station3 = new TelephoneStation("Станция 3", 30,0,0);

        TelephoneStationStack.addStation(station1);
        TelephoneStationStack.addStation(station2);
        TelephoneStationStack.addStation(station3);

        int selNum;
        do {
            System.out.println("Меню:");
            System.out.println("1. Вывести информация о конкретной станции");
            System.out.println("2. Запустить работу станции");
            System.out.println("3. Завершить работу станции");
            System.out.println("4. Подключить телефон к станции");
            System.out.println("5. Отключить телефон от станции");
            System.out.println("6. Вывести информацию о текущей нагрузки на станцию");
            System.out.println("7. Просмотреть стек станций");
            System.out.println("8. Добавить станцию в стек");
            System.out.println("9. Убрать станцию из стека");
            System.out.println("0. Выйти из меню");
            System.out.print("Выберите действие: ");
            selNum = scanner.nextInt();

            switch (selNum) {
                case 1:
                    System.out.print("Введите номер станции (1, 2, 3): ");
                    int stationNumber = scanner.nextInt();
                    TelephoneStation selectedStation = stationNumber == 1 ? station1 : (stationNumber == 2 ? station2 : (stationNumber == 3 ? station3 : null));
                    if (selectedStation != null) {
                        selectedStation.printStationInfo();
                    } else {
                        System.out.println("Неверный номер станции.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 2:
                    System.out.print("Введите номер станции (1, 2, 3): ");
                    int startStationNumber = scanner.nextInt();
                    TelephoneStation selectedStartStation = startStationNumber == 1 ? station1 : (startStationNumber == 2 ? station2 : (startStationNumber == 3 ? station3 : null));
                    if (selectedStartStation != null) {
                        selectedStartStation.startStation();
                    } else {
                        System.out.println("Неверный номер станции.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 3:
                    System.out.print("Введите номер станции (1, 2, 3): ");
                    int stopStationNumber = scanner.nextInt();
                    TelephoneStation selectedStopStation = stopStationNumber == 1 ? station1 : (stopStationNumber == 2 ? station2 : (stopStationNumber == 3 ? station3 : null));
                    if (selectedStopStation != null) {
                        selectedStopStation.stopStation();
                    } else {
                        System.out.println("Неверный номер станции.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 4:
                    System.out.print("Введите номер станции (1, 2, 3): ");
                    int connectStationNumber = scanner.nextInt();
                    TelephoneStation selectedConnectPhone = connectStationNumber == 1 ? station1 : (connectStationNumber == 2 ? station2 : (connectStationNumber == 3 ? station3 : null));
                    if (selectedConnectPhone != null) {
                        selectedConnectPhone.connectPhone();
                    } else {
                        System.out.println("Неверный номер станции.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 5:
                    System.out.print("Введите номер станции (1, 2, 3): ");
                    int turnOffStationNumber = scanner.nextInt();
                    TelephoneStation selectedTurnOffPhone = turnOffStationNumber == 1 ? station1 : (turnOffStationNumber == 2 ? station2 : (turnOffStationNumber == 3 ? station3 : null));
                    if (selectedTurnOffPhone != null) {
                        selectedTurnOffPhone.turnOffThePhone();
                    } else {
                        System.out.println("Неверный номер станции.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 6:
                    System.out.print("Введите номер станции (1, 2, 3): ");
                    int loadStationNumber = scanner.nextInt();
                    TelephoneStation selectedLoadStation = loadStationNumber == 1 ? station1 : (loadStationNumber == 2 ? station2 : (loadStationNumber == 3 ? station3 : null));
                    if (selectedLoadStation != null) {
                        int max = selectedLoadStation.getMaxCapacity();
                        int con = selectedLoadStation.getNumberOfConnectedPhones();
                        float loadingCapacity = ((float)con * 100) / (float)max;
                        selectedLoadStation.setLoadingCapacity(loadingCapacity);
                        System.out.println("\n" + loadingCapacity + "%\n");
                    } else {
                        System.out.println("Неверный номер станции.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 7:
                    System.out.println("\nСтек станций: " + TelephoneStationStack.getStack() + "\n");
                    break;

                case 8:
                    System.out.print("Введите номер станции (1, 2, 3): ");
                    int addStackStationNumber = scanner.nextInt();
                    TelephoneStation selectedAddStackStation = addStackStationNumber == 1 ? station1 : (addStackStationNumber == 2 ? station2 : (addStackStationNumber == 3 ? station3 : null));
                    if (selectedAddStackStation != null) {
                        TelephoneStationStack.addStation(selectedAddStackStation);
                        System.out.println("\nСтек станций: " + TelephoneStationStack.getStack() + "\n");
                    } else {
                        System.out.println("Неверный номер станции.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 9:
                    System.out.print("Введите номер станции (1, 2, 3): ");
                    int removeStationStack = scanner.nextInt();
                    TelephoneStation selectedStackRemoveStation = removeStationStack == 1 ? station1 : (removeStationStack == 2 ? station2 : (removeStationStack == 3 ? station3 : null));
                    if (selectedStackRemoveStation != null) {
                        TelephoneStationStack.removeStationByName(selectedStackRemoveStation.getName());
                        System.out.println("\nУспешно!");
                        System.out.println("\nСтек станций: " + TelephoneStationStack.getStack() + "\n");
                    } else {
                        System.out.println("Неверный номер станции.");
                    }
                    System.out.println("\n=============================================\n");
                    break;

                case 0:
                    System.out.println("Выход.");
                    System.out.println("\n=============================================\n");
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
                    System.out.println("\n=============================================\n");
                    break;
            }
        } while (selNum != 0);
    }
}
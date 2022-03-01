package Source;

import webservice.ServerService;

import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            webservice.Server server
                    = new ServerService(new URL("http://localhost:8080/CarRental?wsdl")).getServerPort();

            Scanner scanner = new Scanner(System.in);

            boolean flag = true;
            System.out.println("Введите имя пользователя");
            String statuss = scanner.nextLine();
            int status = server.getStatus(statuss);
            System.out.println(server.sayHello(statuss));
            while (flag) {
                if (status == 1) {
                    System.out.println("\nМЕНЮ\n" +
                            "1. Cписок всех имеющихся в прокате автомобилей\n" +
                            "2. Получить все имеющиеся автомобили соответствующей модели\n" +
                            "3. Добавить новый прокатный автомобиль\n" +
                            "4. Изменить характеристики автомобиля\n" +
                            "0. Выход");
                    int mode = scanner.nextInt();
                    scanner.nextLine();
                    switch (mode) {
                        case 1:
                            List<webservice.Auto> autos = server.getList();
                            for (int i = 0; i != autos.size(); i++) {
                                System.out.println(autos.get(i).getId() + " " + autos.get(i).getModel() +
                                        " Пробег:" + autos.get(i).getMileage() + " Состояние:" +
                                        autos.get(i).getCondition() +
                                        " Стоимость аренды на 1 день:" + autos.get(i).getPrice());
                            }
                            break;
                        case 2:
                            System.out.println("Введите модель:");
                            String model1 = scanner.nextLine();
                            List<webservice.Auto> autos1 = server.getListFromModel(model1);
                            for (int i = 0; i != autos1.size(); i++) {
                                System.out.println(autos1.get(i).getId() + " " + autos1.get(i).getModel() +
                                        " Пробег:" + autos1.get(i).getMileage() + " Состояние:" +
                                        autos1.get(i).getCondition() +
                                        " Стоимость аренды на 1 день:" + autos1.get(i).getPrice());
                            }
                            break;
                        case 3:
                            System.out.println("Введите модель:");
                            String model = scanner.nextLine();
                            System.out.println("Введите пробег:");
                            String mileageS = scanner.nextLine();
                            long mileage = Long.parseLong(mileageS);
                            System.out.println("Введите состояние автомобиля:");
                            String condition = scanner.nextLine();
                            System.out.println("Введите стоимость:");
                            String priceS = scanner.nextLine();
                            double price = Double.parseDouble(priceS);
                            int id = server.addAuto(model, mileage, condition, price);
                            System.out.println("Идентификатор добавленного автомобиля: " + id);
                            break;
                        case 4:
                            System.out.println("Введите идентификатор автомобиля:");
                            String id1s = scanner.nextLine();
                            int id1 = Integer.parseInt(id1s);
                            System.out.println("Введите пробег:");
                            String mileageS1 = scanner.nextLine();
                            long mileage1 = Long.parseLong(mileageS1);
                            System.out.println("Введите состояние автомобиля:");
                            String condition1 = scanner.nextLine();
                            server.changeParameters(id1, mileage1, condition1);
                            System.out.println("Параметры автомобиля успешно изменены");
                            break;
                        case 0:
                            return;
                    }
                } else {
                    System.out.println("\nМЕНЮ\n" +
                            "1. Cписок всех имеющихся в прокате автомобилей\n" +
                            "2. Получить все имеющиеся автомобили соответствующей модели\n" +
                            "3. Заказать автомобиль\n" +
                            "4. Вернуть автомобиль\n" +
                            "0. Выход");
                    int mode = scanner.nextInt();
                    scanner.nextLine();
                    switch (mode) {
                        case 1:
                            List<webservice.Auto> autos = server.getList();
                            for (int i = 0; i != autos.size(); i++) {
                                System.out.println(autos.get(i).getId() + " " + autos.get(i).getModel() +
                                        " Пробег:" + autos.get(i).getMileage() + " Состояние:" +
                                        autos.get(i).getCondition() +
                                        " Стоимость аренды на 1 день:" + autos.get(i).getPrice());
                            }
                            break;
                        case 2:
                            System.out.println("Введите модель:");
                            String model1 = scanner.nextLine();
                            List<webservice.Auto> autos1 = server.getListFromModel(model1);
                            for (int i = 0; i != autos1.size(); i++) {
                                System.out.println(autos1.get(i).getId() + " " + autos1.get(i).getModel() +
                                        " Пробег:" + autos1.get(i).getMileage() + " Состояние:" +
                                        autos1.get(i).getCondition() +
                                        " Стоимость аренды на 1 день:" + autos1.get(i).getPrice());
                            }
                            break;
                        case 3:
                            System.out.println("Введите идентификатор автомобиля:");
                            String ids = scanner.nextLine();
                            int id = Integer.parseInt(ids);
                            System.out.println("Введите количество дней:");
                            String daysS = scanner.nextLine();
                            int days = Integer.parseInt(daysS);
                            double price = server.orderAuto(id, days);
                            System.out.println("Стоимость аренды: " + price);
                            break;
                        case 4:
                            System.out.println("Введите идентификатор автомобиля:");
                            String id1s = scanner.nextLine();
                            int id1 = Integer.parseInt(id1s);
                            server.autoReturn(id1);
                            System.out.println("Возврат произведен");
                            break;
                        case 0:
                            return;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

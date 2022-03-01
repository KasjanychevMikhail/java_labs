package Source;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;

@WebService
public class Server {

    ArrayList<Auto> autos = new ArrayList<>();

    @WebMethod
    public ArrayList<Auto> getList() {
        ArrayList<Auto> res = new ArrayList<>();
        for (int i = 0; i != autos.size(); i++) {
            if (autos.get(i).free) {
                res.add(autos.get(i));
            }
        }

        return res;
    }

    @WebMethod
    public ArrayList<Auto> getListFromModel(String _model) {
        ArrayList<Auto> res = new ArrayList<>();
        for (int i = 0; i != autos.size(); i++) {
            if (_model.equals(autos.get(i).model) && autos.get(i).free) {
                res.add(autos.get(i));
            }
        }
        return res;
    }

    @WebMethod
    public int addAuto(String _model, long _mileage, String _condition, double _price) throws Exception {
        int id;
        if (autos.size() == 0) {
            id = 0;
        } else {
            id = autos.get(autos.size() - 1).id + 1;
        }
        Auto autoNew = new Auto();
        autoNew.id = id;
        autoNew.model = _model;
        autoNew.mileage = _mileage;
        autoNew.condition = _condition;
        autoNew.price = _price;
        autoNew.free = true;
        autos.add(autoNew);
        return id;
    }

    @WebMethod
    public void changeParameters(int _id, long _mileage, String _condition) throws Exception {
        int flag = 0;
        for (int i = 0; i != autos.size(); i++) {
            if (autos.get(i).id == _id) {
                flag++;
                Auto autoNew = new Auto();
                autoNew.id = _id;
                autoNew.mileage = _mileage;
                autoNew.condition = _condition;
                autoNew.model = autos.get(i).model;
                autoNew.price = autos.get(i).price;
                autoNew.free = autos.get(i).free;
                autos.set(i, autoNew);
                break;
            }
        }
        if (flag == 0) throw new Exception("Невозможно найти автомобиль с указанным индексом");
    }

    @WebMethod
    public double orderAuto(int _id, int days) throws Exception {
        int flag = 0;
        double res = 0.0;
        for (int i = 0; i != autos.size(); i++) {
            if (autos.get(i).id == _id && autos.get(i).free) {
                flag++;
                res = autos.get(i).price * days;
                Auto autoNew = autos.get(i);
                autoNew.free = false;
                autos.set(i, autoNew);
            }
        }
        if (flag == 0) throw new Exception("Невозможно найти автомобиль с указанным индексом");
        return res;
    }

    @WebMethod
    public void autoReturn(int _id) throws Exception {
        int flag = 0;
        for (int i = 0; i != autos.size(); i++) {
            if (autos.get(i).id == _id && !autos.get(i).free) {
                flag++;
                Auto autoNew = autos.get(i);
                autoNew.free = true;
                autos.set(i, autoNew);
            }
        }
        if (flag == 0) throw new Exception("Невозможно найти автомобиль с указанным индексом");
    }

    @WebMethod
    public int getStatus(String input) {
        if (input.equals("admin")) {
            return 1;
        }
        return 0;
    }

    @WebMethod
    public String sayHello(String user) {
        return  "Hello, " + user;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/CarRental", new Server());
        System.out.println("Server ready");
    }
}

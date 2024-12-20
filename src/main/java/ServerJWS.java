import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());//Démarre le serveur http et utilisé pour consuter le web service qui est BanqueService
        System.out.println("Web Service déployé sur http://0.0.0.0:9191/");
    }

}

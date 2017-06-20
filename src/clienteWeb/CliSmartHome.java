/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteWeb;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import modelo.Agenda;

/**
 * Jersey REST client generated for REST resource:Agenda [produto]<br>
 * USAGE:
 * <pre>
 *        CliSmartHome client = new CliSmartHome();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author oliveira
 */
public class CliSmartHome {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8084/SmartHome/";

    public CliSmartHome() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("produto");
    }

    public static Agenda getUmAgenda(String id) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8084/SmartHome");
        Agenda agenda = target.path("/produto/" + id).request().get(Agenda.class);

        return agenda;
    }

    public static List<modelo.Agenda> getListaDeCliente() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8084/SmartHome");
        Response response = target.path("/produto").request().get(Response.class);
        List<modelo.Agenda> lista = response.readEntity(new GenericType<List<modelo.Agenda>>() {
        });
        return lista;
    }

    public static void postAgenda(Agenda cli) {
        System.out.println("Post");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8084/SmartHome");
        Entity<Agenda> entity = Entity.entity(cli, MediaType.APPLICATION_JSON);
        Response response = target.path("/produto").request().post(entity);
        System.out.println(response.readEntity(String.class));
    }

    public static void putAgenda(Agenda cli) {
        System.out.println("Put");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8084/SmartHome");
        Entity<Agenda> entity = Entity.entity(cli, MediaType.APPLICATION_JSON);
        Response response = target.path("/produto").request().put(entity);
        System.out.println(response.readEntity(String.class));
    }

    public static void deleteAgenda(int id) {
        System.out.println("Delete");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8084/SmartHome");
        Response response = target.path("/produto/" + id).request().delete();
        System.out.println(response.readEntity(String.class));
    }

    public void close() {
        client.close();
    }

}

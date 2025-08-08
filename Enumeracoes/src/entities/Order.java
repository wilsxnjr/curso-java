package entities;

import entities.enums.Client;
import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ");
        sb.append(sdf.format(moment));
        sb.append("\n");
        sb.append("Order status: ");
        sb.append(status);
        sb.append("\n");
        sb.append(client.toString());
        sb.append("\n");
        sb.append("Order items:");
        sb.append("\n");
        for (OrderItem item : items) {
            sb.append(item);
            sb.append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }

}

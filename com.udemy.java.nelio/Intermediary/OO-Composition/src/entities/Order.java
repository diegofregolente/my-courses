package entities;

import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order extends OrderItem {
    private LocalDate moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<OrderItem>();

    public Order() {}

    public Order(LocalDate moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
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
    public DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(dtf.format(moment) + "\n");
        sb.append("Order Status: ");
        sb.append(status + "\n");
        sb.append("Client: " + "\n");
        sb.append(client + "\n");
        sb.append("Order items: \n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return  sb.toString();
    }
}

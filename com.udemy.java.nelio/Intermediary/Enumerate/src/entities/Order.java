package entities;

import entities.enums.OrderStatus;

import java.time.LocalDate;

public class Order {

    private Integer id;
    private LocalDate moment;
    private OrderStatus status;

    public Order() {}

    public Order(Integer id, LocalDate moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getMoment () {
        return moment;
    }

    public void setMoment (LocalDate moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus () {
        return status;
    }

    public void setStatus (OrderStatus status) {
        this.status = status;
    }

    public String toString () {
        return "ID:" + id + " " +
                "HORA: " + moment + " " +
                "STATUS: " + status + " ";
    }
}


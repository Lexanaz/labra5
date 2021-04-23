package net.codejava.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Morder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmorder;
    private String pizzaname;

    protected Morder() {
    }

    protected Morder(String pizzaname) {
        this.pizzaname = pizzaname;

    }

    public Morder(int idmorder, String pizzaname) {
    }

    public Long getIdmorder() {
        return idmorder;
    }

    public void setIdmorder(Long idmorder) {
        this.idmorder = idmorder;
    }

    public String getPizzaname() {
        return pizzaname;
    }

    public void setPizzaname(String pizzaname) {
        this.pizzaname = pizzaname;
    }

}

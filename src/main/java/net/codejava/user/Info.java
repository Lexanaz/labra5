package net.codejava.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idinfo;
    private String fio;
    private String number;
    private String address;


    protected Info() {
    }

    protected Info(String fio, String number, String address) {
        this.fio = fio;
        this.number = number;
        this.address = address;

    }

    public Info(int idinfo, String fio, String number, String address) {
    }

    public Long getIdinfo() {
        return idinfo;
    }

    public void setIdinfo(Long idinfo) {
        this.idinfo = idinfo;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

package Hotel;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;
import java.util.ArrayList;

public class Hotel {
    private String name;
    private String location;
    private String ownerName;

    public Hotel() {
    }

    public Hotel(String name, String location, String ownerName) {
        this.setName(name);
        this.setLocation(location);
        this.setOwnerName(ownerName);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void KetQua() {
        System.out.println("Hotel:" + this.getName() + "\n Address: " + this.getLocation() + "\n Owner: " + this.getOwnerName());
    }

}

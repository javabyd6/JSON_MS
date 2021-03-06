package com.sda.json;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

/**
 * @author marek swietlik
 */
public class Student {
    String name;
    String lastName;
    Address address;

    public Student(String name, String lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

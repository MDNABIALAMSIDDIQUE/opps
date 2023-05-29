package com.rest.modal;

public class Book {
    public Book() {
    }
    private int id;
    private String name;
    private String abook;
    private float amount;


    
    public Book(int id, String name, String abook, float amount) {
        this.id = id;
        this.name = name;
        this.abook = abook;
        this.amount = amount;
    }

    


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAbook() {
        return abook;
    }
    public void setAbook(String abook) {
        this.abook = abook;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }




    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", abook=" + abook + ", amount=" + amount + "]";
    }

        


}

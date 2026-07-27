package br.com.masiesque.Ystreams.Domain;

public class LightNovel {

    private String title;
    private double price;


    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{Title: "+title+" -Price: "+price+"}\n";
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

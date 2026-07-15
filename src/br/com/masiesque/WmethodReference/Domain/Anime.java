package br.com.masiesque.WmethodReference.Domain;

public class Anime {
    private String name;
    private Integer ep;

    public Anime(String name, Integer ep) {
        this.name = name;
        this.ep = ep;
    }

    @Override
    public String toString() {
        return "{name: "+this.name+" episódios: "+this.ep+"}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEp() {
        return ep;
    }

    public void setEp(Integer ep) {
        this.ep = ep;
    }
}

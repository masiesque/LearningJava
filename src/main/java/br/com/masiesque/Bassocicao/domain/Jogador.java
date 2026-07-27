package br.com.masiesque.Bassocicao.domain;

public class Jogador {
    private String name;
    private  Time time;

    public void printPlayer()
    {
        System.out.println(name);
        if(time!=null)
        System.out.println(time.getName());
    }

    public Jogador(String name) {
        this.name = name;
    }

    public void setName(Time time) {
        this.time  = time;
    }

    public String getName() {
        return name;
    }
    public void setTime(Time time)
    {
        this.time = time;
    }
    public Time getTime()
    {
        return time;
    }

}

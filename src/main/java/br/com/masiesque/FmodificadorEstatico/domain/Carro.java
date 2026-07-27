package br.com.masiesque.FmodificadorEstatico.domain;

public class Carro {
private String name;
private double volMax;
private static  double volLim=250;

//construtor:

public Carro(String name, double max)
{
    this.name = name;
    volMax = max;
}

//-metodos especificos:-
    public void printAll()
    {
        System.out.println("\n------------------\n");
        System.out.println("Nome:"+ name);
        System.out.println("velocidade Maxima:"+ volMax);
        System.out.println("velocidade limite:"+ volLim);
    }

  //-setters e getters:-
  public String getName() {
      return name;
  }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolMax() {
        return volMax;
    }

    public void setVolMax(double volMax) {
        this.volMax = volMax;
    }

    //setter e getters (statics)

    public static void setVolLim(double volLim)
    {
        Carro.volLim = volLim;

    }

    public static double getVolLim()
    {
        return volLim;
    }



}

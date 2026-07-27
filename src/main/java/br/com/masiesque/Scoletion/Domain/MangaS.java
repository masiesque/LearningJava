package br.com.masiesque.Scoletion.Domain;

import java.util.Objects;

public class MangaS implements Comparable<MangaS>{


    private Long id;
    private String name;
    private double price;
    private int quant;

    public MangaS(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public MangaS(Long id, String name, double price, int quant) {
       this(id,name,price);
        this.quant = quant;
    }

    @Override
    public int compareTo(MangaS mangaEx) {
        //------REGRA PARA O RETURN DO compareTo--------
        //negativo(-1) se o this < mangaEX;
        // se this == mangaEx, return 0;
        //se o this> mangaEx, return positivo(1)
        //------REGRA PARA O RETURN DO compareTo--------


//       if(this.id<mangaEx.getId())
//       {
//           return -1;
//       }else if(this.id > mangaEx.getId())
//       {
//           return 1;
//       }else
//           return 0;
        //---------------------------------------------
  //  return this.id.compareTo(mangaEx.getId());//podemos reduzir toda a logica acima pq o id ele é
        // um wrapper(objeto) do tipo Long, e ele implementa o comparable
        //---------------------------------------------
        //se quisermos ordenar pelo preço(double) precisaremos realizar um casting de double para o wrapper Double e pegar o metodo compareTo;
        //assim:
        //return Double.valueOf(price).compareTo(mangaEx.getPrice());
        //---------------------------------------------
        //para String agora
        return this.name.compareTo(mangaEx.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MangaS mangaS = (MangaS) o;
        return Double.compare(price, mangaS.price) == 0 && Objects.equals(id, mangaS.id) && Objects.equals(name, mangaS.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Manga {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quant=" + quant +
                '}'+"\n";
    }

    //getter e setters:
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
}

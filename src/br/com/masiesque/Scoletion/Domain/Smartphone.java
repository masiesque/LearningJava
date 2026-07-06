package br.com.masiesque.Scoletion.Domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == null) return true;
        if(this.getClass() != obj.getClass()) return false;
        //fazemos um cast aq,só para garantirmos a maxima segurança do codigo;
        Smartphone obj1 = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(obj1.serialNumber);

    }

//REGRAS PARA REESCRITA DO HASHCODE:
    // se x.equals(y) == true, então y.hashCode(x) == x.hashCode(y)
    //y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
    //x.equals(y)==false
    //y.hashCode()!= x.hashCode() x.equals(y) deverá ser false.
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

package br.com.masiesque.Hheranca.dominio;

public class Pessoa{

    protected String name;
    protected Address address;
    protected String cpf;

//metodos específicos:

    public void printPerson()
    {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.address.getStreet()+""+this.address.getNumberOfBuilding());
    }

//metodos específicos:

    //construtor
    public Pessoa(String name){
        this.name=name;
    }

    public Pessoa(String name, String cpf){
        this(name);
        this.cpf = cpf;
    }
    //construtor

//getters e setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    //getters e setter


}
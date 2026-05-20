package br.com.masiesque.Hheranca.dominio;

public class Employee  extends Pessoa{

    private double earn;

    public  Employee(String name){
        super(name);
    }


    //métodos específicos:

    public void printPerson(){//aqui estou fazendo uma sobre escrita(overreacting) de uma função já existente na classe mãe
        super.printPerson();//aqui estou chamando por meio do metodo super, todos os processos que já tinham na classe mae
        System.out.println(this.earn);//incrementando para printar tbm o salario;

    }

    //métodos específicos:

    public double getEarn() {
        return earn;
    }

    public void setEarn(double earn) {
        this.earn = earn;
    }

}

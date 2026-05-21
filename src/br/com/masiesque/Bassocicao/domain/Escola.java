package br.com.masiesque.Bassocicao.domain;

public class Escola {

    private String name;
    private Teacher[] teachers;//array de classes;

    //metodos especificos:
    public void printAll()
    {
        System.out.println("Escola: "+ this.name);
        System.out.println();
        if(teachers == null)return;
        System.out.println("Lista de professores, abaixo:");
        for(Teacher teacher : teachers)
            System.out.println(teacher.getName());

    }
    //construtores:

    public Escola(String name)
    {
        this.name = name;
    }
    public Escola(String name,Teacher[]array)
    {
        this.name = name;
        teachers = array;
    }

    //getters e setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}

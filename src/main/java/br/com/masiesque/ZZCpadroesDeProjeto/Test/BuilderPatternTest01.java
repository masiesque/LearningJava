package br.com.masiesque.ZZCpadroesDeProjeto.Test;

import br.com.masiesque.ZZCpadroesDeProjeto.Domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
       Person sith =  Person.PersonBuilder
               .builder()
                .firstName("Anakin")
                .lastName("Skywalker")
                .email("mayTheForceWithYou@jedi.com")
                .userName("DarthzinVarder").build();
        System.out.println(sith);
    }
}

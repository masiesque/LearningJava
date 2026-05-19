package br.com.masiesque.Gassocicao.teste;

import br.com.masiesque.Gassocicao.domain.Escola;
import br.com.masiesque.Gassocicao.domain.Teacher;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Julio");
        Teacher teacher1 = new Teacher("Thomas");
        Teacher[] teachers = {teacher, teacher1};
        Escola escola = new Escola("Maria Neiva",teachers);
        escola.printAll();
    }
}

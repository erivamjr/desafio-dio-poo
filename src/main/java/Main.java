import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

                Curso curso1 = new Curso();
                curso1.setTitulo("Curso Java");
                curso1.setDescricao("Descricao curso java");
                curso1.setCargaHoraria(8);

                Curso curso2 = new Curso();
                curso2.setTitulo("Curso Js");
                curso2.setDescricao("Descricao curso javascript");
                curso2.setCargaHoraria(4);

                Mentoria mentoria = new Mentoria();
                mentoria.setTitulo("Mentoria de java");
                mentoria.setDescricao("descrição mentoria java");
                mentoria.setData(LocalDate.now());


        System.out.println(curso2);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}

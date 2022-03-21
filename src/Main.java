import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(){{
            setDescricao("Curso Java");
            setTitulo("Descrição do curso java");
            setCargaHoraria(8);
        }};

        Curso curso2 = new Curso(){{
            setDescricao("Curso Java");
            setTitulo("Descrição do curso java");
            setCargaHoraria(8);
        }};

        Mentoria mentoria = new Mentoria(){{
            setDescricao("Mentoria Java");
            setTitulo("Descrição da Mentoria java");
            setData(LocalDate.now());
        }};

      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Maria" + devMaria.getConteudosIncritos());
        System.out.println("--");
        devMaria.progredir();
        System.out.println("Conteúdos inscritos de Maria" + devMaria.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos de Maria" + devMaria.getConteudosConluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

        System.out.println("---------------");
        Dev devJoao = new Dev();
        devJoao.setNome("Maria");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Maria" + devJoao.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos de Maria" + devJoao.getConteudosConluidos());
        System.out.println("XP" + devJoao.calcularTotalXp());
    }
}

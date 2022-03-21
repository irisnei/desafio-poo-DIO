import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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
            setCargaHoraria(8);
        }};

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}

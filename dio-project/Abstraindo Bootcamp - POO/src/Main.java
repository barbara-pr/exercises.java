import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // classe = planta de uma casa
        // objeto = é a casa construída

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(4);

        // POLIMORFISMO: Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria");
        mentoria1.setData(LocalDate.now()); // na hora que criar (rodar) o objeto vai atribuir a data de criação (atual)

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devHelena = new Dev();
        devHelena.setNome("Helena");
        devHelena.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Helena:" + devHelena.getConteudosInscritos());
        devHelena.progredir();
        System.out.println("Conteúdos Inscritos Helena:" + devHelena.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Helena:" + devHelena.getConteudosConcluidos());

        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Henrique:" + devHenrique.getConteudosInscritos());
        devHenrique.progredir();
        System.out.println("Conteúdos Inscritos Henrique:" + devHenrique.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Henrique:" + devHenrique.getConteudosConcluidos());
    }
}

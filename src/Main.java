import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso mais didático e completo de Java, JavaFX, Spring Boot e muito mais");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Javascript");
        curso1.setDescricao("Cursos da Escola, onde você vai aprender Javascript ES6 até o TypeScript");
        curso1.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Spring Boot na Prática");
        mentoria.setDescricao("Criando sua primeira API com Spring");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("NodeJS na Prática");
        mentoria1.setDescricao("Criando sua primeira API com NodeJS");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprende Java de forma prática e rápida e se torne um desenvolvedor");
        bootcamp.getConteudos().add(curso);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Javascript Fullstack");
        bootcamp1.setDescricao("Seja um fullstack especializado em NodeJS");
        bootcamp1.getConteudos().add(curso1);

        Dev devInscrito = new Dev();
        System.out.println("Qual seu nome?");
        String name = (sc.nextLine());
        devInscrito.setNome(name);
        System.out.println("Bem vindo " + devInscrito.getNome());

        System.out.println("Escolha se Bootcamp, digite 1 ou 2:\n 1 - Bootcamp Java Developer\n 2 - Bootcamp Javascript Fullstack");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                devInscrito.inscreverBootcamp(bootcamp);
                System.out.println("Você foi inscrito no: \n" + bootcamp);
                break;
            case 2:
                devInscrito.inscreverBootcamp(bootcamp1);
                System.out.println(bootcamp1);
                break;
            default:
                System.out.println("Escolha inválida");
        }



        System.out.println("Obrigado por se inscrever conosco!");
    }
}
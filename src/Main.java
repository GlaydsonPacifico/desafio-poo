import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
        System.out.println(mentoria1);
    }
}
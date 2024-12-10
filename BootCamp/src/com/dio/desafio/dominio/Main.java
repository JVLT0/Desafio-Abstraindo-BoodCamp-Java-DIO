package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Titulo curso1");
        curso1.setDescricao("Descricao curso1");
        curso1.setCargaHoraria(8);
        curso2.setTitulo("Titulo curso2");
        curso2.setDescricao("Descricao curso2");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Titulo mentoria1");
        mentoria.setDescricao("Descricao mentoria1");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Aprendendo Java do basico");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        dev1.setNome("Joao");
        dev2.setNome("Gustavo");

        System.out.println("Conteudos Inscritos Joao: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: " + dev1.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Gustavo: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Gustavo: " + dev2.getConteudosConcluidos());

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev2.progredir();

        System.out.println("Conteudos Inscritos Joao: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: " + dev1.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Gustavo: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Gustavo: " + dev2.getConteudosConcluidos());

    }
}

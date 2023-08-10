package br.senai.sp.Escola;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        /** Declara variaveis */
        String nomeAluno;
        String disciplina;
        String professor;
        int frequencia;
        int nota1;
        int nota2;
        float mediaAluno;
        String situacaoAluno;
        boolean continuar = true;

        /** instanciar o teclado */
        Scanner teclado = new Scanner(System.in);

        while (continuar) {

            /** coleta dados */

            System.out.println("-----------------");
            System.out.println(" olá prof, qual o seu nome ");
            professor = teclado.nextLine();
            System.out.println(" informe o nome do seu aluno: ");
            nomeAluno = teclado.nextLine();
            System.out.println(" informe a sua discplina: ");
            disciplina = teclado.nextLine();
            System.out.println("informe a frequencia do aluno: ");
            frequencia = teclado.nextInt();
            System.out.println("informe a nota 1: ");
            nota1 = teclado.nextInt();
            System.out.println("informe a nota 2: ");
            nota2 = teclado.nextInt();
            System.out.println("---------------");

            /** Avaliaçao do aluno */

            boolean validacao = ("vitor".equalsIgnoreCase(professor));


            mediaAluno = (nota1 + nota2) / 2;

            System.out.println(mediaAluno);

            if (mediaAluno >= 7 && frequencia >= 75 && !validacao || mediaAluno >= 6 && frequencia >= 90 && !validacao) {

                situacaoAluno = "Aprovado";

            } else {
                situacaoAluno = "Reprovado";

            }

            System.out.println("ola prof" + professor);
            System.out.println("ola aluno" + nomeAluno);
            System.out.println(" sua disciplina " + disciplina);
            System.out.println("A franquencia do seu aluno é" + frequencia);
            System.out.println(" A nota do aluno é:" + nota1);
            System.out.println("A nota do aluno é:" + nota2);
            System.out.println("A media do aluno é:" + mediaAluno);
            System.out.println("A situaçao do Aluno é: " + situacaoAluno);

            System.out.println("Deseja cadastrar outro auno?");
            String resprof = teclado.next();

            if (resprof.equalsIgnoreCase("nao")) {
                continuar = false;
            }
        }



        System.out.println("cadastro finalizado com sucesso !");
    }
}

package JAVA;

import java.util.Scanner;

public class PerguntasRespostas {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo de perguntas e respostas!");
        System.out.println("Aqui te daremos algumas perguntas e você deverá responde-las corretamente.");
        System.out.println("Para cada acerto você receberá um ponto");
        System.out.println("E para cada 2 erros você perderá um ponto");
        System.out.println("Vamos começar!");
        int c = 0;
        int pontos = 0;
        

        
        System.out.println("Primeira pergunta - Qual é a capital do Brasil");
        String resposta = input.nextLine();
        boolean cr = resposta.toLowerCase().equals("brasilia");
        if (cr = true){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era Brasília");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }






        System.out.println("Segunda pergunta - Qual é a capital da Papua Nova Guiné");
        cr = resposta.toLowerCase().equals("port moresby");
        if (cr = true){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era Port Moresby");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }
        
        System.out.println("Terceira pergunta - Qual a capital da Coreia do Sul");
        cr = resposta.toLowerCase().equals("seul");
        if (cr = true){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era Seul");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }
        
        
        

        System.out.println("Quarta pergunta - Quanto que é 2+7x9+3³");
        cr = resposta.toLowerCase().equals("92");
        if (cr = true){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era 92");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }
           
        
        
        
        
        System.out.println("Quinta pergunta - Quem é o atual(2024) presidente dos EUA ");
        cr = resposta.toLowerCase().equals("joe biden");
        if (cr = true){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era Joe Biden");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }
           
        
        
        
        
        System.out.println("Sexta pergunta - Eu pertenço ao mês de dezembro, e não a qualquer outro mês. Eu não sou um feriado. O que eu sou?");
        cr = resposta.toLowerCase().equals("a letra d");
        if (cr = true){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era a letra D");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }
           
        
        
        
        
        System.out.println("Setima pergunta - O que é o que é? De dia anda em 4 patas, de tarde em duas e de noite anda em 3?");
        cr = resposta.toLowerCase().equals("o humano");
        if (cr = true){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era a O humano");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }
           
        
        
        
        
        System.out.println("Oitava pergunta - Resolva na cifra de cesar(+2), a palavra é cvwo");
        cr = resposta.toLowerCase().equals("atum");
        if (cr = true){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era a Atum");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }
           
        
        
        
        
        System.out.println("Nona pergunta - Quantas cores tem o arco-iris?");
        cr = resposta.toLowerCase().equals("7");
        if (cr = true){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era a letra D");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }
           
        
        
        
        
        System.out.println("Decima pergunta - Quais são as 4 primeiras casas decimais de PI");
        cr = resposta.toLowerCase().equals("1415");
        if (cr = true){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era a letra D");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }
        System.out.println("Você fez" + pontos + "pontos");
        System.out.println();
    }
}

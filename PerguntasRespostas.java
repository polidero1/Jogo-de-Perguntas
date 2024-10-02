package JAVA;
import java.util.Scanner;

public class PerguntasRespostas {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo de perguntas e respostas!");
        System.out.println("Aqui te daremos algumas perguntas e você deverá responde-las corretamente.");
        System.out.println("Para cada acerto você receberá um ponto");
        System.out.println("E para cada 2 erros você perderá um ponto");
        System.out.println("Escolha a dificuldade - Facil(1), Medio(2) ou Dificil(3)");
        System.out.println("Vamos começar!");
        int c = 0;
        int pontos = 0;
        int dificuldade = input.nextInt();

        
       if (dificuldade==1){
        System.out.println("Você escolheu a dificuldade Fácil");
        System.out.println("Vamos começar!");
        System.out.println("Primeira pergunta - Qual é a capital do Brasil");
        String resposta = input.nextLine();
        if (resposta.toLowerCase() == "brasilia"){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era Brasília");
            c++;
        }

        System.out.println("Primeira pergunta - Qual é a capital da Papua Nova Guiné");
        String resposta = input.nextLine();
        if (resposta.toLowerCase() == "port moresby"){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era Port Moresby");
            c++;
        }
       }

        
        System.out.println("Primeira pergunta - Qual é a capital da Papua Nova Guiné");
        String resposta = input.nextLine();
        if (resposta.toLowerCase() == "port moresby"){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era Port Moresby");
            c++;
        }
        
        
        
        

        System.out.println("Segunda pergunta - Quanto que é 2+7x9+3³");
        resposta = input.nextLine();
        if (resposta.toLowerCase() == "92"){
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
           
        
        
        
        
        System.out.println("Terceira pergunta - Qual a capital da China");
        resposta = input.nextLine();
        if (resposta.toLowerCase() == "pequim"){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era Pequim");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }
           
        
        
        
        
        System.out.println("Quarta pergunta - Eu pertenço ao mês de dezembro, e não a qualquer outro mês. Eu não sou um feriado. O que eu sou?");
        resposta = input.nextLine();
        if (resposta.toLowerCase() == "a letra d"){
            System.out.println("Parabens, você acertou");
            pontos++;       
        }else{
            System.out.println("Que pena, você errou");
            System.out.println("A resposta era A letra");
            c++;
        }
        if(c>=2){
            pontos--;
            c=c-2;
        }

            }
}

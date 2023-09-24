package funcionalinterface.exemplos;

/*A interface funcional Predicate em Java é usada para representar uma condição ou teste que é aplicado a um valor, retornando verdadeiro (true) ou falso (false).
Em resumo: O que faz: O Predicate avalia uma condição ou teste em um valor e retorna verdadeiro se a condição for satisfeita ou falso caso contrário.
Assinatura: A interface funcional Predicate possui um método chamado test(), que aceita um argumento do tipo especificado e retorna um valor booleano
(true ou false) com base na avaliação da condição.
Exemplo: Um exemplo comum de uso do Predicate é filtrar elementos em uma coleção com base em uma condição específica, como encontrar todos os números pares em uma lista.*/


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

//Exemplo de código:  Classe que verifica se um determinada palavra tem mais de cinco caracteres com o uso do Predicate
public class PredicateExemple {
    public static void main(String[] args) {

        //Criamos uma lista de palavras
        List<String> palavras = Arrays.asList("Java","Kotlin", "Python", "Javascript", "C", "Go", "Ruby");

        //Criamos um predicate que irá verificar se a palavra tem mais de 05 caracteres
        Predicate<String> contemMaisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        //exibir no console cada palavra que passou no filtro
        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println); // References Method(System.out::println)
    }
}

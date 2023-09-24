package funcionalinterface.exemplos;
/*A interface funcional BinaryOperator em Java é usada para representar uma operação que aceita dois operandos do mesmo tipo e retorna um resultado do mesmo tipo.
Em resumo:O que faz: O BinaryOperator realiza uma operação em dois valores do mesmo tipo e retorna um valor do mesmo tipo.
Assinatura: A interface funcional BinaryOperator possui um método chamado apply(), que aceita dois argumentos do mesmo tipo e retorna um valor do mesmo tipo.
Exemplo: Um exemplo comum de uso do BinaryOperator é em operações matemáticas, como adição, subtração, multiplicação ou qualquer outra operação que envolva dois operandos do mesmo tipo.*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

//Exemplo de código (adição usando BinaryOperator):
public class BinaryOperatorExemple {
    public static void main(String[] args) {

        //Criamos uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usamos o BinaryOperator com expressão lambda para somar dois números inteiros
        //BinaryOperator<Integer> somaNumeros = (n1,n2) -> n1 + n2;
        BinaryOperator<Integer> somaNumeros = Integer::sum;

        //Usamos o BinaryOperator para somar todos os números no Stream
        //int resultadoSoma = numeros.stream()
        //        .reduce(0,somaNumeros);

        int resultadoSoma = numeros.stream()
                .reduce(0, Integer::sum);

        //Exibindo o resultado da soma
        System.out.println("A soma dos numeros: " + numeros + " é igual a " + resultadoSoma);
    }
}

package funcionalinterface.exemplos;

/*A interface funcional Function em Java é usada para representar uma operação que aceita um argumento e produz um resultado.
Em resumo: O que faz: A Function recebe um valor de entrada, realiza uma operação nele e retorna um valor de saída.
Assinatura: A interface funcional Function possui um método chamado apply(), que aceita um argumento do tipo especificado e retorna um resultado do tipo especificado.
Exemplo: Um exemplo comum de uso da Function é para mapear ou transformar valores de uma coleção em outros valores, como converter uma lista de números inteiros em uma lista de números dobrados.*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Exemplo de código:
public class FunctionExemple {
    public static void main(String[] args) {

        //criamos uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar a Function com a expressão lambda para dobrar todos os números acima
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        //Exibindo a lista de numeros dobrados
        numerosDobrados.forEach(System.out::println);
    }
}

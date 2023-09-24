package funcionalinterface.exemplos;

/*A interface funcional Consumer em Java é usada para representar uma operação que aceita um argumento, realiza algum processamento nele e não retorna nenhum resultado.
Em resumo:O que faz: O Consumer "consome" (recebe) um valor, faz algo com ele e não produz um resultado de saída.
Assinatura: A interface funcional Consumer possui um único método chamado accept(), que aceita um argumento do tipo especificado e executa uma ação nele.
Exemplo: Um exemplo comum de uso do Consumer é para imprimir ou processar elementos em uma coleção.*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Exemplo de código:
public class ConsumerExemple {
    public static void main(String[] args) {

        //criamos uma lista de número inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(numeros);

        //Usaremos o consumer com uma expressão lambda para exibir os número pares da lista de números
        Consumer<Integer> numerosPares = numero -> {
            if(numero %2 == 0){
                //System.out.println(numero + "é um dos números pares da lista " + numeros);
                System.out.println(numero);
            }
        };

        /*Você precisa usar o método forEach na lista de números e aplicar o Consumer numerosPares a cada elemento da lista
        para que os números pares sejam exibidos no console*/
        System.out.println("Usando o forEach para aplicar o Consumer numerosPares em cada elemento da lista de números");
        numeros.forEach(numerosPares);

        // Usar o Consumer para imprimir números pares no Stream
        System.out.println("Usando o Consumer para imprimir números pares no Stream");
        numeros.stream()
                .filter(n -> n % 2 ==0)
                .forEach(System.out::println);
    }
}

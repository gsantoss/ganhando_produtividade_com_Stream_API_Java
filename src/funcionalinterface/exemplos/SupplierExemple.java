package funcionalinterface.exemplos;

/*A interface funcional Supplier em Java é usada para representar uma operação que fornece (ou "supre") um valor sem receber nenhum argumento.
Em resumo: O que faz: O Supplier fornece um valor, mas não aceita nenhum argumento.
Assinatura: A interface funcional Supplier possui um único método chamado get(), que não tem argumentos e retorna um valor.
Exemplo: Um exemplo comum de uso do Supplier é para gerar valores ou fornecer dados de alguma fonte, como uma função que gera um número aleatório.*/

//Exemplo de código:
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemple {
    public static void main(String[] args) {

        //Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        //Perceba que ele não recebe nenhum argumento "()".
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        //usar o Supplier para obter uma lista om 05 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        //exibindo as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}

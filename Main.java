import java.util.ArrayList;

/*
Autor: Cauet Corrêa de Menezes
Data: 16/10/2024
É obrigatório declarar uma classe dentro de cada pasta Java
O nome da classe deve ser igual ao do arquivo e ter o public
Tipos primitios do Java:
Inteiros: byte -> 8 bits -> -128 a 127, Short -> 16 bits -> -32.768 a 32.757, int -> 32 bits -> -2.147.483.648 a 2.147.483.647, long -> 64 bits
Decimal: float -> 32 bits -> precisão simples, double -> 64 bits -> precisão dupla
String: representar palaras e frases
char: representar um único caracter
boolean tru or false
 */
public class Main {
   public static void main(String[] args){

       // ****************************** Tipos primitivos ******************************

       int minhaIdade = 20;
       String meuNome = "Cauet";
       var nomeVariavel = "UNESP"; // Com o tipo var o Java consegue inferir qual o tipo que a minha variável irá armazenar
       byte b = 100;
       short s = 10000;
       int i = 100000;
       long l = 10000000000L;
       float f = 10.5f;
       double d = 10.5;
       char c = 'A';
       String str = "Cauet";
       boolean bool = false;
       int[] colecaoDeInteiros = {1,2,3,4};
       int[] meusNumeros = new int[4]; // Segunda forma de declarar vetores em Java sem inicializar com valores só passando o numero

       // ****************************** Condicionais ******************************

       if(str.isBlank()){
           System.out.println("Verdadeiro");
       }
       else if (str == "Cauet"){
           System.out.println(str);
       }
       else {
           System.out.println("Falso");
       }
        for (i = 0; i < 4; i++){
            System.out.println(colecaoDeInteiros[i]);
        }

       // ****************************** ArrayList ******************************

       ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Cauet");
        nomes.add("Fernanda");

        for(i=0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        nomes.remove(0);

       // ****************************** Loop ******************************

       for(i=0; i < nomes.size(); i++){
           System.out.println(nomes.get(i));
       }
       System.out.println("Segundo for");
       for(String nome:nomes){
           System.out.println(nomes);
       }
       int contador = 0;
       while (contador < 4){
           System.out.println("Estou no while");
           contador++;
       }

       // ****************************** Conversão de tipos ******************************

       double resultado = 3.3;
       int resultadoInt = (int)resultado;

       int meuInt = 10;
       double meuDouble = meuInt;

       String minhaString = "10";
       int meuint2 = Integer.parseInt(minhaString);

       String minhaString2 = String.valueOf(meuint2);

       // ****************************** POO ******************************

       /*
       Uma classe em programação orientada a objetos (POO) é uma estrutura que serve como um "molde" ou "modelo" para criar objetos (instâncias).
       Ela define atributos (variáveis) e métodos (funções) que os objetos criados a partir dela terão. Uma classe encapsula dados e comportamentos
       que estão relacionados a um determinado tipo de objeto.
       Um construtor é um método especial dentro de uma classe que é chamado automaticamente quando um novo objeto (instância) dessa classe é criado.
       Sua função principal é inicializar os atributos do objeto, ou seja, configurar o estado inicial do objeto.
        */
       Carro meuCarro = new Carro();
   }

}
class Carro {
    public Carro() {
        System.out.println("Carro criado");
    }
}
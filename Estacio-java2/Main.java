import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lst_numeros = new ArrayList<>();

        // Inserção dos elementos no ArrayList
        lst_numeros.add(10);
        lst_numeros.add(20);
        lst_numeros.add(30);
        lst_numeros.add(40);
        lst_numeros.add(50);

        // Acesso aos elementos no ArrayList
        System.out.println("Os elementos no ArrayList são:");
        for (int i = 0; i < lst_numeros.size(); i++) {
            System.out.println("lista["+i+"]= "+lst_numeros.get(i));
        }

        // Remove um elemento de um posição específica do ArrayList
        lst_numeros.remove(1);  // Remove o elemento da posição 2 do ArrayList

        // Alterar um elemento no ArrayList
        int x=57;
        lst_numeros.set(0, x);  // Coloca o elemento 57 na posição 0 do ArrayList

        // Verifica se o ArrayList contém um elemento específico
        int n = 100;
        String contem_elemento = lst_numeros.contains(n)?"Verdade":"Falso";
        System.out.println("O elemento "+n+" está the ArrayList? " + contem_elemento);

        // Iterar na lista através do laço for-each
        int k=0;
        System.out.println("Os elementos no ArrayList são:");
        for (int elemento : lst_numeros) {
            System.out.println("lista["+k+"]= "+elemento);
            k++;
        }

        // Limpar o ArrayList de todos os elementos
        System.out.println("Limpar o ArrayList. ");
        lst_numeros.clear();

        // Verifica se o ArrayList está vazio
        String eh_vazio = lst_numeros.isEmpty()?"Verdade":"Falso";
        System.out.println("O ArrayList está vazio? " + eh_vazio);
    }
} 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaContatos {
    private ArrayList<ContatoArrayList> contatos;

    public ListaContatos() {
        contatos = new ArrayList<>();
    }

    // 1. Adicionar elemento ao final da lista
    public void adicionarContato(ContatoArrayList contato) {
        contatos.add(contato);
    }

    // 2. Verificar a quantidade de elementos da lista
    public int quantidadeContatos() {
        return contatos.size();
    }

    // 3. Imprimir elementos da lista
    public void imprimirContatos() {
        for (ContatoArrayList contato : contatos) {
            System.out.println(contato);
        }
    }

    // 4. Obter elemento de uma posição da lista
    public ContatoArrayList obterContato(int index) {
        if (index >= 0 && index < contatos.size()) {
            return contatos.get(index);
        }
        return null;
    }

    // 5. Verificar se elemento existe na lista
    public boolean existeContato(ContatoArrayList contato) {
        return contatos.contains(contato);
    }

    // 6. Adicionar elemento em qualquer posição da lista
    public void adicionarContato(int index, ContatoArrayList contato) {
        if (index >= 0 && index <= contatos.size()) {
            contatos.add(index, contato);
        }
    }

    // 7. Remover elemento da lista
    public void removerContato(ContatoArrayList contato) {
        contatos.remove(contato);
    }

    // 8. Pesquisa por nome
    public ContatoArrayList pesquisarPorNome(String nome) {
        for (ContatoArrayList contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    // 9. Pesquisa por e-mail
    public ContatoArrayList pesquisarPorEmail(String email) {
        for (ContatoArrayList contato : contatos) {
            if (contato.getEmail().equalsIgnoreCase(email)) {
                return contato;
            }
        }
        return null;
    }

    // 10. Pesquisa por telefone
    public ContatoArrayList pesquisarPorTelefone(String telefone) {
        for (ContatoArrayList contato : contatos) {
            if (contato.getTelefone().equalsIgnoreCase(telefone)) {
                return contato;
            }
        }
        return null;
    }

    // 11. Ordenar por nome
    public void ordenarPorNome() {
        Collections.sort(contatos, new Comparator<ContatoArrayList>() {
            @Override
            public int compare(ContatoArrayList c1, ContatoArrayList c2) {
                return c1.getNome().compareToIgnoreCase(c2.getNome());
            }
        });
    }

    // 12. Ordenar por e-mail
    public void ordenarPorEmail() {
        Collections.sort(contatos, new Comparator<ContatoArrayList>() {
            @Override
            public int compare(ContatoArrayList c1, ContatoArrayList c2) {
                return c1.getEmail().compareToIgnoreCase(c2.getEmail());
            }
        });
    }

    // 13. Ordenar por telefone
    public void ordenarPorTelefone() {
        Collections.sort(contatos, new Comparator<ContatoArrayList>() {
            @Override
            public int compare(ContatoArrayList c1, ContatoArrayList c2) {
                return c1.getTelefone().compareToIgnoreCase(c2.getTelefone());
            }
        });
    }
}
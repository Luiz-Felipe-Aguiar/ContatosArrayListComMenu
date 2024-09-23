import java.util.ArrayList;
import java.util.Scanner;

public class TestaArrayList {
    public static void main(String[] args) {
        ListaContatos lista = new ListaContatos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Verificar quantidade de contatos");
            System.out.println("3. Imprimir contatos");
            System.out.println("4. Obter contato de uma posição específica");
            System.out.println("5. Verificar se existe o contato");
            System.out.println("6. Adicionar contato em qualquer posição");
            System.out.println("7. Duplicar tamanho do vetor");
            System.out.println("8. Remover contato");
            System.out.println("9. Pesquisar por nome");
            System.out.println("10. Pesquisar por e-mail");
            System.out.println("11. Pesquisar por telefone");
            System.out.println("12. Ordenar por nome");
            System.out.println("13. Ordenar por e-mail");
            System.out.println("14. Ordenar por telefone");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    lista.adicionarContato(new ContatoArrayList(nome, telefone, email));
                    break;
                case 2:
                    System.out.println("Quantidade de contatos: " + lista.quantidadeContatos());
                    break;
                case 3:
                    lista.imprimirContatos();
                    break;
                case 4:
                    System.out.print("Posição: ");
                    int posicao = scanner.nextInt();
                    ContatoArrayList contato = lista.obterContato(posicao);
                    if (contato != null) {
                        System.out.println(contato);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Nome do contato a verificar: ");
                    String nomeVerificar = scanner.nextLine();
                    ContatoArrayList contatoVerificar = new ContatoArrayList(nomeVerificar, "", "");
                    if (lista.existeContato(contatoVerificar)) {
                        System.out.println("Contato existe na lista.");
                    } else {
                        System.out.println("Contato não existe na lista.");
                    }
                    break;
                case 6:
                    System.out.print("Posição: ");
                    int posicaoAdicionar = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Nome: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefoneAdicionar = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailAdicionar = scanner.nextLine();
                    lista.adicionarContato(posicaoAdicionar, new ContatoArrayList(nomeAdicionar, telefoneAdicionar, emailAdicionar));
                    break;
                case 7:
                    // Duplicar tamanho do vetor (não aplicável para ArrayList, mas pode ser ignorado ou implementado de outra forma)
                    System.out.println("Operação não aplicável para ArrayList.");
                    break;
                case 8:
                    System.out.print("Nome do contato a remover: ");
                    String nomeRemover = scanner.nextLine();
                    ContatoArrayList contatoRemover = lista.pesquisarPorNome(nomeRemover);
                    if (contatoRemover != null) {
                        lista.removerContato(contatoRemover);
                        System.out.println("Contato removido.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 9:
                    System.out.print("Nome: ");
                    String nomePesquisar = scanner.nextLine();
                    ContatoArrayList contatoNome = lista.pesquisarPorNome(nomePesquisar);
                    if (contatoNome != null) {
                        System.out.println(contatoNome);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 10:
                    System.out.print("Email: ");
                    String emailPesquisar = scanner.nextLine();
                    ContatoArrayList contatoEmail = lista.pesquisarPorEmail(emailPesquisar);
                    if (contatoEmail != null) {
                        System.out.println(contatoEmail);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 11:
                    System.out.print("Telefone: ");
                    String telefonePesquisar = scanner.nextLine();
                    ContatoArrayList contatoTelefone = lista.pesquisarPorTelefone(telefonePesquisar);
                    if (contatoTelefone != null) {
                        System.out.println(contatoTelefone);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 12:
                    lista.ordenarPorNome();
                    System.out.println("Contatos ordenados por nome.");
                    break;
                case 13:
                    lista.ordenarPorEmail();
                    System.out.println("Contatos ordenados por e-mail.");
                    break;
                case 14:
                    lista.ordenarPorTelefone();
                    System.out.println("Contatos ordenados por telefone.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
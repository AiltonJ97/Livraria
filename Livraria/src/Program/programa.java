package Program;

import java.util.Scanner;

import Entidade.Livraria;
import Entidade.Livros;

public class programa {

	public static void main(String[] args) {

		Livraria livraria = new Livraria();
        Scanner scanner = new Scanner(System.in);
        
     // Criando os livros
        Livros livro1 = new Livros("Dom Quixote", "Miguel de Cervantes", 1605);
        Livros livro2 = new Livros("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livros livro3 = new Livros("Crime e Castigo", "Fiódor Dostoiévski", 1866);
        Livros livro4 = new Livros("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        Livros livro5 = new Livros("1984", "George Orwell", 1949);
        Livros livro6 = new Livros("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        
        
        // Adicionando livros disponiveis na livraria
        livraria.adicionarLivro(livro1);
        livraria.adicionarLivro(livro2);
        livraria.adicionarLivro(livro3);
        livraria.adicionarLivro(livro4);
        livraria.adicionarLivro(livro5);
        livraria.adicionarLivro(livro6);
        
        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Buscar livro por título");
            System.out.println("3. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    String autor = scanner.nextLine();
                    int ano = scanner.nextInt();
                    // Aqui poderíamos solicitar informações adicionais do livro, como autor e ano de publicação
                    Livros livro = new Livros(titulo, autor, ano); // Apenas para ilustrar
                    livraria.adicionarLivro(livro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o título do livro a ser buscado: ");
                    titulo = scanner.nextLine();
                    Livros livroEncontrado = livraria.buscarLivroPorTitulo(titulo);
                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado:");
                        System.out.println("Título: " + livroEncontrado.getTitulo());
                        System.out.println("Autor: " + livroEncontrado.getAutor());
                        System.out.println("Ano de Publicação: " + livroEncontrado.getAnoPublicacao());
                        // Aqui poderíamos exibir outras informações do livro, como autor e ano de publicação
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
	}

}

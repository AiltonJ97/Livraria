package Entidade;

import Trie.Trie;

public class Livraria {
	
	private Trie indice; // Usando Trie para indexar os livros por título

    // Construtor
    public Livraria() {
        indice = new Trie();
    }

    // Método para adicionar um livro à livraria
    public void adicionarLivro(Livros livro) {
        // Atualiza o índice com o título do livro
        indice.insert(livro.getTitulo().toLowerCase());
    }

    // Método para buscar um livro por título na livraria
    public Livros buscarLivroPorTitulo(String titulo) {
        // Busca otimizada usando a Trie
        if (indice.search(titulo.toLowerCase())) {
            // Se encontrado, retornar o livro correspondente ao título
            // Neste exemplo, apenas retornamos um livro com título correspondente ao título pesquisado
            // Na prática, pode haver vários livros com o mesmo título
            // Nesse caso, poderíamos retornar uma lista de livros ou implementar uma lógica de escolha mais precisa
            return new Livros(titulo, "Autor Desconhecido", 0); // Apenas para ilustrar a ideia
        }
        // Se não encontrado, retornar null
        return null;
    }
	
}

package Entidade;

import Trie.Trie;

public class Livraria {
	
	private Trie indice; // Usando Trie para indexar os livros por t�tulo

    // Construtor
    public Livraria() {
        indice = new Trie();
    }

    // M�todo para adicionar um livro � livraria
    public void adicionarLivro(Livros livro) {
        // Atualiza o �ndice com o t�tulo do livro
        indice.insert(livro.getTitulo().toLowerCase());
    }

    // M�todo para buscar um livro por t�tulo na livraria
    public Livros buscarLivroPorTitulo(String titulo) {
        // Busca otimizada usando a Trie
        if (indice.search(titulo.toLowerCase())) {
            // Se encontrado, retornar o livro correspondente ao t�tulo
            // Neste exemplo, apenas retornamos um livro com t�tulo correspondente ao t�tulo pesquisado
            // Na pr�tica, pode haver v�rios livros com o mesmo t�tulo
            // Nesse caso, poder�amos retornar uma lista de livros ou implementar uma l�gica de escolha mais precisa
            return new Livros(titulo, "Autor Desconhecido", 0); // Apenas para ilustrar a ideia
        }
        // Se n�o encontrado, retornar null
        return null;
    }
	
}

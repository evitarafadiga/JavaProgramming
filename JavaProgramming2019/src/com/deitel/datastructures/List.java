package com.deitel.datastructures;

// classe para representar um nó em uma lista
class ListNode<T>

{
// membros de acesso de pacote; List pode acessá-los diretamente
	T data; // dados para esse nó
	ListNode<T> nextNode; // referência para o próximo nó na lista

// construtor cria um ListNode que referencia o objeto
	ListNode(T object) {
		this(object, null);
	}

// construtor cria ListNode que referencia o objeto
// especificado e o próximo ListNode
	ListNode(T object, ListNode<T> node) {
		data = object;
		nextNode = node;
	}

// retorna referência aos dados no nó
	T getData() {
		return data;
	}

// retorna referência ao próximo nó na lista
	ListNode<T> getNext() {
		return nextNode;
	}
} // fim da classe ListNode<T>
// definição da classe List

public

class List<T> {
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name; // string como "lista" usada na impressão
// construtor cria List vazia com "list" como o nome

	public List() {
		this("list");
	}

// construtor cria uma List vazia com um nome
	public List(String listName) {
		name = listName;
		firstNode = lastNode = null;
	}

// insere o item na frente de List
	public void insertAtFront(T insertItem)

	{
		if (isEmpty()) // firstNode e lastNode referenciam o mesmo objeto
			firstNode = lastNode = new ListNode<T>(insertItem);
		else // firstNode referenciam o novo nó
			firstNode = new ListNode<T>(insertItem, firstNode);
	}

//insere o item no fim de List
	public void insertAtBack(T insertItem)

	{
		if (isEmpty()) // firstNode e lastNode referenciam o mesmo objeto
			firstNode = lastNode = new ListNode<T>(insertItem);
		else // nextNode do lastNode referencia o novo nó
			lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
	}

//remove o primeiro nó de List
	public T removeFromFront() throws EmptyListException {
		if (isEmpty()) // lança exceção se List estiver vazia
			throw new EmptyListException(name);
		T removedItem = firstNode.data; // recupera dados sendo removidos
//atualiza referências firstNode e lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;

		return removedItem; // retorna dados de nó removidos
	}

//remove o último nó de List
	public T removeFromBack() throws EmptyListException

	{
		if (isEmpty()) // lança exceção se List estiver vazia
			throw new EmptyListException(name);
		T removedItem = lastNode.data; // recupera dados sendo removidos
//atualiza referências firstNode e lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else // localiza o novo último nó
		{
			ListNode<T> current = firstNode;
//faz loop enquanto o nó atual não referencia lastNode
			while (current.nextNode != lastNode)
				current = current.nextNode;
			lastNode = current; // atual é novo lastNode
			current.nextNode = null;
		}
		return removedItem; // retorna dados de nó removidos
	}

//determina se a lista estiver vazia
	public boolean isEmpty()

	{
		return firstNode == null; // retorna true se a lista estiver vazia
	}

//gera saída do conteúdo da lista
	public void print()

	{
		if (isEmpty()) {
			System.out.printf("Empty %s%n", name);
			return;
		}
		System.out.printf("The %s is: ", name);
		ListNode<T> current = firstNode;
//enquanto não estiver no fim de lista, gera saída dos dados do nó atual
		while (current != null) {
			System.out.printf("%s ", current.data);
			current = current.nextNode;
		}
		System.out.println();
	}
} // fim da classe List<T>

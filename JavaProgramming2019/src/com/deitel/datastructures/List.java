package com.deitel.datastructures;

// classe para representar um n� em uma lista
class ListNode<T>

{
// membros de acesso de pacote; List pode acess�-los diretamente
	T data; // dados para esse n�
	ListNode<T> nextNode; // refer�ncia para o pr�ximo n� na lista

// construtor cria um ListNode que referencia o objeto
	ListNode(T object) {
		this(object, null);
	}

// construtor cria ListNode que referencia o objeto
// especificado e o pr�ximo ListNode
	ListNode(T object, ListNode<T> node) {
		data = object;
		nextNode = node;
	}

// retorna refer�ncia aos dados no n�
	T getData() {
		return data;
	}

// retorna refer�ncia ao pr�ximo n� na lista
	ListNode<T> getNext() {
		return nextNode;
	}
} // fim da classe ListNode<T>
// defini��o da classe List

public

class List<T> {
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name; // string como "lista" usada na impress�o
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
		else // firstNode referenciam o novo n�
			firstNode = new ListNode<T>(insertItem, firstNode);
	}

//insere o item no fim de List
	public void insertAtBack(T insertItem)

	{
		if (isEmpty()) // firstNode e lastNode referenciam o mesmo objeto
			firstNode = lastNode = new ListNode<T>(insertItem);
		else // nextNode do lastNode referencia o novo n�
			lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
	}

//remove o primeiro n� de List
	public T removeFromFront() throws EmptyListException {
		if (isEmpty()) // lan�a exce��o se List estiver vazia
			throw new EmptyListException(name);
		T removedItem = firstNode.data; // recupera dados sendo removidos
//atualiza refer�ncias firstNode e lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;

		return removedItem; // retorna dados de n� removidos
	}

//remove o �ltimo n� de List
	public T removeFromBack() throws EmptyListException

	{
		if (isEmpty()) // lan�a exce��o se List estiver vazia
			throw new EmptyListException(name);
		T removedItem = lastNode.data; // recupera dados sendo removidos
//atualiza refer�ncias firstNode e lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else // localiza o novo �ltimo n�
		{
			ListNode<T> current = firstNode;
//faz loop enquanto o n� atual n�o referencia lastNode
			while (current.nextNode != lastNode)
				current = current.nextNode;
			lastNode = current; // atual � novo lastNode
			current.nextNode = null;
		}
		return removedItem; // retorna dados de n� removidos
	}

//determina se a lista estiver vazia
	public boolean isEmpty()

	{
		return firstNode == null; // retorna true se a lista estiver vazia
	}

//gera sa�da do conte�do da lista
	public void print()

	{
		if (isEmpty()) {
			System.out.printf("Empty %s%n", name);
			return;
		}
		System.out.printf("The %s is: ", name);
		ListNode<T> current = firstNode;
//enquanto n�o estiver no fim de lista, gera sa�da dos dados do n� atual
		while (current != null) {
			System.out.printf("%s ", current.data);
			current = current.nextNode;
		}
		System.out.println();
	}
} // fim da classe List<T>

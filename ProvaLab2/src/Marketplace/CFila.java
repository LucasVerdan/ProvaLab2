package Marketplace;


/**
 * @(#)CFila.java
 *
 *
 * @author Rodrigo Richard Gomes 
 * @version 1.00 2018/3/16
 */
 
public class CFila {
   private CCelula frente; // Celula cabeca.
   private CCelula tras; // Ultima celula.
   private int qtde;
    
   // Funcao construtora. Cria a celula cabeca e faz as referencias frente e tras apontarem para ela.
   public CFila() {
      frente = new CCelula();
      tras = frente;
   }
 
   // Verifica se a fila esta vazia. Retorna TRUE se a fila estiver vazia e FALSE caso contrario.
   public boolean vazia() {
      return frente == tras;
   }
 
   public void mostra() {
      
      for (CCelula c = frente.prox; c != null; c = c.prox) {
    	  System.out.print("[ ");
    	  System.out.print(c.item + " ");
      System.out.println("] ");
      }
   }
 
   // Insere um novo Item no fim da fila.
   // O parametro "valorItem" e um Object contendo o elemento a ser inserido no final da fila.
   public void enfileira(Object valorItem) {
      tras.prox = new CCelula(valorItem);
      tras = tras.prox;
      qtde++;
   }
 
   public void Ordena(int prioridade,Object cliente) {
		   Object aux;
		   if(prioridade==1) {
			   
			   
			   if(frente.prox.item!=null) {
			   
			   aux= frente.prox.item;
			   frente.prox.item=cliente;
			   tras.item=aux;
			   
		   }
			
		   }
		   
		   if(prioridade==2) {
			   
			   if(frente.prox.item==null)frente.prox.item = cliente;
			   else tras.item = cliente;

			   
			   
		   }
		   
	   
   }
   
   // Retira e retorna o primeiro elemento da fila.
   // Retorna um Object contendo o primeiro elemento da fila. Caso a fila esteja vazia retorna null.
   public Object desenfileira()
   {
      Object item = null;
      if (frente != tras) {
         frente = frente.prox;
         item = frente.item;
         qtde--;
      }
      return item;
   }
 
//   public Object retornaIndice(int posicao) {
//       if (primeira != ultima && posicao <= qtde) {
//           CCelula aux = new CCelula();
//           aux = primeira;
//           for (int i = 1; i <= posicao; i++)
//               aux = aux.prox;
//           return aux.item;
//
//       }
//       return null;
//   }
   // Retorna o primeiro Item da fila sem remove-lo.
   // Retorna um Object contendo o primeiro Item da fila.
   public Object peek() {
      if (frente != tras)
         return frente.prox.item;
      else
         return null;
   }
   
   // Verifica se o Item passado como parametro esta contido na fila.
   // O parametro "valorItem" e um object contendo o Item a ser localizado.
   // O metodo retorna TRUE caso o item esteja presente na fila.
   public boolean contem(Object valorItem) {
      boolean achou = false;
      CCelula aux = frente.prox;
      while (aux != null && !achou) {
         achou = aux.item.equals(valorItem);
         aux = aux.prox;
      }
      return achou;
   }
 
   // Verifica se o Item passado como parametro esta contido na fila. (Obs: usa o comando FOR)
   // Recebe como parametro um object contendo o Item a ser localizado.
   // Retorna TRUE caso o Item esteja presente na fila.
   public boolean contemFor(Object valorItem) {
      boolean achou = false;
      for (CCelula aux = frente.prox; aux != null && !achou; aux = aux.prox)
         achou = aux.item.equals(valorItem);
      return achou;
   }
 
   // Metodo que retorna a quantidade de itens da fila.
   public int quantidade() {
      return qtde;
   }
 
}
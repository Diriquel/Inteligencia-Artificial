package EDD;

public class main {

	public static void main(String[] args) {
		System.out.println("-------Pila-------");
		Pila pila = new Pila();
		pila.apilar("A");
		pila.apilar("B");
		pila.apilar("C");
		pila.apilar("D");
		
		System.out.println("Esta vacia la pila?:"+ pila.vacia());
		System.out.println("Tama�o de la pila:"+ pila.size());
		/*
		System.out.println(pila.cima());
		pila.desapilar();
		System.out.println(pila.cima());
		pila.desapilar();
		System.out.println(pila.cima());
		pila.desapilar();
		System.out.println(pila.cima());
		pila.desapilar();
	
		System.out.println("Esta vacia esta pila?:" + pila.vacia());
		
		System.out.println("-------Cola-------");
		Cola cola = new Cola();
		cola.encolar("A");
		cola.encolar("B");
		cola.encolar("C");
		cola.encolar("D");
		
		System.out.println("Esta vacia la cola?:" + cola.vacia());
		System.out.println("Tama�o de la cola:" + cola.size());
		
		System.out.println(cola.frente());
		cola.desencolar();
		System.out.println(cola.frente());
		cola.desencolar();
		System.out.println(cola.frente());
		cola.desencolar();
		System.out.println(cola.frente());
		cola.desencolar();
		
		System.out.println("Esta vacia la cola?:" + cola.vacia());
		
		Pila newpila = new Pila();
		newpila = pila.inviertePila(pila);
		
		System.out.println(newpila.cima());
		newpila.desapilar();
		System.out.println(newpila.cima());
		newpila.desapilar();
		System.out.println(newpila.cima());
		newpila.desapilar();
		System.out.println(newpila.cima());
		newpila.desapilar();
		*/
		
		/*--------Arbol--------*/
		Arbol abo = new Arbol();
		abo.insertar(100);
		abo.insertar (50);
        abo.insertar (25);
        abo.insertar (75);
        abo.insertar (150);
		
        System.out.println ("Impresion preorden: ");
        abo.imprimirPre ();
        System.out.println ("Impresion entreorden: ");
        abo.imprimirEntre ();
        System.out.println ("Impresion postorden: ");
        abo.imprimirPost (); 
        
	}

}

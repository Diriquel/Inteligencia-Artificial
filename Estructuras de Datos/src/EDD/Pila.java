package EDD;

import java.util.ArrayList;

public class Pila extends ArrayList{
	
	// Se añade un elemento a la pila (push).
	public void apilar(Object dato){
		if(dato != null){
			this.add(dato);
		}
		else{
			System.out.println("Introduzca un dato no nulo");
		}
	}
	
	// Se elimina el elemento frontal de la pila (pop).
	public void desapilar(){
		if(size() > 0){
			this.remove(this.size()-1);
		}
	}
	
	// Devuelve el elemento que está en la
	// cima de la pila
	public Object cima(){
		Object datoAuxiliar = null;
		if(this.size() > 0){
			datoAuxiliar = this.get(this.size()-1);
		}
		return datoAuxiliar;
	}
	
	// Devuelve "cierto" si la pila está vacía o
	// falso en caso contrario (empty)
	public boolean vacia(){
		return this.isEmpty();
	}
	
	public Pila inviertePila(Pila pila){
		Pila nueva = new Pila();
		while(!pila.vacia()){
			nueva.apilar(pila.cima());
			pila.desapilar();
		}
		return nueva;
	}


}

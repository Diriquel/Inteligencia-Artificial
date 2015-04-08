package EDD;
import java.util.ArrayList;

public class Cola extends ArrayList{

	// Se a�ade un elemento a la cola. Se a�ade al 
	// final de esta.
	public void encolar(Object dato){
		if(dato != null){
			this.add(dato);
		}
		else{
			System.out.println("Introduzca un dato no nulo");
		}
	}
	
	// Se elimina el elemento frontal de la cola, es decir,
	// el primer elemento que ingres�.
	public void desencolar(){
		if(this.size() > 0){
			this.remove(0);
		}
	}
	
	// Se devuelve el elemento frontal de la cola, es
	// decir, el primer elemento que ingres�.
	public Object frente(){
		Object datoAuxiliar = null;
		if(this.size() > 0){
			datoAuxiliar = this.get(0);
		}
		return datoAuxiliar;
	}
	// Devuelve "cierto" si la pila est� vac�a o 
	// "falso" en caso contrario (empty).
	public boolean vacia(){
		return this.isEmpty();
	}
	
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirpersonas;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario DAM 2
 */
public class ListaPersonas {
    private List<Persona> lista = new ArrayList<Persona>();
	public ListaPersonas(){}
	public void add(Persona per){
		lista.add(per);
	}
	public List<Persona> getListaPersonas(){
		return lista;
	}
}

package org.action.catalogo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.management.loading.PrivateClassLoader;

import org.dao.generic.DaoGeneric;
import org.modelo.ciudad.Ciudad;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@SuppressWarnings("serial")
public class ActionCatalogo extends ActionSupport implements ModelDriven<Ciudad> {
	private Ciudad ciudad =new Ciudad();
	private DaoGeneric dao= new DaoGeneric();
	private List<Ciudad> list = new ArrayList<Ciudad>(); 
	private List<String> nombresCidades =new ArrayList<String>();

	public String execute() {
		return SUCCESS;
	}
	
	public String catalogo() {
		setList(dao.listCiudad());
		for(Ciudad ciudad : list  ) {
			nombresCidades.add(ciudad.getNombre());
			
		}
		return SUCCESS;
		
	}
	
	@Override
	public Ciudad getModel() {
		
		return ciudad;
	}
	
	public List<Ciudad> getList() {
		return list;
	}
	public void setList(List<Ciudad> list) {
		this.list = list;
	}
	public List<String> getNombresCidades() {
		return nombresCidades;
	}
	public void setNombresCidades(List<String> nombresCidades) {
		this.nombresCidades = nombresCidades;
	}

}

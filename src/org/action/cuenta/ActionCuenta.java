package org.action.cuenta;

import java.util.ArrayList;
import java.util.List;

import org.apache.maven.model.CiManagement;
import org.dao.generic.DaoGeneric;
import org.modelo.cuenta.Cuenta;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import oracle.net.aso.e;

public class ActionCuenta extends ActionSupport implements ModelDriven<Cuenta>{
	private Cuenta  cuenta = new Cuenta();
	private DaoGeneric dao = new DaoGeneric();
	private List<Cuenta> list = new ArrayList<Cuenta>();
	
	
	
	public String execute()  {
		
		return SUCCESS;
	}
	
	//restritivo : no solo Comparable el valor de dato si no que tambien compara el tipo de dato
	//string num= 1
	//int num2 = 1;
	/*
	 * num1==num2(igual)  num1===num2(el 2)
	 * == (no es restritivo) ===(si esrestritivo) .equals(si es restritivo)
	 * 
	 * */
	public String autentica() {
		setList(dao.listCuenta());
		for(Cuenta x : list) {
			if (cuenta.getLogin().equals(x.getLogin()) && 
					cuenta.getPassword().equals(x.getPassword())) {
				return SUCCESS;
			}
		}
		
		return ERROR;
	}

@Override
public Cuenta getModel() {

	return cuenta;
}
	public List<Cuenta> getList() {
		return list;
	}


	public void setList(List<Cuenta> list) {
		this.list = list;
	}
	
	

}

package br.unisantos.prova.fehidro.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.unisantos.prova.fehidro.model.Criterio;
import br.unisantos.prova.fehidro.rest.CriterioRESTClient;


@ManagedBean
@SessionScoped
public class CriterioBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Criterio criterio = new Criterio();

	public CriterioBean() {
	}

	public Criterio getCriterio() {
		return criterio;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
	
	public String gravar() {
		CriterioRESTClient rest = new CriterioRESTClient();
		rest.create(criterio);
		return null;
	}
}

package br.unisantos.prova.fehidro.rest;

import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.unisantos.prova.fehidro.model.Criterio;

public class CriterioRESTClient implements RESTClientInterface<Criterio> {
	private Response response;
	
	@Override
	public List<Criterio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criterio find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criterio create(Criterio obj) {
		this.response = ClientBuilder.newClient().
				target(REST_WEBSERVICE_URL + REST_CRITERIO_URL).
				request(MediaType.APPLICATION_JSON).
				post(Entity.entity(obj, MediaType.APPLICATION_JSON));
		Criterio criterio = this.response.readEntity(Criterio.class);
		return criterio;
	}

	@Override
	public Criterio edit(Criterio obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}

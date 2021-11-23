package br.com.jogodasorte.bean;

import java.util.ArrayList;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.jogodasorte.dao.LanceDao;
import br.com.jogodasorte.entidade.Lance;

@ManagedBean
@SessionScoped
public class LanceBean {

	private Lance lance;
	private ArrayList<Lance> lances;


	public int gerarAleatorio() {
		Random gerarAleatorio = new Random();
		int a = gerarAleatorio.nextInt(5) + 1;
		return a;
	}
	
	public void salvar() {
		this.lance = new Lance();
		LanceDao dao = new LanceDao();
		
		lance.setV1(gerarAleatorio());
		lance.setV2(gerarAleatorio());
		lance.setV3(gerarAleatorio());
		lance.setDescricao("Lance " + (dao.listar().get(0).getId() + 1));
		
		LanceDao.salvar(lance);
		lance = new Lance();//vai chamar outro objeto do tipo Lance
	}
	
	public void listar() {
		LanceDao dao = new LanceDao();
		lances = (ArrayList<Lance>) dao.listar();
}
	
	public String editar() {
		LanceDao dao = new LanceDao();
		dao.editar(lance);
		return null;
}
	
	public String excluir() {
		LanceDao.excluir(lance);
		lances.remove(lance);
		return null;
}	
	
	public Lance getLance() {
		return lance;
	}
	public void setLance(Lance lance) {
		this.lance = lance;
	}
	
	public ArrayList<Lance> getLances() {
		return lances;
	}

	public void setLances(ArrayList<Lance> lances) {
		this.lances = lances;
	}

	
}
	
	
package combustivel.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import combustivel.model.Combustivel;

@ManagedBean
@RequestScoped
public class CombustivelBean {
	private Combustivel combustivel = new Combustivel();
	private String mensagem;

	public CombustivelBean() {
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String calcular() {
		if (combustivel.getEtanol() / combustivel.getGasolina() >= 0.7) {
			mensagem = "Abasteça com gasolina";
		} 
		else {
			mensagem = "Abasteça com etanol";
		}
		return null;
	}
}

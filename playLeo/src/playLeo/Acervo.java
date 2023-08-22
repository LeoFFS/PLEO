package playLeo;

import java.util.ArrayList;

public class Acervo {

	private static ArrayList<PlayLeo> listaJogos = new ArrayList<>();
	
	// Método Get

	public static ArrayList<PlayLeo> getListaJogos() {
		return listaJogos;
	}
	// Adicionar um objeto na lista
	
	static public void adicionar(PlayLeo l) {
		listaJogos.add(l);
	}

	
	
	static public String listar() {
		String saida = "";
		int i = 1;
		for(PlayLeo l : listaJogos) {
			saida += "\n ====== Jogo Nº " + (i++) + "======\n";
			saida += l.imprimir() + "\n";
		}
		return saida;
	}
	
	
	
	static public int pesquisar(String genero) {
		int qtd = 0;
		for (PlayLeo l : listaJogos) {
			if (l.getGenero().equalsIgnoreCase(genero)){
				qtd++;
			}
			
		}
		return qtd;
	}
		
		// Sobrecarga de Métodos 
		
		static public int pesquisar(double vInicial, double vFinal) {
			int qtd = 0;
			for (PlayLeo l : listaJogos) {
				if (l.getPreco() >= vInicial && l.getPreco() <= vFinal) {
					qtd++;
				}
			}
			return qtd;
		}
			
			
			static public boolean remover(String titulo) {
				for (PlayLeo l : listaJogos) {
					if(l.getTitulo().equalsIgnoreCase(titulo)) {
						listaJogos.remove(l);
						return true;
					}
				}
				return false;
			}
			
			
			
			static double calcularTotalAcervo() {
				double total = 0;
				
				for (PlayLeo l : listaJogos) {
					total += l.getPreco();
				}
				return total;
			}
			
		}
	
	
	


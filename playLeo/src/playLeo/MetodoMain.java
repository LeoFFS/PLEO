package playLeo;

import java.util.Scanner;

public class MetodoMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		PlayLeo objJogo;
		
		int menu;
		double vInicial, vFinal;
		
	
		
		String titulo, publisher, genero;
		float preco;
		String tamanho;
		
		do { exibirMenu();
		 menu = input.nextInt();
		 
		 switch(menu) {
		 case 1:
			 System.out.println("**Cadastrar Jogo**");
			 System.out.println("Digite o titulo desejado: ");
			 titulo = input2.nextLine();
			 System.out.println("Digite a publisher: ");
			 publisher = input2.nextLine();
			 System.out.println("Digite o genero: ");
			 genero = input2.nextLine();
			 System.out.println("Digite o tamanho: ");
			 tamanho = input2.nextLine();
			 System.out.println("Digite o  preço");
			 preco = input.nextFloat();
			 
			
             objJogo = new PlayLeo(titulo, publisher, tamanho, genero, preco);
             
             Acervo.adicionar(objJogo);
			 
			
			 break;
		 case 2:
			 System.out.println("**Listagem de Jogos**");
			 System.out.println(Acervo.listar());
			 break;
		 case 3:
			 System.out.println("**Exclusão do Jogo**");
			 System.out.println("Digite o título do Jogo");
			 titulo = input2.nextLine();
			 
			 if(! Acervo.getListaJogos().isEmpty()) {
				 if(Acervo.remover(titulo)) {
					 System.out.println("Jogo removido com sucesso!");
				 }else {
					 System.out.println("Título não encontrado! ");
				 }
			 }else {
				 System.out.println("Não existem jogos no acervo");
			 }
			 break;
		 case 4:
			 System.out.println("**Pesquisa por genero**");
			 System.out.println("Digite o genero: ");
			 genero = input2.nextLine();
			 System.out.println("Existem "+ Acervo.pesquisar(genero)+ " Jogo(s) do genero "+ genero);
			 break;
		 case 5 :
			 System.out.println("**Pesquisa por faixa de preço");
			 System.out.println("Digite a faixa inicial de preço");
			 vInicial = input.nextInt();
			 System.out.println("Digite a faixa final de preço");
			 vFinal = input.nextInt();
			 System.out.println("Existem "+ Acervo.pesquisar(vInicial, vFinal)+ "jogo(s) com preço entre "
					 + String.format("R$ %.2f e R$ %.2f \n", vInicial, vFinal));
			 break;
		 case 6:
			 System.out.println("**Total em R$ de jogos no Acervo**");
			 System.out.println("O total é: "+
			 String.format(" R$ %.2f \n ", Acervo.calcularTotalAcervo()));
			 break;
		 case 7:
			 System.out.println("LogOut......");
			 break;
			 
			 default:
				 System.out.println("Opção invalida!!");
		 }
			
		}while(menu != 7);

	}

	static void exibirMenu() {
		System.out.println("+++++++++++PLAY LEO+++++++++++");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - LISTAR");
		System.out.println("3 - EXCLUIR");
		System.out.println("4 - PESQUISAR POR GENERO");
		System.out.println("5 - PESQUISAR POR PERÇO");
		System.out.println("6 - CALCULAR TOTAL DO ACERVO");
		System.out.println("7 - SAIR");
		System.out.println("****Escolha um opção****");
	}

}

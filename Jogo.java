package JogoExemplo;

public class Jogo {

		
	
	public static void main(String[] args) {
		Jogador Vilao = new Jogador();
		Vilao.x=10;
		Vilao.y=10;
		Jogador Heroi = new Jogador();
		Vilao.x=10;
		Vilao.y=11;
		
		
		System.out.println("Vida"+ Vilao.vida);
		System.out.println("Vida"+ Heroi.vida);
		
		Vilao.andar(Direcao.NORTE);
		Vilao.atacar(Heroi);
		
		
		
		System.out.println("Vida"+ Vilao.vida);
		System.out.println("Vida"+ Heroi.vida);
		
		Heroi.atacar(Vilao);
		
		
		System.out.println("Vida"+ Vilao.vida);
		System.out.println("Vida"+ Heroi.vida);

		
		   
			
		}
	
}


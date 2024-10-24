package JogoExemplo;

public class Vilao extends Jogador{
	  boolean atacarDuasVezes(Jogador oponente) {
	        boolean ataque1 = super.atacar(oponente); // Primeiro ataque
	        boolean ataque2 = super.atacar(oponente); // Segundo ataque
	        return ataque1 || ataque2; // Retorna true se algum dos ataques for bem-sucedido
	    }
	}
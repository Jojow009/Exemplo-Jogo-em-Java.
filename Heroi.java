package JogoExemplo;

public class Heroi extends Jogador {
	   boolean atacar(Jogador oponente) {
		   
	        int deltaX = Math.abs(x - oponente.x);
	        int deltaY = Math.abs(y - oponente.y);
	        
	        // Verifica se o oponente está em uma posição adjacente
	        if (deltaX + deltaY == 1) {
	            oponente.vida -= 20; // Causa 10 de dano ao oponente
	            return true;
	        } else {
	            return false; // Se não está adjacente, o ataque falha
	        }
	    }
	

}

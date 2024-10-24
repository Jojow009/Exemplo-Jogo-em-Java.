package JogoExemplo;

public class Jogador {
   protected int vida = 100;
   protected int x; 
   protected int y;

    // Método de ataque
     boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);
        
        // Verifica se o oponente está em uma posição adjacente
        if (deltaX + deltaY == 1) {
            oponente.vida -= 10; // Causa 10 de dano ao oponente
            return true;
        } else {
            return false; // Se não está adjacente, o ataque falha
        }
    }

    // Método para andar (mantido como no original)
    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }
}
Overview Este projeto é um jogo simples de simulação de batalha. Existem dois tipos de personagens – Heróis e Vilões, que podem mover-se no mapa e atacar uns aos outros. O jogo é desenvolvido em Java e baseado em orientação a objetos. Mais precisamente, é baseado nos conceitos de orientação a objetos conhecidos como herança, sobrescrita e direções de movimento de personagens específicos e “comuns” para o jogo. Estrutura: O projeto tem várias classes e uma enumeração:

Jogo: a classe principal, que contém o método main () e executa a lógica do “drive” do jogo.

Jogador: uma classe básica de todos os jogadores, usuário e vilão. Defina o modo pelo qual eles se moverão e atacarão um ao outro.

Heroi e Vilão: classe-filha de Jogador. Defina uma forma de mover Herói e Vilão no mapa e seu modo de ataque – aqui, ele pode atacar duas vezes por rodada.

Direcao: enumeração humanamente compreensível que define todas as direções possíveis nas quais os personagens podem se mover: norte, sul, leste e oeste. Features: Movimento:

Em todas as rodadas, os jogadores podem se mover para 4 direções – norte, sul, leste e oeste.

Para fazer isso, use o método de movimento “andar (Direcao) “.

Ataque:

Jogadores podem atacar oponentes, próximos a ele horizontal e verticalmente.

Para implementar o método de atacar() com todos os casos ataque só pode ocorrer quando a diferença entre X ou Y é igual a 1.

Herói desferirá 20 pontos de “dano ao Vilão” ou outro jogador, enquanto qualquer jogador “comum” infligirá 10 pontos de dano. Vilão, por sua vez, pode atacar duas vezes em uma rodada, aumentando as chances de infligir dano ao adversário.

Vida dos Jogadores:

-Todos os jogadores iniciam com 100 de vida; cada ataque realizado com sucesso tira, respectivamente, 10 de vida de ataque comum para os jogadores e 20 de vida para os heróis de ataque. Classes e enumerações: Classe Jogador, que refere à classe base de todos os personagens do jogo, contendo: *– vida: quantia de vida do jogador; x e y: coordenadas do mapa para saber a posição do personagem.; – métodos: •atacar – verifica se o oponente está adjacente, e, se sim, tira 10 de vida dele; •andar – move o jogador em uma direção específica, indo norte, sul, leste ou oeste. Classe Heroi, que refere à subclasse de Jogador e um ataque mais forte que o ataque de ataque: – sobrescreve o método atacar para tirar 20 de vida se golpear, ao invés do 10; Classe Vilao, que refere à subclasse de Jogador que tem uma habilidade especial: – método atacarDuasVezes – dá dois ataques seguidos ao jogador oponente, com a quantia de vida da regra acima; Enum Direcao – enum que enumera as direções; Classe Jogo, que contém a clase principal com o método main, onde acontece o jogado e as ações: -criação dos 2 jogadores, um Vilao e um Heroi; -posicionamento inicial dos jogadores no mapa; -vilão ataca heroi; -heroi dá sua volta e ataca; -exibição no console das vidas dos jogadores após a ação.

Previously Generated

Words: 407

Characters: 2425

Mode: Enhanced

Descrição Geral: Este projeto consiste em um jogo que simula uma batalha entre dois tipos de personagens, Heróis e Vilões, que podem se deslocar de um local para o outro e atacar uns aos outros. O projeto foi desenvolvido em Java e implementa conceitos básicos de orientação a objetos, como herança, sobrescrita de métodos e enumeração de movimento. 2. Estrutura do Projeto: O projeto consiste nas seguintes classes e enumerações:Figura 1 – Estrutura do ProjetoFonte: dos autores Jogo : esta é a classe principal, que contém o main e executa a lógica do jogo; Jogador : esta é a classe base, que contém métodos para o jogador se deslocar de um local para o outro e atacar outro jogador; Herói : esta é a subclasse que especifica a função do herói; nesta função, o herói realiza um ataque mais sério; Vilão : este é outro subconjunto, que especifica a função do vilão; o vilão joga dois ataques com uma única ação; Direção: esta é a enum que contém as direções norte, sul, leste e oeste; 3. Funcionalidades: Movimento: todos os jogadores podem se mover em quatro locais, devido à movimentação norte, sul, leste e oeste; a movimentação ocorre por meio do método move play, disponível em Jogador; Attack: todos os jogadores podem atacar quem está nas proximidades, horizontal ou vertical e; o jogador Herói tem 20 ataques fortes, enquanto outros têm 10 ataques; Vida:
Nenhum jogador pode iniciar o jogo com menos de 100 pontos de vida, como mencionado acima. Cada ataque bem-sucedido diminui os pontos de vida do oponente em 10 no caso de um jogador normal e em 20 no caso de um herói, conforme a situação. Classes e Enumerações: Classe Jogador: a base para todos os personagens do jogo. Vida 100, x, y: coordenadas para o mapa, onde é o jogador. atacar(Jogador oponente): verifica se o oponente está adjacente, se sim, retira pontos de vida 10 andar(Direcao direcao): movimenta o jogador para os pontos cardeais Heróis: Classe Herói: subclasse de Jogador. É praticamente a mesma coisa, apenas um ataque mais forte. atacar(Jogador oponente) sobrescrito: pontos de vida 20 Classe Vilão: subclasse de Jogador. O ataque é praticamente normal, mas com o método atacarDuasVezes(Enumerações.Direcoes dir) Enumeracao Direcao: N, S, L, O Classe Principal: Jogo: Cria 2 jogadores, um Vilao e um Heroi. Posiciona os jogadores no mapa. Vilão ataca. Herói responde com um ataque. Exibir o console de vida dos jogadores após cada ação.Melhorias Futuras
Mapa: Adicionar um mapa para que os jogadores possam se mover e se encontrar visualmente.
Mais Tipos de Jogadores: Incluir mais subclasses de Jogador com habilidades especiais.
Itens e Poderes: Implementar um sistema de itens ou poderes especiais que os jogadores possam usar durante a batalha.
Este projeto é uma introdução divertida ao uso de conceitos de orientação a objetos em Java, como herança, encapsulamento e polimorfismo, aplicados em um jogo simples de simulação de batalha.

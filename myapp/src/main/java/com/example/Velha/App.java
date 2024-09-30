
/*********************************************************************/
/** Centro Universitario Senac **/
/** TADS - 1o semestre de 2024 **/
/** <Fernando> **/
/** **/
/** Projeto SEMESTRAL I **/
/** Arquivo: <nome do arquivo> **/
/** **/
/** <Luis Felipi Moreira Alves> **/
/** <Nome completo do aluno 2> **/
/** <Nome completo do aluno 3> **/
/** **/
/** <data da entrega> **/
/*********************************************************************/

import java.util.Random;
import java.util.Scanner;

public class App {

    static Scanner ler = new Scanner(System.in);
    static int[] contadorPoints = { 0, 0, 0, 0}; // Única variável global usada para armazenar os pontos do
                                            // jogadores e máquinas.

    public static void main(String[] args) {
        int modoJogo = imprimeMenuPrincipal();
        char[][] tabuleiro = inicializarTabuleiro();

        // Modos de jogo selecionado pelo user
        switch (modoJogo) {
            case 1:
                modoJogador(tabuleiro,modoJogo);
                break;
            case 2:
                modoFacil(tabuleiro, modoJogo);
                break;
            case 3:
                modoDificil(tabuleiro, modoJogo);
                break;
            default:
                System.err.println("Error )=");
                break;
        }
    }

    public static int imprimeMenuPrincipal() {
        
        System.out.println("\nSelecione o modo de jogo: ");
        System.out.println("1 - Player vs Player");
        System.out.println("2 - Player vs Máquina(Fácil)");
        System.out.println("3 - Player vs Máquina(Difícil)");
        int modoJogo = ler.nextInt(); // Lê o modo de jogo selecionado pelo user

        // Tratamento de opção inválida
        while (modoJogo != 1 && modoJogo != 2 && modoJogo != 3) {
            System.out.println("Opção inválida!");
            System.out.println("1 - Player vs Player");
            System.out.println("2 - Player vs Máquina(Fácil)");
            System.out.println("3 - Player vs Máquina(Difícil)");
            System.out.println("Informe o modo de jogo: ");
            modoJogo = ler.nextInt();
        }

        return modoJogo;
    }

    // player vs player
    public static void modoJogador(char[][] tabuleiro, int modoJogo) {
        System.out.println("Modo selecionado: Player vs Player");

        // Chama os players de acordo com os valores do contador(par/ímpar)
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                player1(tabuleiro, i,modoJogo);
            } else {
                player2(tabuleiro, i,modoJogo);
            }
        }
    }

    // player vs máquina(fácil)
    public static void modoFacil(char[][] tabuleiro, int modoJogo) {
        System.out.println("\nModo_Fácil_\n");

        for(int i = 0; i < 9; i ++){
            if(i % 2 == 0){
                player1(tabuleiro, i,modoJogo);
            }else{
                //máquina
                machineEasy(tabuleiro, i,modoJogo);
            }
            
        }
    }

    // player vs máquina(Difícil)
    public static void modoDificil(char[][] tabuleiro, int modoJogo) {
        System.out.println("\nModo_Difícil_\n");
        imprimirTabuleiro(tabuleiro);
        
        for(int i = 0; i < 9; i ++){
            if(i % 2 == 0){
                player1(tabuleiro, i,modoJogo);
            }else{
                char ifd = 'O';
                //máquina
                MelhorJogada(tabuleiro,ifd, modoJogo);
            }
            
        }
    }

    // Preenche o tabluleiro
    public static char[][] inicializarTabuleiro() {
        char[][] tabuleiro = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '_';
            }
        }
        return tabuleiro;
    }

    // Imprime o tabuleiro
    public static void imprimirTabuleiro(char tabuleiro[][]) {
        System.out.println(" -----------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println(" -----------");
    }

    // Lê a linha e verifica se ela existe no tabuleiro
    public static int leiaCoordenadaLinha() {
        System.out.println("Informe a linha: ");
        int linha = ler.nextInt();

        while (linha > 3 || linha < 1) {
            System.out.println("Linha inválida!");
            linha = leiaCoordenadaLinha();
        }

        return linha;
    }

    // Lê a coluna e verifica se ela existe no tabuleiro
    public static int leiaCoordenadaColuna() {
        System.out.println("Informe a coluna: ");
        int coluna = ler.nextInt();

        while (coluna > 3 || coluna < 1) {
            System.out.println("Coluna inválida!");
            coluna = leiaCoordenadaColuna();
        }

        return coluna;
    }

    // Verifica se a posição da matriz está livre
    public static boolean posicaoValida(int linha, int coluna, char[][] tabuleiro, char iconePlayer) {
        boolean validation = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((linha - 1) == i && (coluna - 1) == j) {
                    if (tabuleiro[i][j] == '_') {
                        validation = true;
                    } else {
                        validation = false;
                        System.err.println("Posição já preenchida )=");
                    }
                }
            }
        }

        return validation;
    }

    // Após a validação da função "posicaoValida", guarda os valores de linha e
    // coluna.
    public static void jogadaUsuario(boolean posicaoValida, int linha, int coluna, char[][] tabuleiro,char iconePlayer,int modoJogo) {

        int[] linhaAndColuna = { linha, coluna };
        jogar(linhaAndColuna, tabuleiro, iconePlayer,modoJogo);// Envia os valores de linha e coluna para está função

    }

    public static void jogar(int[] linhaAndColuna, char[][] tabuleiro, char iconePlayer, int modoJogo) {
        // linhaAndColuna[0] = linha
        // linhaAndColuna[1] = coluna

        // Preenche a posição do tabuleiro com o ícone do player
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (linhaAndColuna[0] == (i + 1) && linhaAndColuna[1] == (j + 1)) {
                    tabuleiro[i][j] = iconePlayer;
                }
            }
        }
        // Mostra o tabuleiro após ser preenchido
        imprimirTabuleiro(tabuleiro);
        // Função para verificar se houve vendedor
        verificaVencedor(tabuleiro, iconePlayer,modoJogo);
    }

    // Função do player1
    public static void player1(char[][] tabuleiro, int contadorJogo,int modoJogo) {

        System.out.println("\n _Player_1");
        char iconePlayer1 = 'X'; // Ícone referente ao player 1

        imprimirTabuleiro(tabuleiro);
        int linha = leiaCoordenadaLinha();// Lê a linha do player1
        int coluna = leiaCoordenadaColuna();// Lê a coluna do player1
        boolean posicaoValida = posicaoValida(linha, coluna, tabuleiro, iconePlayer1);// Verifica se as posições são
                                                                                      // válidas

        while (posicaoValida == false) {// Enqunto for false, chama a função linha e coluna.Após isso, chama a
                                        // posicaoValida para verificar se a posição é válida
            linha = leiaCoordenadaLinha();
            coluna = leiaCoordenadaColuna();
            posicaoValida = posicaoValida(linha, coluna, tabuleiro, iconePlayer1);
        }
        jogadaUsuario(posicaoValida, linha, coluna, tabuleiro, iconePlayer1,modoJogo);

        boolean verificaVencedor = verificaVencedor(tabuleiro, iconePlayer1,modoJogo);
        boolean verificaVencedorGame = verificaVencedorGame(tabuleiro,modoJogo);

        verificaVelha(contadorJogo, verificaVencedor, verificaVencedorGame, tabuleiro, modoJogo);
    }

    public static void player2(char[][] tabuleiro, int contadorJogo, int modoJogo) {
        System.out.println("\n _Player_2");
        char iconePlayer2 = 'O';

        imprimirTabuleiro(tabuleiro);
        int linha = leiaCoordenadaLinha();
        int coluna = leiaCoordenadaColuna();
        boolean posicaoValida = posicaoValida(linha, coluna, tabuleiro, iconePlayer2);

        while (posicaoValida == false) { // Caso seja false, chama a função linha e coluna.Após isso, chama a
                                         // posicaoValida para verificar novamente
            linha = leiaCoordenadaLinha();
            coluna = leiaCoordenadaColuna();
            posicaoValida = posicaoValida(linha, coluna, tabuleiro, iconePlayer2);
        }

        jogadaUsuario(posicaoValida, linha, coluna, tabuleiro, iconePlayer2,modoJogo);

        boolean verificaVencedor = verificaVencedor(tabuleiro, iconePlayer2,modoJogo);
        boolean verificaVencedorGame = verificaVencedorGame(tabuleiro,modoJogo);

        verificaVelha(contadorJogo, verificaVencedor, verificaVencedorGame, tabuleiro, modoJogo);
    }

    public static boolean machineEasy(char[][] tabuleiro, int contadorJogo, int modoJogo) {
        Random random = new Random();
        System.out.println("\nMáquina_amigável");
        char iconMachine = 'O';

        boolean valido = false;
        int linha,coluna;

        boolean playerAndmachineEasy = true;
        
        imprimirTabuleiro(tabuleiro);
       
        while (valido == false) { 
            linha = random.nextInt(9);
            coluna = random.nextInt(9);

            if(posicaoValidaMaquina(linha, coluna, tabuleiro, iconMachine) == true){
                valido = true;
                jogadaUsuario(valido, linha, coluna, tabuleiro, iconMachine,modoJogo);
            }
        }

        System.err.println("A máquina jogou!");
        return playerAndmachineEasy;
    }

    //Verifica se a posição do tabuleiro é válida para poder jogar
    public static boolean posicaoValidaMaquina(int linha, int coluna, char[][] tabuleiro, char iconePlayer){
        boolean validation = false;
        
            for(int i = 0; i < 3; i ++){
                for(int j = 0; j < 3; j ++){
                    if((linha - 1) == i && (coluna - 1) == j){
                        if(tabuleiro[i][j] == '_'){
                            validation = true;
                        }
                        else{
                            validation = false;
                        }
                    }
                }
            }

        return validation;
    }
    public static boolean verificaVencedor(char[][] tabuleiro, char iconePlayer, int modoJogo) {
        // player1 = X
        // player2 = O

        //permissão para adicionar pontos
        int permitionAddPoint1 = 0; //Player1   
        int permitionAddPoint2 = 0; //Player2
        int permitionAddPoint3 = 0; //Player3
        int permitionAddPoint4 = 0; 
        boolean reiniciaPartida = false;

        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == iconePlayer && tabuleiro[i][1] == iconePlayer && tabuleiro[i][2] == iconePlayer
                    || tabuleiro[0][i] == iconePlayer && tabuleiro[1][i] == iconePlayer
                            && tabuleiro[2][i] == iconePlayer
                    || tabuleiro[0][0] == iconePlayer && tabuleiro[1][1] == iconePlayer
                            && tabuleiro[2][2] == iconePlayer
                    || tabuleiro[0][2] == iconePlayer && tabuleiro[1][1] == iconePlayer
                            && tabuleiro[2][0] == iconePlayer) {
                if (iconePlayer == 'X') {
                    System.out.println("Player 1 +1 Point!");
                    permitionAddPoint1++;

                    imprimePontuacao(permitionAddPoint1, permitionAddPoint2, permitionAddPoint3,permitionAddPoint4, modoJogo);

                    boolean verificaVencedorGame = verificaVencedorGame(tabuleiro,modoJogo);

                    if (verificaVencedorGame == true) {
                        reiniciaPartida = false;
                    } else if (verificaVencedorGame == false) {
                        reiniciaPartida = true;
                    } else {
                        System.err.println("Error )=");
                    }

                    reiniciaPartida(reiniciaPartida, tabuleiro, modoJogo);
                    // reiniciar o jogo
                } else if (iconePlayer == 'O') {
                    if(modoJogo == 1){
                        System.out.println("Player 2 +1 Point!");
                        permitionAddPoint2++;
                    }else if(modoJogo == 2){
                        System.out.println("_Máquina amigável +1 Point_");
                        permitionAddPoint3++;
                    }

                    imprimePontuacao(permitionAddPoint1, permitionAddPoint2, permitionAddPoint3, permitionAddPoint4, modoJogo);
                    boolean verificaVencedorGame = verificaVencedorGame(tabuleiro,modoJogo);

                    if (verificaVencedorGame == true) {
                        reiniciaPartida = false;
                    } else if (verificaVencedorGame == false) {
                        reiniciaPartida = true;
                    } else {
                        System.err.println("Error )=");
                    }

                    reiniciaPartida(reiniciaPartida, tabuleiro,modoJogo); // reiniciar o jogo

                } else {
                    System.err.println("Error )=");
                }
            }
        }

        return reiniciaPartida;
    }

    public static boolean verificaVencedorGame(char[][] tabuleiro, int modoJogo) {
        boolean verificaVencedorGame = false;


        if (contadorPoints[0] == 3) {
            verificaVencedorGame = true;
            System.out.println("\n** Player 1 ganhou!!! **");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tabuleiro[i][j] = '_';
                }
            }

            contadorPoints[0] = 0;//Zera a pontuação do player 1
            contadorPoints[1] = 0;//Zera a pontuação do player 2

            main(null); //chama a main para reinição o jogo do zero            

            
        } else if (contadorPoints[1] == 3) {

            verificaVencedorGame = true;
            System.out.println("\n** Player 2 ganhou!!! **");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tabuleiro[i][j] = '_';
                }
            }

            
            contadorPoints[0] = 0;//Zera a pontuação do player 1
            contadorPoints[1] = 0;//Zera a pontuação do player 2

            main(null);//chama a main para reiniciar o jogo do zero
            
        }else if (contadorPoints[2] == 3) {

            verificaVencedorGame = true;
            System.out.println("\n** Máquina amigável ganhou!!! **");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tabuleiro[i][j] = '_';
                }
            }
            
            contadorPoints[0] = 0;//Zera a pontuação do player 1
            contadorPoints[1] = 0;//Zera a pontuação da máquina(fácil) 1
            
            main(null);//chama a main para reiniciar o jogo do zero
            
        }
        return verificaVencedorGame;
    }

    // Verifica se houve velha
    public static void verificaVelha(int contadorJogo, boolean verificaVencedor, boolean verificaVencedorGame, char[][] tabuleiro, int modoJogo) {
        // Reinicia o joga caso o contador seja oito (Todas as possibilidas já forem
        // feitas) e não houver nenhum vencedor de alguma partida e nenhum vencedor do
        // jogo.

        if (contadorJogo == 8 && verificaVencedor == false && verificaVencedorGame == false) {
            System.out.println("VELHA!");
            reiniciaPartida(true, tabuleiro,modoJogo);
        }
    }

    public static void imprimePontuacao(int permitionAddPoint1, int permitionAddPoint2, int permitionAddPoint3, int permitionAddPoint4, int modoJogo) {
        System.out.println("\n_Pontuação_\n");

        if (permitionAddPoint1 == 1) {
            contadorPoints[0] = contadorPoints[0] + 1;
            if(modoJogo == 1){
                System.out.println("Player 1: " + contadorPoints[0]);
                System.out.println("Player 2: " + contadorPoints[1]);
            }else if(modoJogo == 2){
                System.out.println("Player 1: " + contadorPoints[0]);
                System.out.println("Máquina amigável: " + contadorPoints[2]);
            }
        } else if (permitionAddPoint2 == 1) {
            contadorPoints[1] = contadorPoints[1] + 1;
                System.out.println("Player 1: " + contadorPoints[0]);
                System.out.println("Player 2: " + contadorPoints[1]);
        } else if(permitionAddPoint3 == 1){
                contadorPoints[2] = contadorPoints [2] + 1;
                System.out.println("Player 1: " + contadorPoints[0]);
                System.out.println("Máquina amigável: " + contadorPoints[2]);
        }
        else if(permitionAddPoint4 == 1){
            contadorPoints[3] = contadorPoints[3] + 1;
            System.out.println("Player 1: " + contadorPoints[0]);
            System.out.println("Máquina Dificil: " + contadorPoints[2]);
        }
        else{
            System.err.println("* Error *");
        }

    }

    // Reinicia a partida quando algum dos jogadores fizerem ponto
    public static void reiniciaPartida(boolean reiniciaPartida, char[][] tabuleiro, int modoJogo) {
        System.out.println("\nPartida_reiniciada_\n");

        if (reiniciaPartida == true) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tabuleiro[i][j] = '_';
                }
            }
            if(modoJogo == 1){
                modoJogador(tabuleiro,modoJogo);
            }else if(modoJogo == 2){
                modoFacil(tabuleiro, modoJogo);
            }
    }
    }

  // Função que procura a melhor jogada
  public static void MelhorJogada(char[][] tabuleiro, char iconePlayer, int modoJogo) {
    Random random = new Random();
    System.out.println("\nMáquina_Inteligente");

    // Verifica se há uma jogada vencedora disponível
    int[] melhorMovimento = encontraJogadaVencedora(tabuleiro, iconePlayer);
    if (melhorMovimento[0] != -1 && melhorMovimento[1] != -1) {
        tabuleiro[melhorMovimento[0]][melhorMovimento[1]] = iconePlayer;
    } else {
        // Caso não haja uma jogada vencedora, joga aleatoriamente em uma posição vazia
        int linha, coluna;
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (tabuleiro[linha][coluna] != '_');

        tabuleiro[linha][coluna] = iconePlayer;
    }

    imprimirTabuleiro(tabuleiro);
    verificaVencedor(tabuleiro, iconePlayer, modoJogo);
}

public static int[] encontraJogadaVencedora(char[][] tabuleiro, char iconePlayer) {
    // Verifica se há uma jogada vencedora disponível
    int[] movimentoVencedor = {-1, -1};
    char iconeOponente = (iconePlayer == 'X') ? 'O' : 'X';
    
    if(tabuleiro[1][1] == '_'){
        movimentoVencedor[0] = 1;
        movimentoVencedor[1] = 1;
        return movimentoVencedor;
    }

    // Verifica as linhas
    for (int i = 0; i < 3; i++) {
        if ((tabuleiro[i][0] == iconePlayer && tabuleiro[i][1] == iconePlayer && tabuleiro[i][2] == '_') ||
            (tabuleiro[i][0] == iconePlayer && tabuleiro[i][2] == iconePlayer && tabuleiro[i][1] == '_') ||
            (tabuleiro[i][1] == iconePlayer && tabuleiro[i][2] == iconePlayer && tabuleiro[i][0] == '_')) {
            if (tabuleiro[i][0] == '_') {
                movimentoVencedor[0] = i;
                movimentoVencedor[1] = 0;
            } else if (tabuleiro[i][1] == '_') {
                movimentoVencedor[0] = i;
                movimentoVencedor[1] = 1;
            } else if (tabuleiro[i][2] == '_') {
                movimentoVencedor[0] = i;
                movimentoVencedor[1] = 2;
            }
            return movimentoVencedor;
        }
        // Bloqueia o oponente de vencer
        if ((tabuleiro[i][0] == iconeOponente && tabuleiro[i][1] == iconeOponente && tabuleiro[i][2] == '_') ||
            (tabuleiro[i][0] == iconeOponente && tabuleiro[i][2] == iconeOponente && tabuleiro[i][1] == '_') ||
            (tabuleiro[i][1] == iconeOponente && tabuleiro[i][2] == iconeOponente && tabuleiro[i][0] == '_')) {
            if (tabuleiro[i][0] == '_') {
                movimentoVencedor[0] = i;
                movimentoVencedor[1] = 0;
            } else if (tabuleiro[i][1] == '_') {
                movimentoVencedor[0] = i;
                movimentoVencedor[1] = 1;
            } else if (tabuleiro[i][2] == '_') {
                movimentoVencedor[0] = i;
                movimentoVencedor[1] = 2;
            }
            return movimentoVencedor;
        }
    }

    // Verifica as colunas
    for (int i = 0; i < 3; i++) {
        if ((tabuleiro[0][i] == iconePlayer && tabuleiro[1][i] == iconePlayer && tabuleiro[2][i] == '_') ||
            (tabuleiro[0][i] == iconePlayer && tabuleiro[2][i] == iconePlayer && tabuleiro[1][i] == '_') ||
            (tabuleiro[1][i] == iconePlayer && tabuleiro[2][i] == iconePlayer && tabuleiro[0][i] == '_')) {
            if (tabuleiro[0][i] == '_') {
                movimentoVencedor[0] = 0;
                movimentoVencedor[1] = i;
            } else if (tabuleiro[1][i] == '_') {
                movimentoVencedor[0] = 1;
                movimentoVencedor[1] = i;
            } else if (tabuleiro[2][i] == '_') {
                movimentoVencedor[0] = 2;
                movimentoVencedor[1] = i;
            }
            return movimentoVencedor;
        }
        // Bloqueia o oponente de vencer
        if ((tabuleiro[0][i] == iconeOponente && tabuleiro[1][i] == iconeOponente && tabuleiro[2][i] == '_') ||
            (tabuleiro[0][i] == iconeOponente && tabuleiro[2][i] == iconeOponente && tabuleiro[1][i] == '_') ||
            (tabuleiro[1][i] == iconeOponente && tabuleiro[2][i] == iconeOponente && tabuleiro[0][i] == '_')) {
            if (tabuleiro[0][i] == '_') {
                movimentoVencedor[0] = 0;
                movimentoVencedor[1] = i;
            } else if (tabuleiro[1][i] == '_') {
                movimentoVencedor[0] = 1;
                movimentoVencedor[1] = i;
            } else if (tabuleiro[2][i] == '_') {
                movimentoVencedor[0] = 2;
                movimentoVencedor[1] = i;
            }
            return movimentoVencedor;
        }
    }

    // Verifica as diagonais
    if ((tabuleiro[0][0] == iconePlayer && tabuleiro[1][1] == iconePlayer && tabuleiro[2][2] == '_') ||
        (tabuleiro[0][0] == iconePlayer && tabuleiro[2][2] == iconePlayer && tabuleiro[1][1] == '_') ||
        (tabuleiro[1][1] == iconePlayer && tabuleiro[2][2] == iconePlayer && tabuleiro[0][0] == '_')) {
        if (tabuleiro[0][0] == '_') {
            movimentoVencedor[0] = 0;
            movimentoVencedor[1] = 0;
        } else if (tabuleiro[1][1] == '_') {
            movimentoVencedor[0] = 1;
            movimentoVencedor[1] = 1;
        } else if (tabuleiro[2][2] == '_') {
            movimentoVencedor[0] = 2;
            movimentoVencedor[1] = 2;
        }
        return movimentoVencedor;
    }
    // Bloqueia o oponente de vencer nas diagonais
    if ((tabuleiro[0][0] == iconeOponente && tabuleiro[1][1] == iconeOponente && tabuleiro[2][2] == '_') ||
        (tabuleiro[0][0] == iconeOponente && tabuleiro[2][2] == iconeOponente && tabuleiro[1][1] == '_') ||
        (tabuleiro[1][1] == iconeOponente && tabuleiro[2][2] == iconeOponente && tabuleiro[0][0] == '_')) {
        if (tabuleiro[0][0] == '_') {
            movimentoVencedor[0] = 0;
            movimentoVencedor[1] = 0;
        } else if (tabuleiro[1][1] == '_') {
            movimentoVencedor[0] = 1;
            movimentoVencedor[1] = 1;
        } else if (tabuleiro[2][2] == '_') {
            movimentoVencedor[0] = 2;
            movimentoVencedor[1] = 2;
        }
        return movimentoVencedor;
    }
    if ((tabuleiro[0][2] == iconePlayer && tabuleiro[1][1] == iconePlayer && tabuleiro[2][0] == '_') ||
        (tabuleiro[0][2] == iconePlayer && tabuleiro[2][0] == iconePlayer && tabuleiro[1][1] == '_') ||
        (tabuleiro[1][1] == iconePlayer && tabuleiro[2][0] == iconePlayer && tabuleiro[0][2] == '_')) {
        if (tabuleiro[0][2] == '_') {
            movimentoVencedor[0] = 0;
            movimentoVencedor[1] = 2;
        } else if (tabuleiro[1][1] == '_') {
            movimentoVencedor[0] = 1;
            movimentoVencedor[1] = 1;
        } else if (tabuleiro[2][0] == '_') {
            movimentoVencedor[0] = 2;
            movimentoVencedor[1] = 0;
        }
        return movimentoVencedor;
    }
    // Bloqueia o oponente de vencer nas diagonais
    if ((tabuleiro[0][2] == iconeOponente && tabuleiro[1][1] == iconeOponente && tabuleiro[2][0] == '_') ||
        (tabuleiro[0][2] == iconeOponente && tabuleiro[2][0] == iconeOponente && tabuleiro[1][1] == '_') ||
        (tabuleiro[1][1] == iconeOponente && tabuleiro[2][0] == iconeOponente && tabuleiro[0][2] == '_')) {
        if (tabuleiro[0][2] == '_') {
            movimentoVencedor[0] = 0;
            movimentoVencedor[1] = 2;
        } else if (tabuleiro[1][1] == '_') {
            movimentoVencedor[0] = 1;
            movimentoVencedor[1] = 1;
        } else if (tabuleiro[2][0] == '_') {
            movimentoVencedor[0] = 2;
            movimentoVencedor[1] = 0;
        }
        return movimentoVencedor;
    }

    return movimentoVencedor;
}




}
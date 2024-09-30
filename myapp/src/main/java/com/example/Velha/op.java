
public static void MelhorJogada(char[][] tabluleiro, char iconePlayer, int modoJogo) {//retorna a pontuação de uma jogada 
    long SuperScore = -100000000; //guardar o maior pontuação,(qualquer jogada substitui)
    char[] jogada = new char[1];
    int profundidade = 0;

    for (byte i = 0; i < 3; i++) {
        for(byte j = 0; j < 3; j++){
            if(tabluleiro[i][j] == '_'){//casas jogaveis
                tabluleiro[i][j] = 'O';

                long score = MiniMax(tabluleiro, modoJogo, iconePlayer, profundidade);//retorna score dessa jogada

                tabluleiro[i][j] = '_';//limpa a jogada
                if(score > SuperScore){
                    SuperScore = score;
                    jogada[0] = tabluleiro[i];
                    jogada[1] = tabluleiro[j];
                }
            }
        }
    }
    boolean ICasa = posicaoValidaMaquina(jogada);

    if (ICasa == true) {
        jogadaUsuario(jogada[0], jogada[1], tabluleiro, iconePlayer, modoJogo);
    }

}
//Arvore de Posibilidades
public static long MiniMax(char[][] tabluleiro, int modoJogo, char iconePlayer, int profundidade){
    iconePlayer = 'O';
    byte result = UserMachine(tabluleiro, iconePlayer);
    long SuperScore = -100000000; 

    if (result != 0) {
        return result;
    }
    if(isMaximizing){
        for (byte i = 0; i < 3; i++) {
            for(byte j = 0; j < 3; j++){
                if (tabluleiro[i][j] == '_') {
                    tabluleiro[i][j] = 'O';
                    long score = MiniMax(tabluleiro, modoJogo, iconePlayer, profundidade++);
                    tabluleiro[i][j] = '_';
                    SuperScore = max(score, SuperScore);
                }
            }}
            return SuperScore;
    }
    else{ //jogador
        SuperScore = 100000000; 
        for (byte i = 0; i < 3; i++) {
            for(byte j = 0; j < 3; j++){

                if(tabluleiro[i][j] == '_'){
                    tabluleiro[i][j] = 'X';
                    long score = MiniMax(tabluleiro, modoJogo, iconePlayer, profundidade++);

                    tabluleiro[i][j] = '_';
                    SuperScore = min(score, SuperScore);
                }
            }}
            return SuperScore;
    }
}
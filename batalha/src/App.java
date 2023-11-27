import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Grid jogador1;
        int escolha;
        int tamanho;
        int quantNavio;
        int posiX;
        int posiY;
        int portaAviaoX;
        int portaAviaoY;
        int encouracadoX;
        int encouracadoY;
        int destroyerX;
        int destroyerY;
        int submarinoX;
        int submarinoY;
        int direcao;

        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.println("DIGITE 1 PARA INICIAR NOVO JOGO");
                System.out.println("DIGITE 2 PARA SAIR");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("escolha o tamanho do mapa");
                        System.out.println("digite 1 para selecionar mapa padrâo");
                        System.out.println(
                                "Digite 2 para mapa personalizado (Tamanho minimo 7x7. Tamanho maximo 20x20)");
                        escolha = sc.nextInt();
                        switch (escolha) {
                            case 1:
                                System.out.println("mapa 10x10");
                                jogador1 = new Grid();
                                
                                System.out.println("escolha a forma de posicionar os navios do player ");
                                System.out.println("digite 1 para posicionamento aleatorio");
                                System.out.println("digite 2 para posicionamento personalizado");
                                System.out.println("digite 3 para posicionamento intermediario");
                                escolha = sc.nextInt();
                                switch (escolha) {
                                    case 1:
                                        jogador1.gerarNavios();
                                        break;
                                    case 2:
                                        try {
                                            System.out.println("digite a posição na tabela X,Y respectivamente");
                                            System.out.println("porta aviao| 5 celulas");
                                            portaAviaoX = sc.nextInt();
                                            portaAviaoY = sc.nextInt();
                                            System.out.println("escolha o posicionamento");
                                            System.out.println("1. para posicionamento vertical");
                                            System.out.println("2. para posicionamento horizontal");
                                            direcao = sc.nextInt();

                                            jogador1.gerarPortaAvioesManual(portaAviaoX, portaAviaoY, direcao);
                                            
                                        } catch (InputMismatchException e) {
                                            System.out.println("input incorreto");
                                            e.getCause();
                                        }

                                        System.out.println("encouraçado| 4 celulas");
                                        encouracadoX = sc.nextInt();
                                        encouracadoY = sc.nextInt();
                                        System.out.println("escolha o posicionamento");
                                        System.out.println("Digite 1 para posicionamento vertical");
                                        System.out.println("digite 2 para posicionamento horizontal");
                                        direcao = sc.nextInt();
                                        
                                        jogador1.gerarPortaAvioesManual(encouracadoX, encouracadoY, direcao);

                                        System.out.println("destroyer| 3 celulas");
                                        destroyerX = sc.nextInt();
                                        destroyerY = sc.nextInt();
                                        System.out.println("escolha o posicionamento");
                                        System.out.println("Digite 1 para posicionamento vertical");
                                        System.out.println("Digite 2 para posicionamento horizontal");
                                        direcao = sc.nextInt();

                                        jogador1.gerarDestroyerManual(destroyerX, destroyerY, direcao);
                                        

                                        System.out.println("submarino| 2 celulas");
                                        submarinoX = sc.nextInt();
                                        submarinoY = sc.nextInt();
                                        System.out.println("escolha o posicionamento");
                                        System.out.println("Digite 1 para posicionamento vertical");
                                        System.out.println("Digite 2 para posicionamento horizontal");
                                        direcao = sc.nextInt();

                                        jogador1.gerarSubmarinoManual(submarinoX, submarinoY, direcao);
                                        

                                        break;
                                    case 3:
                                        System.out.println("escolha sua frota");
                                        System.out.println("Voce pode escolher apenas uma frota");
                                        System.out.println("1. para porta aviao");
                                        System.out.println("2. para encouraçado");
                                        System.out.println("3. para destroyer");
                                        System.out.println("4. para submarino");
                                        escolha = sc.nextInt();
                                        switch (escolha) {
                                            case 1:
                                                System.out.println("porta aviao| 5 celulas");
                                                portaAviaoX = sc.nextInt();
                                                portaAviaoY = sc.nextInt();
                                                System.out.println("escolha o posicionamento");
                                                System.out.println("Digite 1 para posicionamento vertical");
                                                System.out.println("Digite 2 para posicionamento horizontal");
                                                direcao = sc.nextInt();
                                                
                                                jogador1.gerarPortaAvioesManual(portaAviaoX, portaAviaoY, direcao);

                                                break;
                                            case 2:
                                                System.out.println("encouraçado| 4 celulas");
                                                encouracadoX = sc.nextInt();
                                                encouracadoY = sc.nextInt();
                                                System.out.println("escolha o posicionamento");
                                                System.out.println("Digite 1 para posicionamento vertical");
                                                System.out.println("Digite 2 para posicionamento horizontal");
                                                direcao = sc.nextInt();

                                                jogador1.gerarEncouracadoManual(encouracadoX, encouracadoY, direcao);
                                                
                                                break;
                                            case 3:
                                                System.out.println("destroyer| 3 celulas");
                                                destroyerX = sc.nextInt();
                                                destroyerY = sc.nextInt();
                                                System.out.println("escolha o posicionamento");
                                                System.out.println("Digite 1 para posicionamento vertical");
                                                System.out.println("Digite 2 para posicionamento horizontal");
                                                direcao = sc.nextInt();

                                                jogador1.gerarDestroyerManual(destroyerX, destroyerY, direcao);
                                                
                                                break;

                                            case 4:
                                                System.out.println("submarino| 2 celulas");
                                                submarinoX = sc.nextInt();
                                                submarinoY = sc.nextInt();
                                                System.out.println("escolha o posicionamento");
                                                System.out.println("Digite 1 para posicionamento vertical");
                                                System.out.println("Digite 2 para posicionamento horizontal");
                                                direcao = sc.nextInt();
                                                
                                                jogador1.gerarSubmarinoManual(submarinoX, submarinoY, direcao);
                                                break;
                                            default:
                                                break;
                                        }

                                        break;
                                    default:
                                        break;
                                }
                                
                                break;
                            case 2:
                                do {
                                    System.out.println("Digite 2 para mapa personalizado (Tamanho minimo 7x7. Tamanho maximo 20x20)");
                                    tamanho = sc.nextInt();
                                } while (tamanho < 7 || tamanho > 20);
                                
                                System.out.println("escolha a forma de posicionar os navios do player ");
                                System.out.println("Digite 1 para posicionamento aleatorio");
                                System.out.println("Digite 2 para posicionamento personalizado");
                                System.out.println("Digite 3 para posicionamento intermediario");
                                escolha = sc.nextInt();
                                switch (escolha) {
                                    case 1:
                                        //aleatorio
                                        break;
                                    case 2:
                                        try {
                                            System.out.println("digite a posição na tabela X,Y respectivamente");
                                            System.out.println("porta aviao| 5 celulas");
                                            portaAviaoX = sc.nextInt();
                                            portaAviaoY = sc.nextInt();
                                            System.out.println("escolha o posicionamento");
                                            System.out.println("1. para posicionamento vertical");
                                            System.out.println("digite 2 para posicionamento horizontal");
                                            direcao = sc.nextInt();
                                            
                                        } catch (InputMismatchException e) {
                                            System.out.println("input incorreto");
                                            e.getCause();
                                        }

                                        System.out.println("encouraçado| 4 celulas");
                                        encouracadoX = sc.nextInt();
                                        encouracadoY = sc.nextInt();
                                        System.out.println("escolha o posicionamento");
                                        System.out.println("Digite 1 para posicionamento vertical");
                                        System.out.println("digite 2 para posicionamento horizontal");
                                        direcao = sc.nextInt();
                                        

                                        System.out.println("destroyer| 3 celulas");
                                        destroyerX = sc.nextInt();
                                        destroyerY = sc.nextInt();
                                        System.out.println("escolha o posicionamento");
                                        System.out.println("Digite 1 para posicionamento vertical");
                                        System.out.println("Digite 2 para posicionamento horizontal");
                                        direcao = sc.nextInt();
                                        

                                        System.out.println("submarino| 2 celulas");
                                        submarinoX = sc.nextInt();
                                        submarinoY = sc.nextInt();
                                        System.out.println("escolha o posicionamento");
                                        System.out.println("Digite 1 para posicionamento vertical");
                                        System.out.println("Digite 2 para posicionamento horizontal");
                                        direcao = sc.nextInt();
                                        

                                        break;
                                    case 3:
                                        System.out.println("escolha sua frota");
                                        System.out.println("Voce pode escolher apenas uma frota");
                                        System.out.println("1. para porta aviao");
                                        System.out.println("2. para encouraçado");
                                        System.out.println("3. para destroyer");
                                        System.out.println("4. para submarino");
                                        escolha = sc.nextInt();
                                        switch (escolha) {
                                            case 1:
                                                System.out.println("porta aviao| 5 celulas");
                                                portaAviaoX = sc.nextInt();
                                                portaAviaoY = sc.nextInt();
                                                System.out.println("escolha o posicionamento");
                                                System.out.println("Digite 1 para posicionamento vertical");
                                                System.out.println("Digite 2 para posicionamento horizontal");
                                                direcao = sc.nextInt();
                                                
                                                break;
                                            case 2:
                                                System.out.println("encouraçado| 4 celulas");
                                                encouracadoX = sc.nextInt();
                                                encouracadoY = sc.nextInt();
                                                System.out.println("escolha o posicionamento");
                                                System.out.println("Digite 1 para posicionamento vertical");
                                                System.out.println("Digite 2 para posicionamento horizontal");
                                                direcao = sc.nextInt();
                                                
                                                break;
                                            case 3:
                                                System.out.println("destroyer| 3 celulas");
                                                destroyerX = sc.nextInt();
                                                destroyerY = sc.nextInt();
                                                System.out.println("escolha o posicionamento");
                                                System.out.println("Digite 1 para posicionamento vertical");
                                                System.out.println("Digite 2 para posicionamento horizontal");
                                                direcao = sc.nextInt();
                                                
                                                break;

                                            case 4:
                                                System.out.println("submarino| 2 celulas");
                                                submarinoX = sc.nextInt();
                                                submarinoY = sc.nextInt();
                                                System.out.println("escolha o posicionamento");
                                                System.out.println("Digite 1 para posicionamento vertical");
                                                System.out.println("Digite 2 para posicionamento horizontal");
                                                direcao = sc.nextInt();
                                                
                                                break;
                                            default:
                                                break;
                                        }

                                        break;
                                    default:
                                        break;
                                }
                            

                        }

                        break;
                    default:
                        break;
                }

            } while (escolha < 1);
        } catch (InputMismatchException e) {
            System.out.println("entrada incorreta");
            e.getCause();
        } catch (NumberFormatException e) {
            System.out.println("entrada incorreta");
            e.getCause();
        }

    }
}

package chapter1.OneRowNim;

public class OneRowNim {
    private Integer nSticks = 7;
    private Integer player = 1;


    OneRowNim(){
        System.out.println("Novo jogo! O total de sticks é " + this.nSticks + ".");
    };

    public void takeOne(){
        System.out.println("Jogador " + this.player + " removeu 1 stick.");
        changePlayer();
        nSticks--;
        report();

    };

    public void takeTwo(){
        System.out.println("Jogador " + this.player + " removeu 2 sticks.");
        changePlayer();
        nSticks--;
        nSticks--;
        report();

    };
    public void takeThree(){
        System.out.println("Jogador " + this.player + " removeu 3 sticks.");
        this.changePlayer();
        this.nSticks--;
        this.nSticks--;
        this.nSticks--;
        this.report();

    };

    public int report(){
        System.out.println("O total de sticks é: " + this.nSticks + ".");
        System.out.println("É a vez do jogador " + this.player + ".");
        return this.nSticks;
        };

    private void changePlayer(){
        this.player = this.player == 1 ? 2 : 1;
    }

    public static void main(String[] args) {
        OneRowNim newgame = new OneRowNim();
        newgame.takeOne();
        newgame.takeTwo();
        newgame.takeThree();

    }



}

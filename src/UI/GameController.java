package UI;

public class GameController {

    Player player1;
    Player player2;
    Boolean running;

    public GameController() {
        this.startGame();
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    /**
     * Starts the game, initializes players as null.
     */
    private void startGame()
    {
        this.player1 = null;
        this.player2 = null;
        this.running = true;
    }

    /**
     * Stops Game
     */
    private void stopGame()
    {
        this.running = false;
    }
}

package UI;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame() throws HeadlessException {

        this.setTitle("Game World");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(800, 800));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        GameController gameController = new GameController();
        if(gameController.getPlayer1() == null)
        {
            this.add(new IntroPanel());
        }
    }

}

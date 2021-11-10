package UI.Labels;

import javax.swing.*;
import java.awt.*;

public class GameIntroLabel extends JLabel {

    public GameIntroLabel() {
        this.setMinimumSize(new Dimension(800, 200));
        this.setBorder(BorderFactory.createCompoundBorder());
        this.setBackground(Color.WHITE);
        this.setVerticalTextPosition(0);
        this.setVisible(true);
    }
}

package UI;

import UI.Labels.GameIntroLabel;

import javax.swing.*;
import java.awt.*;

public class IntroPanel extends JPanel {

    GameIntroLabel introLabel;

    public IntroPanel() {
        this.setBackground(Color.BLACK);
        this.introLabel = new GameIntroLabel();
    }


}

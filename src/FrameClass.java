import javax.swing.*;

/**
 * author smokeed_
 * project Snake
 */

public class FrameClass extends JFrame {
    FrameClass() {
        Game game = new Game();
        this.add(new Game());
        this.setTitle("Змейка");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

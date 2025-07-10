package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

public class PingPong extends JPanel implements KeyListener, ActionListener {
    private int paddle1Y = 160, paddle2Y = 160;
    private int ballX = 200, ballY = 200;
    private int ballDirectionX = 20, ballDirectionY = 20;
    private Timer timer;
    private BufferedImage ballImage;
    private BufferedImage paddleImage;

    public PingPong() {
        setFocusable(true);
        addKeyListener(this);
        timer = new Timer(5, this);
        timer.start();

        try {
            ballImage = ImageIO.read(new File("C:\\Users\\NITRO\\Downloads\\valu.png")); // Load your PNG file here
            paddleImage = ImageIO.read(new File("C:\\Users\\NITRO\\Downloads\\bear.jpg")); // Load paddle PNG file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        if (paddleImage != null) {
            g.drawImage(paddleImage, 20, paddle1Y, 10, 80, this);
            g.drawImage(paddleImage, getWidth() - 30, paddle2Y, 10, 80, this);
        } else {
            g.setColor(Color.WHITE);
            g.fillRect(20, paddle1Y, 10, 80);
            g.fillRect(getWidth() - 30, paddle2Y, 10, 80);
        }

        if (ballImage != null) {
            g.drawImage(ballImage, ballX, ballY, 100, 100, this);
        } else {
            g.fillOval(ballX, ballY, 100, 100);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballX += ballDirectionX;
        ballY += ballDirectionY;

        if (ballY <= 0 || ballY >= getHeight() - 100) {
            ballDirectionY = -ballDirectionY;
        }

        if (ballX <= 30 && ballY + 100 >= paddle1Y && ballY <= paddle1Y + 80 ||
                ballX + 100 >= getWidth() - 40 && ballY + 100 >= paddle2Y && ballY <= paddle2Y + 80) {
            ballDirectionX = -ballDirectionX;
        }

        if (ballX < 0 || ballX > getWidth()) {
            ballX = getWidth() / 2;
            ballY = getHeight() / 2;
            ballDirectionX = 2;
            ballDirectionY = 2;
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W && paddle1Y > 0) {
            paddle1Y -= 10;
        }
        if (e.getKeyCode() == KeyEvent.VK_S && paddle1Y < getHeight() - 80) {
            paddle1Y += 10;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP && paddle2Y > 0) {
            paddle2Y -= 10;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN && paddle2Y < getHeight() - 80) {
            paddle2Y += 10;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ping Pong");
        PingPong game = new PingPong();
        frame.add(game);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

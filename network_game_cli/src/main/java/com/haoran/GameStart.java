package com.haoran;

import com.haoran.scene.Home;
import com.haoran.scene.Scene;
import com.haoran.scene.Street;
import com.haoran.spirit.biology.Hero;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class GameStart extends JPanel {

    static Hero hero;

    static Timer timer = new Timer();

    private static JFrame frame = new JFrame("游戏");

    public static Scene mainScene;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        try {
            mainScene.update(16);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        mainScene.draw(g);
    }

    public static void main(String[] args) throws InterruptedException {
        GameStart gameStart = new GameStart();
        frame.add(gameStart); // 将面板添加到JFrame中
        hero = new Hero();
        updateScene(new Home(hero));
        gameStart.action();

        frame.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                System.out.println("keyTyped");
            }

            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        GameStart.hero.directX = -1;
                        break;
                    case KeyEvent.VK_RIGHT:
                        GameStart.hero.directX = 1;
                        break;
                    case KeyEvent.VK_UP:
                        GameStart.hero.directY = -1;
                        break;
                    case KeyEvent.VK_DOWN:
                        GameStart.hero.directY = 1;
                        break;
                }
            }

            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (GameStart.hero.directX == -1) {
                            GameStart.hero.directX = 0;
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (GameStart.hero.directX == 1) {
                            GameStart.hero.directX = 0;
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if (GameStart.hero.directY == -1) {
                            GameStart.hero.directY = 0;
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if (GameStart.hero.directY == 1) {
                            GameStart.hero.directY = 0;
                        }
                        break;
                }

            }
        });
//        Thread.sleep(4000);
//        updateScene(new Street());
    }

    public static void updateScene(Scene scene) {
        mainScene = scene; // 面板对象
        frame.setSize(500, 500); // 设置大小
//        frame.setAlwaysOnTop(true); // 设置其总在最上
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 默认关闭操作
//        frame.setLocationRelativeTo(null); // 设置窗体初始位置
        frame.setVisible(true); // 尽快调用paint
    }

    public void action() {

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                repaint(); // 重绘，调用paint()方法
            }
        }, 16, 16);
    }
}

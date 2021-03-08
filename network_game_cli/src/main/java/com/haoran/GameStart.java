package com.haoran;

import com.haoran.scene.Home;
import com.haoran.scene.Scene;
import com.haoran.scene.Street;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

public class GameStart extends JPanel {

    static Timer timer = new Timer();

    private static JFrame frame = new JFrame("游戏");

    public static Scene mainScene;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        mainScene.update(16);
        mainScene.draw(g);
    }

    public static void main(String[] args) throws InterruptedException {
        GameStart gameStart = new GameStart();
        frame.add(gameStart); // 将面板添加到JFrame中
        updateScene(new Home());
        gameStart.action();

//        Thread.sleep(4000);
//        updateScene(new Street());
    }

    public static void updateScene(Scene scene) {
        mainScene = scene; // 面板对象
        frame.setSize(500, 500); // 设置大小
//        frame.setAlwaysOnTop(true); // 设置其总在最上
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 默认关闭操作
        frame.setLocationRelativeTo(null); // 设置窗体初始位置
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

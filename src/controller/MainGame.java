//File tạo màn hình chính
package controller;

import controller.EnemyEnvironmentComponent;
import controller.EnemyComponent;
import controller.BoatComponent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import model.Constants;
import model.UrlConstants;
import model.DirectionEnum;
import controller.GameKeyEventListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import view.BoatMenu;
import view.WallComponent;

public class MainGame extends JPanel {
    private static final long serialVersionUID = 1L;
    private WallComponent wall;
    private BoatComponent boat;
    private EnemyComponent enemy;
    private EnemyEnvironmentComponent fireBall;
    private GameKeyEventListener keyEventListener;
    private BoatMenu menu;
    private boolean isPlayingGame;

    public MainGame() {
        this.initBoard();
    }

    private void initBoard() {
	this.setBackground(Color.black);
	this.setFocusable(true);
	this.setPreferredSize(new Dimension(Constants.BOARD_WITH, Constants.BOARD_HEIGHT));
	this.setLayout(null);
	keyEventListener = new GameKeyEventListener(DirectionEnum.NONE);
	this.addKeyListener(keyEventListener);
	this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER && !isPlayingGame && menu.isReady()) {
                    removeAll();
                    initAttribute();
                    //Sound
                    try {
                        File f = new File("res/sounds/start.wav");
                        AudioInputStream audio = AudioSystem.getAudioInputStream(f);
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(MainGame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } 
        });
	this.initAttribute();
    }

    private void initAttribute() {
        this.isPlayingGame = false;
	this.addWall();
	this.addBoat();
	this.addEnemy();
	this.addFireBall();
	this.addMenu();
    }
	
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
	this.doDrawing(g);
    }

    private void doDrawing(Graphics g) {
        if(!menu.isReady()) {
            this.drawReadyGame(g);
	} else {
            if(!isPlayingGame) {
                isPlayingGame = true;
                activeGamePlay();
            }
            if(this.boat.isGameOverStatus()) {
                fireBall.destroy();
                enemy.setDestroy();
                isPlayingGame = false;
                menu.gameOver(g, enemy.getScore(), wall, UrlConstants.GAME_OVER_URL);
            } else if(this.enemy.isWinStatus()) {
                boat.getBulletComponent().destroy();
                boat.destroy();
                fireBall.destroy();
                isPlayingGame = false;
                menu.gameOver(g, enemy.getScore(), wall, UrlConstants.WON_URL);
            } else {
                checkCollision();
                this.drawWall(g);
                this.drawBoat(g);
                this.drawEnemy(g);
                this.drawFireBall(g);
            }
	}
    }

    private void drawWall(Graphics g) {
        wall.draw(g);
    }
	
    private void drawBoat(Graphics g) {
        boat.draw(g);
    }
	
    private void drawEnemy(Graphics g) {
	enemy.draw(g);
    }
	
    private void drawFireBall(Graphics g) {
	fireBall.draw(g);
    }
	
    private void drawReadyGame(Graphics g) {
	menu.drawStartGame(g, wall, boat);
    }
	
    private void checkCollision() {
	enemy.checkCollision(boat.getBulletComponent());
	boat.checkCollision(enemy);
	boat.checkCollisionFireBall(fireBall);
    }
	
    private void addBoat() {
	boat = new BoatComponent(Constants.STEP_DISTANCE);
	boat.setLocation(Constants.BOAT_POSITION_X_BEGIN, Constants.BOAT_POSITION_Y);
        this.add(boat);
        boat.initBoat();
        boat.setKeyEventListener(this.keyEventListener);
    }
	
    private void addEnemy() {
        enemy = new EnemyComponent(Constants.STEP_DISTANCE);
        enemy.setLocation(Constants.X_BEGIN, Constants.Y_BEGIN);
        this.add(enemy);
    }
	
    private void addFireBall() {
        fireBall = new EnemyEnvironmentComponent(Constants.STEP_DISTANCE);
	fireBall.setBoat(this.boat);
	this.add(fireBall);
    }
	
    private void addWall() {
	wall = new WallComponent(Constants.WALL_SIZE);
	wall.setBounds(0, 0, Constants.BOARD_WITH, Constants.BOARD_HEIGHT);
        this.add(wall);
        wall.initWall();
    }
	
    private void addMenu() {
        menu = new BoatMenu();
        this.add(menu);
        activeGameReady();
    }
	
    private void activeGameReady() {
	menu.active();
    }
	
    private void activeGamePlay() {
	boat.active();
	enemy.active();
	fireBall.active();
    }
}

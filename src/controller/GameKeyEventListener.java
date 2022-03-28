//File xử lý các thao tác trong game
package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import model.DirectionEnum;

public class GameKeyEventListener extends KeyAdapter {
    private DirectionEnum direction;

    public GameKeyEventListener(DirectionEnum direction) {
        super();
	this.direction = direction;
    }

    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
	if(key == KeyEvent.VK_LEFT) {
            direction = DirectionEnum.LEFT;
	}
	if(key == KeyEvent.VK_RIGHT) {
            direction = DirectionEnum.RIGHT;
	}
    }
	
    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT) {
            direction = DirectionEnum.NONE;
        }
        if(key == KeyEvent.VK_RIGHT) {
            direction = DirectionEnum.NONE;
        }
    }
}
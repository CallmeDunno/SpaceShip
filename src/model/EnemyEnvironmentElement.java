//File phần tử môi trường game
package model;

import model.UnitGameObject;
import model.UrlConstants;
import model.ImageUtils;

public class EnemyEnvironmentElement extends UnitGameObject {
    public EnemyEnvironmentElement(int x, int y, int width, int height) {
        super(ImageUtils.generateImageFromUrl(UrlConstants.FIRE_BALL_URL), x, y, width, height);
    }
}

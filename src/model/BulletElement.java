//File phần tử lazer - đạn
package model;

import model.UnitGameObject;
import model.UrlConstants;
import model.ImageUtils;

public class BulletElement extends UnitGameObject {
    public BulletElement(int x, int y, int width, int height) {
        super(ImageUtils.generateImageFromUrl(UrlConstants.BULLET), x, y, width, height);
    }
}

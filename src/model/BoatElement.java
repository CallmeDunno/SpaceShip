//File phi thuyền
package model;

import model.UnitGameObject;
import model.UrlConstants;
import model.ImageUtils;

public class BoatElement extends UnitGameObject {
    public BoatElement(int x, int y, int width, int height) {
        super(ImageUtils.generateImageFromUrl(UrlConstants.ARMOR), x, y, width, height);
    }
}

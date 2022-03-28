//File đối tượng thực thể ngoài hành tinh
package model;

import model.UnitGameObject;
import model.UrlConstants;
import model.ImageUtils;

public class EnenyElement extends UnitGameObject {
    public EnenyElement(int x, int y, int width, int height) {
        super(ImageUtils.generateImageFromUrl(UrlConstants.ENEMY_PART_URL), x, y, width, height);
    }
}

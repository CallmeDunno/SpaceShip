//File phần tử tường
package model;

public class WallElement extends UnitGameObject {
    public WallElement(int x, int y, int width, int height) {
        super(ImageUtils.generateImageFromUrl(UrlConstants.WALL_URL), x, y, width, height);
    }
}

package ru.df5.game;


import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.df5.game.engine.Sprite;
import ru.df5.game.engine.math.Rect;

public class Background extends Sprite {

    public Background(TextureRegion region) {
        super(region);
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(worldBounds.getHeight());
        pos.set(worldBounds.pos);
    }
}

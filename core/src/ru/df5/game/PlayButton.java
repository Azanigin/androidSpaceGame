package ru.df5.game;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.df5.game.engine.Sprite;
import ru.df5.game.engine.math.Rect;

public class PlayButton extends Sprite {

    public PlayButton (TextureRegion region) {
        super(region);
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(worldBounds.getHalfHeight()/10);

        pos.set(0.55f,-0.40f);
    }
}

package ru.df5.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.df5.game.engine.Base2DScreen;

public class MenuScreen extends Base2DScreen {

    private SpriteBatch batch;
    private Texture background;
    Texture img;
    int startX;
    int startY;
    int finishX;
    int finishY;
    int gamespeed = 5;

    public MenuScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();
        batch = new SpriteBatch();
        img = new Texture("spaceship.png");
        background = new Texture("space.jpg");
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(0.39f, 0.22f, 0.189f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(background, 0, 0);
        if (startX < finishX) startX +=gamespeed;
        if (startX > finishX) startX -=gamespeed;
        if (startY < finishY) startY +=gamespeed;
        if (startY > finishY) startY -=gamespeed;
        batch.draw(img, startX, startY);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        background.dispose();
        super.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        // "70" - подравнял немного к центру курсора
        finishX = screenX-70;
        finishY = Gdx.graphics.getHeight()-screenY-70;
            return super.touchDown(screenX, screenY, pointer, button);
        }
}


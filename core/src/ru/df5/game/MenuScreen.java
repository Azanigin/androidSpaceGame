package ru.df5.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.df5.game.engine.Base2DScreen;
import ru.df5.game.engine.math.Rect;

public class MenuScreen extends Base2DScreen {

//    private SpriteBatch batch;
    private Background background;
    private Texture backgroundTexture;
    private PlayButton playButton;
    private Texture playButtonTexture;

    private ExitButton exitButton;
    private Texture exitButtonTexture;
//    Texture img;
//    int startX;
//    int startY;
//    int finishX;
//    int finishY;
//    int gamespeed = 5;

    public MenuScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();
        backgroundTexture = new Texture("space.jpg");
        background = new Background(new TextureRegion(backgroundTexture));
        playButtonTexture = new Texture("start.png");
        playButton = new PlayButton(new TextureRegion(playButtonTexture));
        exitButtonTexture = new Texture("close_green.png");
        exitButton = new ExitButton(new TextureRegion(exitButtonTexture));
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(0.39f, 0.22f, 0.189f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        background.draw(batch);
        playButton.draw(batch);
        exitButton.draw(batch);
        batch.end();
    }

    protected void resize(Rect worldBounds) {
        super.resize(worldBounds);
        background.resize(worldBounds);
        playButton.resize(worldBounds);
        exitButton.resize(worldBounds);
    }

    @Override
    public void dispose() {
        batch.dispose();
        backgroundTexture.dispose();
        playButtonTexture.dispose();
        exitButtonTexture.dispose();
        super.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
            return super.touchDown(screenX, screenY, pointer, button);
        }
}


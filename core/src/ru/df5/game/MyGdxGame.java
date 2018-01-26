package ru.df5.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture imgspace;
	int x;
	int y;

	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("spaceship.png");
		imgspace = new Texture("space.jpg");
	}

	@Override
	public void render() {
//		Gdx.gl.glClearColor(0.39f, 0.22f, 0.189f, 1);
        batch.begin();
        batch.draw(imgspace,0,0);
        x++;
        y++;
		batch.draw(img, x, y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}

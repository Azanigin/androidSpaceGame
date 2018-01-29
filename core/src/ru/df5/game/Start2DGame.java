package ru.df5.game;

import com.badlogic.gdx.Game;


public class Start2DGame extends Game {
    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }
}

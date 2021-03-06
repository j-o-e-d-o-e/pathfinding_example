package net.joedoe.pathfinding.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.joedoe.GameInfo;
import net.joedoe.GameMain;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Mice in a Maze";
        config.width = GameInfo.MAP_WIDTH_PX;
        config.height = GameInfo.MAP_HEIGHT_PX;
        new LwjglApplication(new GameMain(), config);
    }
}

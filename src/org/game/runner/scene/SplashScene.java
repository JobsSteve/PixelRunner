/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.game.runner.scene;

import org.andengine.entity.scene.background.AutoParallaxBackground;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.scene.background.ParallaxBackground;
import org.andengine.entity.scene.background.ParallaxBackground.ParallaxEntity;
import org.andengine.entity.sprite.Sprite;
import org.andengine.entity.text.Text;
import org.andengine.util.adt.color.Color;
import org.game.runner.base.BaseScene;
import org.game.runner.manager.SceneManager.SceneType;

/**
 *
 * @author Karl
 */
public class SplashScene extends BaseScene{
    private Sprite headphones;
    
    @Override
    public void createScene() {
        this.setBackground(new Background(Color.BLACK));
        attachChild(new Text(this.camera.getWidth()/2, this.camera.getHeight()/2, resourcesManager.fontPixel_60, "LOADING...", vbom));
        this.headphones = new Sprite(170, 60, this.resourcesManager.splashHeadphones, this.vbom);
        this.headphones.setScale(4);
        attachChild(this.headphones);
        attachChild(new Text(434, 70, resourcesManager.fontPixel_34, "FOR MAXIMUM AWESOME,", vbom));
        attachChild(new Text(434, 40, resourcesManager.fontPixel_34, "HEADPHONES RECOMMENDED.", vbom));
    }

    @Override
    public void onBackKeyPressed() {
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onResume() {
    }

    @Override
    public SceneType getSceneType() {
        return SceneType.SCENE_SPLASH;
    }

    @Override
    public void disposeScene() {
        this.headphones.detachSelf();
        this.headphones.dispose();
        this.detachSelf();
        this.dispose();
    }
    
}
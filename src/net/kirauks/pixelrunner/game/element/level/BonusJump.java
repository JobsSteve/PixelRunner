/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.kirauks.pixelrunner.game.element.level;

import org.andengine.entity.modifier.AlphaModifier;
import org.andengine.entity.primitive.Rectangle;
import org.andengine.entity.shape.Shape;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.adt.color.Color;
import net.kirauks.pixelrunner.game.Player;

/**
 *
 * @author Karl
 */
public class BonusJump extends LevelElement{
    public BonusJump(int level){
        super(level, BONUS_WIDTH, BONUS_HEIGHT);
    }
    
    @Override
    public Color getColor() {
        return Color.BLUE;
    }

    @Override
    protected Shape buildShape(float pX, float pY, VertexBufferObjectManager pVertexBufferObjectManager, final Player player) {
        return new Rectangle(pX, pY, this.getWidth(), this.getHeight(), pVertexBufferObjectManager);
    }

    @Override
    protected void playerAction(Player player) {
        player.resetBonus();
        player.setColor(this.getColor());
        player.setJumpMode(Player.JumpMode.INFINITE);
        this.getBuildedShape().registerEntityModifier(new AlphaModifier(0.5f, 1f, 0f));
    }
}

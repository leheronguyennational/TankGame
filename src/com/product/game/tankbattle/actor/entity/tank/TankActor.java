package com.product.game.tankbattle.actor.entity.tank;

import org.andengine.entity.sprite.AnimatedSprite;

import com.product.game.tankbattle.actor.base.TBActor;
import com.product.game.tankbattle.actor.entity.bullet.BulletActor;
import com.product.game.tankbattle.actor.factory.BulletFactory;
import com.product.game.tankbattle.pool.PoolManager;
import com.product.game.tankbattle.resource.GameResource;

public class TankActor extends TBActor{
	
	@Override
	public AnimatedSprite getEngineEntity() {
		return (AnimatedSprite)super.getEngineEntity();
	}
	
	
	public void fireBullet() {
		
		if (!couldBeAttack()) {
			return;
		}
		
		if (mScene == null) {
			return;
		}
		
		BulletActor bullet = this.makeTankBullet();
				
		switch (direction) {
		case Down:
			bullet.flyDown();
			break;
		case Left:
			bullet.flyLeft();
			break;
		case Up:
			bullet.flyUp();
			break;
		case Right:
			bullet.flyRight();
			break;

		default:
			break;
		}
	}
	
	private BulletActor makeTankBullet() {
		BulletActor bullet = PoolManager.getInstance().getBullet();
		bullet.setPosition(getX() + getWidth() / 2  - bullet.getWidth()/2 , 
				getY() + getHeight()/2 - bullet.getHeight()/2);
		return bullet;
	}
	
}

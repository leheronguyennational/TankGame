package com.product.game.tankbattle.actor.setting;

import com.product.game.tankbattle.actor.base.BaseTBSetting;
import com.product.game.tankbattle.actor.base.TBActor.ACTOR_TYPE;
import com.product.game.tankbattle.config.GameConfiguration;
import com.product.game.tankbattle.resolution.Resolution;
import com.product.game.tankbattle.resource.GameResource;
import com.product.game.tankbattle.resource.sprite.BaseSpriteManager;

public class BulletSetting implements BaseTBSetting{

	@Override
	public int getDefaultHitPoint() {
		return 1;
	}

	@Override
	public float getDefaultSpeed() {
		return 500;
	}

	@Override
	public int getDefaultLevel() {
		return 1;
	}

	@Override
	public int getStepDistance() {
		return Resolution.BULLET_STEP;
	}

	@Override
	public ACTOR_TYPE getActorType() {
		return ACTOR_TYPE.Bullet;
	}

	@Override
	public BaseSpriteManager getSpriteManager() {
		return GameResource.getInstance().bullet;
	}

	@Override
	public float getDefaultAttackFPS() {
		return 0;
	}

	@Override
	public int getActorWidth() {
		return Resolution.BULLET_W;
	}

	@Override
	public int getActorHeight() {
		return Resolution.BULLET_H;
	}

}

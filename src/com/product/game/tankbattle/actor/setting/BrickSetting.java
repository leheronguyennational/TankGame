package com.product.game.tankbattle.actor.setting;

import com.product.game.tankbattle.actor.base.BaseTBSetting;
import com.product.game.tankbattle.actor.base.TBActor.ACTOR_TYPE;
import com.product.game.tankbattle.resolution.Resolution;
import com.product.game.tankbattle.resource.GameResource;
import com.product.game.tankbattle.resource.sprite.BaseSpriteManager;

public class BrickSetting implements BaseTBSetting{

	@Override
	public int getDefaultHitPoint() {
		return 1;
	}

	@Override
	public float getDefaultSpeed() {
		return 0;
	}

	@Override
	public int getDefaultLevel() {
		return 1;
	}

	@Override
	public int getStepDistance() {
		return 0;
	}

	@Override
	public ACTOR_TYPE getActorType() {
		return ACTOR_TYPE.Brick;
	}

	@Override
	public float getDefaultAttackFPS() {
		return 0;
	}

	@Override
	public BaseSpriteManager getSpriteManager() {
		return GameResource.getInstance().brick;
	}

	@Override
	public int getActorWidth() {
		return Resolution.BRICK_W;
	}

	@Override
	public int getActorHeight() {
		return Resolution.BRICK_H;
	}

}

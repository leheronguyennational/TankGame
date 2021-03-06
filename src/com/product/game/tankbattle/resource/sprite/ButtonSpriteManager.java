package com.product.game.tankbattle.resource.sprite;

import com.product.game.tankbattle.actor.base.TBActor.ACTOR_DIRECTION;

public class ButtonSpriteManager extends BaseSpriteManager{

	@Override
	public int getFrameNumbers() {
		return 1;
	}

	@Override
	public String getGFXResourcePath() {
		return "fire_sprite.png";
	}

	@Override
	public int getFrameWidth() {
		return 100;
	}

	@Override
	public int getFrameHeight() {
		return 100;
	}

	@Override
	public float getRotateLeftAngle() {
		return 0;
	}

	@Override
	public float getRotateRightAngle() {
		return 0;
	}

	@Override
	public float getRotateUpAngle() {
		return 0;
	}

	@Override
	public float getRotateDownAngle() {
		return 0;
	}

	@Override
	public ACTOR_DIRECTION getDefaultDirection() {
		return ACTOR_DIRECTION.Unknow;
	}

}

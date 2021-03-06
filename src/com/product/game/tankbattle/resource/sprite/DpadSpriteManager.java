package com.product.game.tankbattle.resource.sprite;

import com.product.game.tankbattle.actor.base.TBActor.ACTOR_DIRECTION;
import com.product.game.tankbattle.controller.DPadSprite;
import com.product.game.tankbattle.resource.GameResource;

public class DpadSpriteManager extends BaseSpriteManager{

	@Override
	public int getFrameNumbers() {
		return 1;
	}

	@Override
	public String getGFXResourcePath() {
		return "dpad_test.png";
	}

	@Override
	public int getFrameWidth() {
		return 250;
	}

	@Override
	public int getFrameHeight() {
		return 250;
	}

	
	@Override
	public DPadSprite makeAnimateSprite(int width, int height) {
		return new DPadSprite(0, 0, width, height, mTiledTextureRegion, GameResource.getInstance().vertexBufferObjectManager);
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

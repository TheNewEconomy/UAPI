package com.creatorfromhell.core.uapi.entity;

/**
 * Created by Daniel "creatorfromhell" on 3/26/2017.
 */
public interface Creature extends Insentient {
    public Entity getTarget();
    public void setTarget(Entity target);
}

package org.geysermc.pack.bedrock.resource.particles.particleeffect.components;

import com.google.gson.annotations.SerializedName;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.String;

/**
 * Particle Motion Collision Component For 1.10.0
 */
public class ParticleMotionCollision {
  @SerializedName("collision_drag")
  public Float collisionDrag;

  @SerializedName("coefficient_of_restitution")
  public Float coefficientOfRestitution;

  @SerializedName("collision_radius")
  public Float collisionRadius;

  public String enabled;

  @SerializedName("expire_on_contact")
  public Boolean expireOnContact;

  /**
   * @return Collision Drag
   */
  public Float collisionDrag() {
    return this.collisionDrag;
  }

  /**
   * @param collisionDrag Collision Drag
   */
  public void collisionDrag(float collisionDrag) {
    this.collisionDrag = collisionDrag;
  }

  /**
   * @return Coefficient Of Restitution
   */
  public Float coefficientOfRestitution() {
    return this.coefficientOfRestitution;
  }

  /**
   * @param coefficientOfRestitution Coefficient Of Restitution
   */
  public void coefficientOfRestitution(float coefficientOfRestitution) {
    this.coefficientOfRestitution = coefficientOfRestitution;
  }

  /**
   * @return Collision Radius
   */
  public Float collisionRadius() {
    return this.collisionRadius;
  }

  /**
   * @param collisionRadius Collision Radius
   */
  public void collisionRadius(float collisionRadius) {
    this.collisionRadius = collisionRadius;
  }

  public String enabled() {
    return this.enabled;
  }

  public void enabled(String enabled) {
    this.enabled = enabled;
  }

  /**
   * @return Expire On Contact
   */
  public Boolean expireOnContact() {
    return this.expireOnContact;
  }

  /**
   * @param expireOnContact Expire On Contact
   */
  public void expireOnContact(boolean expireOnContact) {
    this.expireOnContact = expireOnContact;
  }
}

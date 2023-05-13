package org.geysermc.pack.bedrock.resource.models.entity.modelentity;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.geysermc.pack.bedrock.resource.models.entity.modelentity.geometry.Bones;
import org.geysermc.pack.bedrock.resource.models.entity.modelentity.geometry.Description;

/**
 * Model
 * <p>
 * Model specification.
 */
public class Geometry {
  public Description description;

  public List<Bones> bones = new ArrayList<>();

  public String cape;

  /**
   * The descriptions of the geometry.
   *
   * @return Description
   */
  public Description description() {
    return this.description;
  }

  /**
   * The descriptions of the geometry.
   *
   * @param description Description
   */
  public void description(Description description) {
    this.description = description;
  }

  /**
   * Bones define the `skeleton` of the mob: the parts that can be animated, and to which geometry and other bones are attached.
   *
   * @return Bones
   */
  public List<Bones> bones() {
    return this.bones;
  }

  /**
   * Bones define the `skeleton` of the mob: the parts that can be animated, and to which geometry and other bones are attached.
   *
   * @param bones Bones
   */
  public void bones(List<Bones> bones) {
    this.bones = bones;
  }

  /**
   * @return Cape
   */
  public String cape() {
    return this.cape;
  }

  /**
   * @param cape Cape
   */
  public void cape(String cape) {
    this.cape = cape;
  }
}

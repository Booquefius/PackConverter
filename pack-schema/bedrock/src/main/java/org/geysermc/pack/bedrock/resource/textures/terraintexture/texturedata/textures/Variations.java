package org.geysermc.pack.bedrock.resource.textures.terraintexture.texturedata.textures;

import java.lang.Integer;
import java.lang.String;

/**
 * Variantion
 * <p>
 * One of the variantions, specified along with a possible weight.
 */
public class Variations {
  public String path;

  public Integer weight;

  /**
   * A texture file.
   *
   * @return Path
   */
  public String path() {
    return this.path;
  }

  /**
   * A texture file.
   *
   * @param path Path
   */
  public void path(String path) {
    this.path = path;
  }

  /**
   * The weight of the texture.
   *
   * @return Weight
   */
  public Integer weight() {
    return this.weight;
  }

  /**
   * The weight of the texture.
   *
   * @param weight Weight
   */
  public void weight(int weight) {
    this.weight = weight;
  }
}

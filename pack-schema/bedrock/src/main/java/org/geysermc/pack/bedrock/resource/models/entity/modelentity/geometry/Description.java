package org.geysermc.pack.bedrock.resource.models.entity.modelentity.geometry;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Description
 * <p>
 * The descriptions of the geometry.
 */
public class Description {
  public String identifier;

  @JsonProperty("texture_width")
  public float textureWidth;

  @JsonProperty("texture_height")
  public float textureHeight;

  @JsonProperty("visible_bounds_offset")
  public float[] visibleBoundsOffset;

  @JsonProperty("visible_bounds_width")
  public float visibleBoundsWidth;

  @JsonProperty("visible_bounds_height")
  public float visibleBoundsHeight;

  /**
   * Entity definition and Client Block definition files refer to this geometry via this identifier.
   *
   * @return Identifier
   */
  public String identifier() {
    return this.identifier;
  }

  /**
   * Entity definition and Client Block definition files refer to this geometry via this identifier.
   *
   * @param identifier Identifier
   */
  public void identifier(String identifier) {
    this.identifier = identifier;
  }

  /**
   * Assumed width in texels of the texture that will be bound to this geometry.
   *
   * @return Texture Width
   */
  public float textureWidth() {
    return this.textureWidth;
  }

  /**
   * Assumed width in texels of the texture that will be bound to this geometry.
   *
   * @param textureWidth Texture Width
   */
  public void textureWidth(float textureWidth) {
    this.textureWidth = textureWidth;
  }

  /**
   * Assumed height in texels of the texture that will be bound to this geometry.
   *
   * @return Texture Height
   */
  public float textureHeight() {
    return this.textureHeight;
  }

  /**
   * Assumed height in texels of the texture that will be bound to this geometry.
   *
   * @param textureHeight Texture Height
   */
  public void textureHeight(float textureHeight) {
    this.textureHeight = textureHeight;
  }

  /**
   * Offset of the visibility bounding box from the entity location point (in model space units).
   *
   * @return Visible Bounds Offset
   */
  public float[] visibleBoundsOffset() {
    return this.visibleBoundsOffset;
  }

  /**
   * Offset of the visibility bounding box from the entity location point (in model space units).
   *
   * @param visibleBoundsOffset Visible Bounds Offset
   */
  public void visibleBoundsOffset(float[] visibleBoundsOffset) {
    this.visibleBoundsOffset = visibleBoundsOffset;
  }

  /**
   * Width of the visibility bounding box (in model space units).
   *
   * @return Visible Bounds Width
   */
  public float visibleBoundsWidth() {
    return this.visibleBoundsWidth;
  }

  /**
   * Width of the visibility bounding box (in model space units).
   *
   * @param visibleBoundsWidth Visible Bounds Width
   */
  public void visibleBoundsWidth(float visibleBoundsWidth) {
    this.visibleBoundsWidth = visibleBoundsWidth;
  }

  /**
   * Height of the visible bounding box (in model space units).
   *
   * @return Visible Bounds Height
   */
  public float visibleBoundsHeight() {
    return this.visibleBoundsHeight;
  }

  /**
   * Height of the visible bounding box (in model space units).
   *
   * @param visibleBoundsHeight Visible Bounds Height
   */
  public void visibleBoundsHeight(float visibleBoundsHeight) {
    this.visibleBoundsHeight = visibleBoundsHeight;
  }
}

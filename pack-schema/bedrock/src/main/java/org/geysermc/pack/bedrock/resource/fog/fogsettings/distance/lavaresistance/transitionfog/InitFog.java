package org.geysermc.pack.bedrock.resource.fog.fogsettings.distance.lavaresistance.transitionfog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Initial Fog
 * <p>
 * Initial fog that will slowly transition into water distance fog of the biome when player goes into water.
 */
public class InitFog {
  @JsonProperty("fog_color")
  public String fogColor;

  @JsonProperty("fog_start")
  public float fogStart;

  @JsonProperty("fog_end")
  public float fogEnd;

  /**
   * The color that the fog will take on.
   *
   * @return Fog Color
   */
  public String fogColor() {
    return this.fogColor;
  }

  /**
   * The color that the fog will take on.
   *
   * @param fogColor Fog Color
   */
  public void fogColor(String fogColor) {
    this.fogColor = fogColor;
  }

  /**
   * The distance from the player that the fog will begin to appear. 'fog_start' must be less than or equal to 'fog_end'.
   *
   * @return Fog Start
   */
  public float fogStart() {
    return this.fogStart;
  }

  /**
   * The distance from the player that the fog will begin to appear. 'fog_start' must be less than or equal to 'fog_end'.
   *
   * @param fogStart Fog Start
   */
  public void fogStart(float fogStart) {
    this.fogStart = fogStart;
  }

  /**
   * The distance from the player that the fog will become fully opaque. 'fog_end' must be greater than or equal to 'fog_start'.
   *
   * @return Fog End
   */
  public float fogEnd() {
    return this.fogEnd;
  }

  /**
   * The distance from the player that the fog will become fully opaque. 'fog_end' must be greater than or equal to 'fog_start'.
   *
   * @param fogEnd Fog End
   */
  public void fogEnd(float fogEnd) {
    this.fogEnd = fogEnd;
  }
}

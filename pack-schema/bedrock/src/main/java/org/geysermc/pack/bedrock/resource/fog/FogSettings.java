package org.geysermc.pack.bedrock.resource.fog;

import org.geysermc.pack.bedrock.resource.fog.fogsettings.Description;
import org.geysermc.pack.bedrock.resource.fog.fogsettings.Distance;
import org.geysermc.pack.bedrock.resource.fog.fogsettings.Volumetric;

/**
 * Fog Settings
 * <p>
 * The definition of a single fog.
 */
public class FogSettings {
  public Description description;

  public Distance distance;

  public Volumetric volumetric;

  /**
   * The identifying description of this fog settings.
   *
   * @return Description
   */
  public Description description() {
    return this.description;
  }

  /**
   * The identifying description of this fog settings.
   *
   * @param description Description
   */
  public void description(Description description) {
    this.description = description;
  }

  /**
   * The distance fog settings for different camera locations.
   *
   * @return Distance
   */
  public Distance distance() {
    return this.distance;
  }

  /**
   * The distance fog settings for different camera locations.
   *
   * @param distance Distance
   */
  public void distance(Distance distance) {
    this.distance = distance;
  }

  /**
   * The volumetric fog settings.
   *
   * @return Volumetric
   */
  public Volumetric volumetric() {
    return this.volumetric;
  }

  /**
   * The volumetric fog settings.
   *
   * @param volumetric Volumetric
   */
  public void volumetric(Volumetric volumetric) {
    this.volumetric = volumetric;
  }
}

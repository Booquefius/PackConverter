package org.geysermc.pack.bedrock.resource.particles;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Particle
 * <p>
 * A particle definition file.
 */
public class Particles {
  @JsonProperty("format_version")
  public String formatVersion;

  @JsonProperty("particle_effect")
  public ParticleEffect particleEffect;

  /**
   * A version that tells minecraft what type of data format can be expected when reading this file.
   *
   * @return Format Version
   */
  public String formatVersion() {
    return this.formatVersion;
  }

  /**
   * A version that tells minecraft what type of data format can be expected when reading this file.
   *
   * @param formatVersion Format Version
   */
  public void formatVersion(String formatVersion) {
    this.formatVersion = formatVersion;
  }

  /**
   * @return Particle Effect
   */
  public ParticleEffect particleEffect() {
    return this.particleEffect;
  }

  /**
   * @param particleEffect Particle Effect
   */
  public void particleEffect(ParticleEffect particleEffect) {
    this.particleEffect = particleEffect;
  }
}

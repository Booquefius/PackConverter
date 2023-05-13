package org.geysermc.pack.bedrock.resource.models.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.geysermc.pack.bedrock.resource.models.entity.modelentity.Geometry;

/**
 * Geometry 1.16.0
 * <p>
 * The minecraft resourcepack model schema for 1.16.0
 */
public class ModelEntity {
  public boolean debug;

  @JsonProperty("format_version")
  public String formatVersion;

  @JsonProperty("minecraft:geometry")
  public List<Geometry> geometry = new ArrayList<>();

  /**
   * @return Debug
   */
  public boolean debug() {
    return this.debug;
  }

  /**
   * @param debug Debug
   */
  public void debug(boolean debug) {
    this.debug = debug;
  }

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
   * The collection of geometries.
   *
   * @return Geometry
   */
  public List<Geometry> geometry() {
    return this.geometry;
  }

  /**
   * The collection of geometries.
   *
   * @param geometry Geometry
   */
  public void geometry(List<Geometry> geometry) {
    this.geometry = geometry;
  }
}

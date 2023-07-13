package org.geysermc.pack.bedrock.resource.manifest;

import java.lang.String;

/**
 * Dependency
 * <p>
 * Section containing definitions for any other packs that are required in order for this manifest.json file to work.
 */
public class Dependencies {
  public String uuid;

  public float[] version;

  /**
   * This is the unique identifier of the pack that this pack depends on. It needs to be the exact same UUID that the pack has defined in the header section of it's manifest file
   *
   * @return Uuid
   */
  public String uuid() {
    return this.uuid;
  }

  /**
   * This is the unique identifier of the pack that this pack depends on. It needs to be the exact same UUID that the pack has defined in the header section of it's manifest file
   *
   * @param uuid Uuid
   */
  public void uuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * A version made of 3 numbers.
   *
   * @return Version Numbering
   */
  public float[] version() {
    return this.version;
  }

  /**
   * A version made of 3 numbers.
   *
   * @param version Version Numbering
   */
  public void version(float[] version) {
    this.version = version;
  }
}

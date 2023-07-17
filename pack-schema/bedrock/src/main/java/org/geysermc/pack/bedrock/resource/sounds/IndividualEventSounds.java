package org.geysermc.pack.bedrock.resource.sounds;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import org.geysermc.pack.bedrock.resource.sounds.individualeventsounds.Events;

/**
 * Individual Event Sounds
 * <p>
 * Individual event sounds definitions.
 */
public class IndividualEventSounds {
  private Map<String, Events> events = new HashMap<>();

  /**
   * Events.
   *
   * @return Events
   */
  public Map<String, Events> events() {
    return this.events;
  }

  /**
   * Events.
   *
   * @param events Events
   */
  public void events(Map<String, Events> events) {
    this.events = events;
  }
}

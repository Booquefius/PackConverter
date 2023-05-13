package org.geysermc.pack.bedrock.resource.animation_controllers.animationcontroller;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import org.geysermc.pack.bedrock.resource.animation_controllers.animationcontroller.animationcontrollers.States;

/**
 * Animation Controllers Schema
 * <p>
 * The animation controllers schema for.
 */
public class AnimationControllers {
  private Map<String, States> states = new HashMap<>();

  @JsonProperty("initial_state")
  public String initialState;

  /**
   * The states of this animation controller.
   *
   * @return States
   */
  public Map<String, States> states() {
    return this.states;
  }

  /**
   * The states of this animation controller.
   *
   * @param states States
   */
  public void states(Map<String, States> states) {
    this.states = states;
  }

  /**
   * The state to start with, if not specified state at position 0 in the array is used.
   *
   * @return Initial State
   */
  public String initialState() {
    return this.initialState;
  }

  /**
   * The state to start with, if not specified state at position 0 in the array is used.
   *
   * @param initialState Initial State
   */
  public void initialState(String initialState) {
    this.initialState = initialState;
  }
}

package org.acme.config.bug.extension.runtime;

import io.quarkus.runtime.annotations.*;

import java.util.Map;

//@ConfigRoot(name="bug", phase = ConfigPhase.BUILD_TIME) // gives correct default value
@ConfigRoot(name="bug", phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED) // gives wrong default value
public class BuildConfigs {

    /**
     * The default config.
     */
    @ConfigItem(name = ConfigItem.PARENT)
    public BuildConfig defaultClient;

    /**
     * Additional named clients.
     */
    @ConfigDocSection
    @ConfigDocMapKey("config-name")
    @ConfigItem(name = ConfigItem.PARENT)
    public Map<String, BuildConfig> namedConfigs;
}

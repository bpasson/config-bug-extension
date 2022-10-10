package org.acme.config.bug.extension.test;

import org.acme.config.bug.extension.runtime.RuntimeConfigs;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkus.test.QuarkusUnitTest;

import javax.inject.Inject;

public class ConfigBugExtensionTest {

    // Start unit test with your extension loaded
    @RegisterExtension
    static final QuarkusUnitTest unitTest = new QuarkusUnitTest()
        .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class));

    @Inject
    RuntimeConfigs runtimeConfigs;

    @Test
    public void testingDefaultConfigValue() {
        Assertions.assertFalse(runtimeConfigs.defaultConfig.tls.enabled, "Was expecting default config tls to be disabled.");
    }
}

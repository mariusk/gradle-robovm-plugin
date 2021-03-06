/*
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jtakakura.gradle.plugins.robovm;

import org.gradle.api.Project;

/**
 *
 * @author Junji Takakura
 */
public class RoboVMPluginExtension {

    public static final String NAME = "robovm";
    final Project project;
    String propertiesFile;
    String configFile;
    String iosSignIdentity;
    String iosProvisioningProfile;
    String iOSSimulatorSdk;

    public RoboVMPluginExtension(Project project) {
        this.project = project;
    }

    public String getPropertiesFile() {
        return propertiesFile;
    }

    public String getConfigFile() {
        return configFile;
    }

    public String getIosSignIdentity() {
        return iosSignIdentity;
    }

    public String getIosProvisioningProfile() {
        return iosProvisioningProfile;
    }

    public String getIOSSimulatorSdk() {
        return iOSSimulatorSdk;
    }
}

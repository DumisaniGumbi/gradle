/*
 * Copyright 2016 the original author or authors.
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

package org.gradle.api.tasks;

import org.gradle.api.Incubating;
import org.gradle.api.internal.tasks.cache.TaskOutputCacheFactory;
import org.gradle.internal.HasInternalProtocol;

import java.io.File;

/**
 * Configuration for caching task outputs.
 */
@Incubating
@HasInternalProtocol
public interface TaskCaching {

    /**
     * Use the default local directory cache. The cache directory path defaults to {@code $GRADLE_HOME/task-cache}.
     * It can also be overridden via the {@code org.gradle.cache.tasks.directory} system property.
     */
    void useLocalCache();

    /**
     * Use a local directory cache in the given directory.
     */
    void useLocalCache(File directory);

    /**
     * Use the give task output cache factory.
     */
    void useCacheFactory(TaskOutputCacheFactory factory);
}

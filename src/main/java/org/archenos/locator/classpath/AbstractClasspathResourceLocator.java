/*
 * Copyright 2011 Archenos, http://www.archenos.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.archenos.locator.classpath;

import java.net.URL;

import org.archenos.locator.ResourceNotFoundException;

public abstract class AbstractClasspathResourceLocator implements ClasspathResourceLocator {

    public URL findResource(String resourceName) throws ResourceNotFoundException {
        ClassLoader loader = getClasssLoader();
        URL path = loader.getResource(resourceName);

        if (path == null) {
            throw new ResourceNotFoundException("Resource \"" + resourceName + "\" not found.");
        }

        return path;
    }
}

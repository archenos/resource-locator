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

import junit.framework.Assert;

import org.archenos.locator.ResourceLocator;
import org.archenos.locator.ResourceNotFoundException;
import org.junit.Test;

public final class CurrentClassLoaderResourceLocatorTest {
    @Test
    public void testFindResource() {
        ResourceLocator locator = new CurrentClassLoaderResourceLocator();

        try {
            URL url = locator.findResource("file1.txt");
            Assert.assertNotNull(url);
        } catch (ResourceNotFoundException e) {
            Assert.fail("Resource should be found but was not found.");
        }

        try {
            URL url = locator.findResource("one/file2.txt");
            Assert.assertNotNull(url);
        } catch (ResourceNotFoundException e) {
            Assert.fail("Resource should be found but was not found.");
        }

        try {
            URL url = locator.findResource("one/two/file3.txt");
            Assert.assertNotNull(url);
        } catch (ResourceNotFoundException e) {
            Assert.fail("Resource should be found but was not found.");
        }

        try {
            locator.findResource("missing.txt");
            Assert.fail("Resource should not be found but was found.");
        } catch (ResourceNotFoundException e) {
            // Expected.
        }
    }
}

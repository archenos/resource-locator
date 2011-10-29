package org.archenos.locator;

import java.net.URL;

public interface ResourceLocator {
    URL findResource(String resourceName) throws ResourceNotFoundException;
}

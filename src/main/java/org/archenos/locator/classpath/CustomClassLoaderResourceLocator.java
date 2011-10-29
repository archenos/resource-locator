package org.archenos.locator.classpath;

public final class CustomClassLoaderResourceLocator extends AbstractClasspathResourceLocator {

    private final ClassLoader loader;
    
    private CustomClassLoaderResourceLocator(ClassLoader loader) {
        super();
        this.loader = loader;
    }

    public ClassLoader getClasssLoader() {
        return loader;
    }
}

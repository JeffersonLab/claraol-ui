package gui.engine;

import gui.backend.*;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author dkroell
 * @version 4/27/2016.
 */
public class myEngine implements Engine {

    private Identity                identity        = null;
    private ArrayList<EngineConfig>     configurations  = new ArrayList<EngineConfig>();
    private ArrayList<String>       libraries       = new ArrayList<String>();
    private ArrayList<String>       libraryPaths    = new ArrayList<String>();


    @Override
    public Identity getIdentity() {
        return this.identity;
    }

    @Override
    public boolean hasIdentity() {
        return this.identity != null;
    }

    @Override
    public void setIdentity(Identity newHasIdentity) {
        this.identity = newHasIdentity;
    }

    @Override
    public Collection<? extends EngineConfig> geConfigurations() {
        return this.configurations;
    }

    @Override
    public boolean hasConfiguration() {
        return !this.configurations.isEmpty();
    }

    @Override
    public void addConfiguration(EngineConfig newNeedsConfiguration) {
        this.configurations.add(newNeedsConfiguration);
    }

    @Override
    public void removeConfiguration(EngineConfig oldNeedsConfiguration) {
        this.configurations.remove(oldNeedsConfiguration);
    }

    @Override
    public Collection<? extends String> getLibraries() {
        return this.libraries;
    }

    @Override
    public boolean hasLibrary() {
        return !this.libraries.isEmpty();
    }

    @Override
    public void addLibrary(String newHasLibrary) {
        this.libraries.add(newHasLibrary);
    }

    @Override
    public void removeLibrary(String oldHasLibrary) {
        this.libraries.remove(oldHasLibrary);
    }

    @Override
    public Collection<? extends String> getLibraryPaths() {
        return this.libraryPaths;
    }

    @Override
    public boolean hasLibraryPath() {
        return !this.libraryPaths.isEmpty();
    }

    @Override
    public void addLibraryPath(String newHasLibraryPath) {
        this.libraryPaths.add(newHasLibraryPath);
    }

    @Override
    public void removeLibraryPath(String oldHasLibraryPath) {
        this.libraryPaths.remove(oldHasLibraryPath);
    }

    @Override
    public void delete() {

    }
}

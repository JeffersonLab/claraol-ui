/*
 *   Copyright (c) 2016.  Jefferson Lab (JLab). All rights reserved. Permission
 *   to use, copy, modify, and distribute  this software and its documentation for
 *   educational, research, and not-for-profit purposes, without fee and without a
 *   signed licensing agreement.
 *
 *   IN NO EVENT SHALL JLAB BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT, SPECIAL
 *   INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS, ARISING
 *   OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF JLAB HAS
 *   BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *   JLAB SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 *   THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 *   PURPOSE. THE CLARA SOFTWARE AND ACCOMPANYING DOCUMENTATION, IF ANY,
 *   PROVIDED HEREUNDER IS PROVIDED "AS IS". JLAB HAS NO OBLIGATION TO PROVIDE
 *   MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 *
 *   This software was developed under the United States Government license.
 *   For more information contact author at gurjyan@jlab.org
 *   Department of Experimental Nuclear Physics, Jefferson Lab.
 */

package gui.backend;


import java.util.Collection;

/**
 * 
 * <p>
 * @version created on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 */

public interface Engine {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasIdentity
     */
     
    /**
     * Gets property value for the hasIdentity property.<p>
     * 
     * @return a value for the hasIdentity property.
     */
    Identity getIdentity();

    /**
     * Checks if the class has a hasIdentity property value.<p>
     * 
     * @return true if there is a hasIdentity property value.
     */
    boolean hasIdentity();

    /**
     * Adds a hasIdentity property value.<p>
     * 
     * @param newHasIdentity the hasIdentity property value to be added
     */
    void setIdentity(Identity newHasIdentity);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#needsConfiguation
     */
     
    /**
     * Gets all property values for the needsConfiguration property.<p>
     * 
     * @return a collection of values for the needsConfiguration property.
     */
    Collection<? extends EngineConfig> geConfigurations();

    /**
     * Checks if the class has a needsConfiguation property value.<p>
     * 
     * @return true if there is a needsConfiguation property value.
     */
    boolean hasConfiguration();

    /**
     * Adds a needsConfiguation property value.<p>
     * 
     * @param newNeedsConfiguration the needsConfiguration property value to be added
     */
    void addConfiguration(EngineConfig newNeedsConfiguration);

    /**
     * Removes a needsConfiguration property value.<p>
     * 
     * @param oldNeedsConfiguration the needsConfiguration property value to be removed.
     */
    void removeConfiguration(EngineConfig oldNeedsConfiguration);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasLibrary
     */
     
    /**
     * Gets all property values for the hasLibrary property.<p>
     * 
     * @return a collection of values for the hasLibrary property.
     */
    Collection<? extends String> getLibraries();

    /**
     * Checks if the class has a hasLibrary property value.<p>
     * 
     * @return true if there is a hasLibrary property value.
     */
    boolean hasLibrary();

    /**
     * Adds a hasLibrary property value.<p>
     * 
     * @param newHasLibrary the hasLibrary property value to be added
     */
    void addLibrary(String newHasLibrary);

    /**
     * Removes a hasLibrary property value.<p>
     * 
     * @param oldHasLibrary the hasLibrary property value to be removed.
     */
    void removeLibrary(String oldHasLibrary);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasLibraryPath
     */
     
    /**
     * Gets all property values for the hasLibraryPath property.<p>
     * 
     * @return a collection of values for the hasLibraryPath property.
     */
    Collection<? extends String> getLibraryPaths();

    /**
     * Checks if the class has a hasLibraryPath property value.<p>
     * 
     * @return true if there is a hasLibraryPath property value.
     */
    boolean hasLibraryPath();

    /**
     * Adds a hasLibraryPath property value.<p>
     * 
     * @param newHasLibraryPath the hasLibraryPath property value to be added
     */
    void addLibraryPath(String newHasLibraryPath);

    /**
     * Removes a hasLibraryPath property value.<p>
     * 
     * @param oldHasLibraryPath the hasLibraryPath property value to be removed.
     */
    void removeLibraryPath(String oldHasLibraryPath);

    void delete();

}

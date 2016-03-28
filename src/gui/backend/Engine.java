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
 * @version generated on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 */

public interface Engine {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasIdentity
     */
     
    /**
     * Gets all property values for the hasIdentity property.<p>
     * 
     * @return a collection of values for the hasIdentity property.
     */
    Collection<? extends Identity> getHasIdentity();

    /**
     * Checks if the class has a hasIdentity property value.<p>
     * 
     * @return true if there is a hasIdentity property value.
     */
    boolean hasHasIdentity();

    /**
     * Adds a hasIdentity property value.<p>
     * 
     * @param newHasIdentity the hasIdentity property value to be added
     */
    void addHasIdentity(Identity newHasIdentity);

    /**
     * Removes a hasIdentity property value.<p>
     * 
     * @param oldHasIdentity the hasIdentity property value to be removed.
     */
    void removeHasIdentity(Identity oldHasIdentity);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#needsConfiguation
     */
     
    /**
     * Gets all property values for the needsConfiguation property.<p>
     * 
     * @return a collection of values for the needsConfiguation property.
     */
    Collection<? extends EngineConfig> getNeedsConfiguation();

    /**
     * Checks if the class has a needsConfiguation property value.<p>
     * 
     * @return true if there is a needsConfiguation property value.
     */
    boolean hasNeedsConfiguation();

    /**
     * Adds a needsConfiguation property value.<p>
     * 
     * @param newNeedsConfiguation the needsConfiguation property value to be added
     */
    void addNeedsConfiguation(EngineConfig newNeedsConfiguation);

    /**
     * Removes a needsConfiguation property value.<p>
     * 
     * @param oldNeedsConfiguation the needsConfiguation property value to be removed.
     */
    void removeNeedsConfiguation(EngineConfig oldNeedsConfiguation);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasLibrary
     */
     
    /**
     * Gets all property values for the hasLibrary property.<p>
     * 
     * @return a collection of values for the hasLibrary property.
     */
    Collection<? extends String> getHasLibrary();

    /**
     * Checks if the class has a hasLibrary property value.<p>
     * 
     * @return true if there is a hasLibrary property value.
     */
    boolean hasHasLibrary();

    /**
     * Adds a hasLibrary property value.<p>
     * 
     * @param newHasLibrary the hasLibrary property value to be added
     */
    void addHasLibrary(String newHasLibrary);

    /**
     * Removes a hasLibrary property value.<p>
     * 
     * @param oldHasLibrary the hasLibrary property value to be removed.
     */
    void removeHasLibrary(String oldHasLibrary);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasLibraryPath
     */
     
    /**
     * Gets all property values for the hasLibraryPath property.<p>
     * 
     * @return a collection of values for the hasLibraryPath property.
     */
    Collection<? extends String> getHasLibraryPath();

    /**
     * Checks if the class has a hasLibraryPath property value.<p>
     * 
     * @return true if there is a hasLibraryPath property value.
     */
    boolean hasHasLibraryPath();

    /**
     * Adds a hasLibraryPath property value.<p>
     * 
     * @param newHasLibraryPath the hasLibraryPath property value to be added
     */
    void addHasLibraryPath(String newHasLibraryPath);

    /**
     * Removes a hasLibraryPath property value.<p>
     * 
     * @param oldHasLibraryPath the hasLibraryPath property value to be removed.
     */
    void removeHasLibraryPath(String oldHasLibraryPath);



    void delete();

}

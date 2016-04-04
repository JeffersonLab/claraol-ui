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

/**
 * 
 * <p>
 * @version created on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 */

public interface Identity {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#author
     */
     
    /**
     * Gets property value for the author property.<p>
     * 
     * @return a value for the author property.
     */
    String getAuthor();

    /**
     * Checks if the class has a author property value.<p>
     * 
     * @return true if there is a author property value.
     */
    boolean hasAuthor();

    /**
     * Adds a author property value.<p>
     * 
     * @param newAuthor the author property value to be added
     */
    void setAuthor(String newAuthor);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#description
     */
     
    /**
     * Gets property value for the description property.<p>
     * 
     * @return a value for the description property.
     */
    String getDescription();

    /**
     * Checks if the class has a description property value.<p>
     * 
     * @return true if there is a description property value.
     */
    boolean hasDescription();

    /**
     * Adds a description property value.<p>
     * 
     * @param newDescription the description property value to be added
     */
    void setDescription(String newDescription);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#name
     */
     
    /**
     * Gets property value for the name property.<p>
     * 
     * @return a value for the name property.
     */
    String getName();

    /**
     * Checks if the class has a name property value.<p>
     * 
     * @return true if there is a name property value.
     */
    boolean hasName();

    /**
     * Adds a name property value.<p>
     * 
     * @param newName the name property value to be added
     */
    void setName(String newName);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#version
     */
     
    /**
     * Gets property value for the version property.<p>
     * 
     * @return a value for the version property.
     */
    String getVersion();

    /**
     * Checks if the class has a version property value.<p>
     * 
     * @return true if there is a version property value.
     */
    boolean hasVersion();

    /**
     * Adds a version property value.<p>
     * 
     * @param newVersion the version property value to be added
     */
    void setVersion(String newVersion);

    void delete();

}

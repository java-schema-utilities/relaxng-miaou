package org.iso_relax.miaou.bta;

/**
 * @version binaryTreeAutomaton.rng 1.0 (Sat Sep 07 19:30:30 JST 2002)
 * @author  Relaxer 0.17b (http://www.relaxer.org)
 */
public class RContext {
    private java.net.URL baseURL;
    private java.util.Map idMap_ = new java.util.HashMap();

    /**
     * Creates a <code>RContext</code> by the File <code>file</code>.
     *
     */
    public RContext() {
    }

    /**
     * Creates a <code>RContext</code> by the File <code>file</code>.
     *
     * @param file
     * @exception java.net.MalformedURLException
     */
    public RContext(java.io.File file) throws java.net.MalformedURLException {
        baseURL = file.toURL();
    }

    /**
     * Creates a <code>RContext</code> by the URL <code>url</code>.
     *
     * @param url
     */
    public RContext(java.net.URL url) {
        baseURL = url;
    }

    /**
     * Creates a <code>RContext</code> by the File <code>file</code>.
     *
     * @param uri
     * @exception java.net.MalformedURLException
     */
    public RContext(String uri) throws java.net.MalformedURLException {
        baseURL = new java.net.URL(uri);
    }

    /**
     * Gets the java.net.URL property <b>baseURL</b>.
     *
     * @return java.net.URL
     */
    public final java.net.URL getBaseURL() {
        return (baseURL);
    }

    /**
     * Sets the java.net.URL property <b>baseURL</b>.
     *
     * @param baseURL
     */
    public final void setBaseURL(java.net.URL baseURL) {
        this.baseURL = baseURL;
    }

    /**
     * gets IRNode by ID.
     *
     * @param id
     * @return IRNode
     */
    public IRNode getIRNode(String id) {
        return ((IRNode)idMap_.get(id));
    }

    /**
     * sets IRNode with ID.
     *
     * @param id
     * @param node
     */
    public void setIRNode(String id, IRNode node) {
        idMap_.put(id, node);
    }
}

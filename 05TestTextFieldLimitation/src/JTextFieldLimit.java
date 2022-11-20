/*
 * #Copyright# Copyright Transdyn, Inc. All rights reserved. TRANSDYN
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. #EndCopyright#
 */


import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


/**
 * A simple document that limits the number of characters a user may type into a
 * text field.
 * 
 * @author gleichner
 */
public class JTextFieldLimit extends PlainDocument {
    private static final long serialVersionUID = 2010051201L;

    private int limit = 10;


    /**
     * Default constructor.
     */
    public JTextFieldLimit() {
        super();
    }


    /**
     * Constructs a JTextFieldLimit with the specified limit.
     * 
     * @param limit the maximum number of characters to allow in the text field.
     */
    public JTextFieldLimit( int limit ) {
        super();
        this.limit = limit;
    }


    /**
     * Constructs a JTextFieldLimit with the specified limit.
     * 
     * @param c the container for the content
     * @param limit the maximum number of characters to allow in the text field.
     */
    public JTextFieldLimit( Content c, int limit ) {
        super( c );
        this.limit = limit;
    }


    /**
     * @return the limit
     */
    public int getLimit() {
        return limit;
    }


    /**
     * @param limit the limit to set
     */
    public void setLimit( int limit ) {
        this.limit = limit;
    }


    /**
     * Try to add the specifed text.  If the text is too long then reject it.
     * 
     * @see javax.swing.text.PlainDocument#insertString(int, java.lang.String, javax.swing.text.AttributeSet)
     */
    @Override
    public void insertString( int offset, String str, AttributeSet attr ) throws BadLocationException {
        if ( str != null && ( getLength() + str.length() ) <= limit ) {
            super.insertString( offset, str, attr );
        }
    }
}

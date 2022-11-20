/*
 * #Copyright#
 * Copyright Transdyn, Inc. All rights reserved.
 * TRANSDYN PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * #EndCopyright#
 */


import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.EventListenerList;
import javax.swing.table.TableCellEditor;

/**
 * 
 *
 * Cell Editor Class for a Radio Button
 */
public class RadioButtonCellEditor extends JRadioButton implements TableCellEditor {

    static private final long serialVersionUID = 2011071901L;
    
    private EventListenerList listenerList = new EventListenerList();
    
    private ChangeEvent event = new ChangeEvent(this);
    
    public RadioButtonCellEditor() {
        super();
        addActionListener( new ActionListener() {

            @Override
            public void actionPerformed( ActionEvent e ) {
                fireEditingStopped();
            } 
        });
    }
    
    
    
    private void fireEditingStopped() {
        
        CellEditorListener listener;
        Object[] listeners = listenerList.getListenerList();
        for (int i = 0; i < listeners.length; i++) {
            
            if( i == 0) {
                continue;	
            }
            listener = (CellEditorListener) listeners[i];
            listener.editingStopped(event);
         }
   }


    /**
     * 
     * @see javax.swing.CellEditor#getCellEditorValue()
     */
    @Override
    public Object getCellEditorValue() {
        return new Boolean(isSelected());
    }

    /**
     * 
     * @see javax.swing.CellEditor#isCellEditable(java.util.EventObject)
     */
    @Override
    public boolean isCellEditable( EventObject anEvent ) {
        return true;
    }

    /**
     * 
     * @see javax.swing.CellEditor#shouldSelectCell(java.util.EventObject)
     */
    @Override
    public boolean shouldSelectCell( EventObject anEvent ) {
        return true;
    }

    /**
     * 
     * @see javax.swing.CellEditor#stopCellEditing()
     */
    @Override
    public boolean stopCellEditing() {
        fireEditingStopped();
       return true;
    }

    /**
     * 
     * @see javax.swing.CellEditor#cancelCellEditing()
     */
    @Override
    public void cancelCellEditing() {
        fireEditingStopped();
    }

    /**
     * 
     * @see javax.swing.CellEditor#addCellEditorListener(javax.swing.event.CellEditorListener)
     */
    @Override
    public void addCellEditorListener( CellEditorListener l ) {
    	new RuntimeException().printStackTrace();
        listenerList.add(CellEditorListener.class, l);
    }

    /**
     * 
     * @see javax.swing.CellEditor#removeCellEditorListener(javax.swing.event.CellEditorListener)
     */
    @Override
    public void removeCellEditorListener( CellEditorListener l ) {
        listenerList.remove(CellEditorListener.class, l);
        
    }

    
    /**
     * 
     * @see javax.swing.table.TableCellEditor#getTableCellEditorComponent(javax.swing.JTable, java.lang.Object, boolean, int, int)
     */
    @Override
    public Component getTableCellEditorComponent( JTable table, Object value, boolean isSelected, int row,
            int column ) {

        setHorizontalAlignment( SwingUtilities.CENTER );
        Boolean valueAsBoolean = (Boolean)value;
        setSelected(valueAsBoolean.booleanValue());
        return this;
        
    }
}

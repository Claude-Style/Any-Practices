import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.CellEditorListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

class MyFrame extends JFrame implements ActionListener
{
   
   private JTable table;
   private MyTableModel model = new MyTableModel();
   private JButton addButton = new JButton("Add");
   private JButton deleteButton = new JButton("Delete");
   private JCheckBox jcb;
   
   MyFrame(String title)
   {
      super(title);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JFrame.setDefaultLookAndFeelDecorated(true);
      
      JPanel p = new JPanel();     
      
      p.add(addButton);
      p.add(deleteButton);
      
      addButton.addActionListener(this);
      deleteButton.addActionListener(this);
//      model.addTableModelListener(new TableModelListener()
//    		  {
//
//				@Override
//				public void tableChanged(TableModelEvent e) {
//					// TODO Auto-generated method stub
//				   	System.out.println("tableChanged..................");
//					// TODO Auto-generated method stub
//				    int row = e.getFirstRow();
//				    int column=e.getColumn();
//				    System.out.println("row:"+row);
//				    System.out.println("column:"+column);
//				    Object aValue;
//				    if(column==3)
//				    {
//				    	aValue=((boolean)(model.getValueAt( row, column )));
//				    	System.out.println("avalue:"+aValue);
//				    }
//				    else
//				    {
//				    	aValue=((String)(model.getValueAt( row, column )));
//				    	System.out.println("avalue:"+aValue);
//				    }				    
//				    table.setValueAt( aValue, row, column);
//				    table.repaint();
//				}
//    	  	
//    		  });
      table = new JTable(model){

          private static final long serialVersionUID = 1L;

          /*@Override
          public Class getColumnClass(int column) {
          return getValueAt(0, column).getClass();
          }*/
          @Override
          public Class getColumnClass(int column) {
              switch (column) {
                  case 0:
                      return String.class;
                  case 1:
                      return String.class;
                  case 2:
                      return String.class;
                  case 3:
                      return Boolean.class;
                  case 4:
                      return String.class;
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  default:
                	  return String.class;                	  
              }
          }
      };
      
      jcb = new JCheckBox();
      table.getColumnModel().getColumn(3).setCellEditor(new TableCellEditor() {
    	  
    	  public Component getTableCellRendererComponents(JTable table, Object value , boolean isSelected, boolean hasFocus, int row, int column)
    	  {
    		  JCheckBox ck = new JCheckBox();
    		  ck.setSelected(isSelected);
    		  ck.setHorizontalAlignment((int) 0.5f);
    		  return ck;
    	  }

		@Override
		public void addCellEditorListener(CellEditorListener arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void cancelCellEditing() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Object getCellEditorValue() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isCellEditable(EventObject arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void removeCellEditorListener(CellEditorListener arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean shouldSelectCell(EventObject arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean stopCellEditing() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Component getTableCellEditorComponent(JTable arg0, Object arg1, boolean arg2, int arg3, int arg4) {
			// TODO Auto-generated method stub
			return null;
		}
      });         
      JScrollPane scrollPane=new JScrollPane(table);
      getContentPane().add(scrollPane, BorderLayout.CENTER);
      getContentPane().add(p, BorderLayout.SOUTH);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      if(e.getSource().equals(addButton))
      {
         model.addRow();
      }
      else if(e.getSource().equals(deleteButton))
      {
         model.deleteRow();
      }
   }
   private class RadioButtonRenderer implements TableCellRenderer {
       
       private JRadioButton radioButton  = new JRadioButton();   
       
       
       public Component getTableCellRendererComponent(
           JTable table, Object value, boolean isSelected,boolean isFocused, int row, int col)
       {               
           radioButton.setSelected( (Boolean)value);
           radioButton.setHorizontalAlignment(SwingConstants.CENTER);
           
           if( isSelected ) {
               radioButton.setBackground( new JTable().getSelectionBackground() );
           }
           else {
               radioButton.setBackground( Color.WHITE );
           }   
           return radioButton;
       }
   }
}


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableCellRenderer;

class MyFrame extends JFrame implements ActionListener
{
   
   private JTable table;
   private MyTableModel model = new MyTableModel();
   private JButton addButton = new JButton("Add");
   private JButton deleteButton = new JButton("Delete");
   
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
      model.addTableModelListener(new TableModelListener()
    		  {

				@Override
				public void tableChanged(TableModelEvent e) {
					// TODO Auto-generated method stub
				   	System.out.println("tableChanged..................");
					// TODO Auto-generated method stub
				    int row = e.getFirstRow();
				    int column=e.getColumn();
				    System.out.println("row:"+row);
				    System.out.println("column:"+column);
				    Object aValue;
				    if(column==3)
				    {
				    	aValue=((boolean)(model.getValueAt( row, column )));
				    	System.out.println("avalue:"+aValue);
				    }
				    else
				    {
				    	aValue=((String)(model.getValueAt( row, column )));
				    	System.out.println("avalue:"+aValue);
				    }				    
				    table.setValueAt( aValue, row, column);
				    table.repaint();
				}
    	  	
    		  });
      table = new JTable(model);
      
      table.getColumnModel().getColumn(3).setCellEditor(new RadioButtonCellEditor());   
      table.getColumnModel().getColumn(3).setCellRenderer(new RadioButtonRenderer());
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


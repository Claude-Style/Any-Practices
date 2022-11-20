import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

class MyTableModel extends AbstractTableModel
{
   private List<Monitor> monitorList = new ArrayList<Monitor>();
   public MyTableModel()
   {	   
	   Monitor monitor1 = new Monitor();
	   monitor1.setType("orbb-video-wall-monitor-config");
	   monitor1.setDeviceId("ALARM:1");
	   monitor1.setName("monitors/CCTV-monitor-13");
	   monitor1.setIncident(true);
	   monitor1.setDefaultMonitor("false");
	   monitor1.setDefaultAlarm("false");
	   monitor1.setWindowId("1");
	   monitor1.setViewerType("ALARM");
	   monitor1.setWallController("controllers/OrbbVideoWall");
	   monitor1.setCompatibleFormats("vlc");
	   monitor1.setVideoStreamSupported("true");
	   monitor1.setDirectVideoSupported("false");	   
	   monitorList.add(monitor1);
   }
   int row = 1;
   
   public Object getValueAt(int row, int column)
   {	   
       Monitor monitor=monitorList.get(row);
       Object value="";
       switch(column)
       {
       	case 0:
       		value=monitor.getType();       		
       		break;
       	case 1:
       		value=monitor.getDeviceId();       		
       		break;
       	case 2:
       		value=monitor.getName();       		
       		break;
       	case 3:
       		value=monitor.getIncident();       		
       		break;
       	case 4:
       		value=monitor.getDefaultMonitor();
       		break;
       	case 5:
       		value=monitor.getDefaultAlarm();       		
       		break;
       	case 6:
       		value=monitor.getWindowId();       		
       		break;
       	case 7:
       		value=monitor.getViewerType();       		
       		break;      	
       	case 8:
       		value=monitor.getWallController();       		
       		break;      	
       	case 9:
       		value=monitor.getCompatibleFormats();       		
       		break;  
       	case 10:
       		value=monitor.getVideoStreamSupported();       		
       		break;
       	case 11:
       		value=monitor.getDirectVideoSupported();       		
       		break;
       	case 12:
       		value=monitor.getCompatibleFormats();       		
       		break;
       }
	   return value;      
   }
   
   public int getRowCount()
   {	  
      return row;
   }
   
   public int getColumnCount()   
   {	  
      return 12;
   }
   
   void addRow()
   {
       row += 1;
	   Monitor monitor1 = new Monitor();
	   monitor1.setType("orbb-video-wall-monitor-config");
	   monitor1.setDeviceId("ALARM:1");
	   monitor1.setName("monitors/CCTV-monitor-13");
	   monitor1.setIncident(true);
	   monitor1.setDefaultMonitor("false");
	   monitor1.setDefaultAlarm("false");
	   monitor1.setWindowId("1");
	   monitor1.setViewerType("ALARM");
	   monitor1.setWallController("controllers/OrbbVideoWall");
	   monitor1.setCompatibleFormats("vlc");
	   monitor1.setVideoStreamSupported("true");
	   monitor1.setDirectVideoSupported("false");	   
	   monitorList.add(monitor1);
      fireTableDataChanged();
   }
   
   void deleteRow()
   {
      row -= 1;
      fireTableDataChanged();
   }
   
   public String getColumnName(int column)
   {
	  String columnName="";
      switch(column)
      {
      	case 0:
      		columnName="type";
      		break;
      	case 1:
      		columnName="device-id";
      		break;
      	case 2:
      		columnName="name";
      		break;
      	case 3:
      		columnName="incident";
      		break;
      	case 4:
      		columnName="default-monitor";
      		break;
      	case 5:
      		columnName="default-alarm";
      		break;
      	case 6:
      		columnName="window-id";
      		break;
      	case 7:
      		columnName="viewer-type";
      		break;      	
      	case 8:
      		columnName="wall-controller";
      		break;      	
      	case 9:
      		columnName="compatible-formats";
      		break;  
      	case 10:
      		columnName="video-stream-supported";
      		break;
      	case 11:
      		columnName="direct-video-supported";
      		break;
      	case 12:
      		columnName="compatible-formats";
      		break;
      }
      return columnName;
   }
   @Override
public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
	// TODO Auto-generated method stub
	   System.out.println("row:"+rowIndex);
	   System.out.println("column:"+columnIndex);
	Monitor monitor=monitorList.get(rowIndex);
	switch(columnIndex)
	{
		case 0:
			monitor.setType((String)aValue);
			break;
		case 1:
			monitor.setDeviceId((String)aValue);
			break;			
		case 2:
			monitor.setName((String)aValue);
			break;
		case 3:
			monitor.setIncident((boolean)aValue);
			break;
		case 4:
			monitor.setDefaultMonitor((String)aValue);
			break;
		case 5:
			monitor.setDefaultAlarm((String)aValue);
			break;
		case 6:
			monitor.setWindowId((String)aValue);
			break;
		case 7:
			monitor.setViewerType((String)aValue);
			break;
		case 8:
			monitor.setWallController((String)aValue);
			break;
		case 9:
			monitor.setCompatibleFormats((String)aValue);
			break;
		case 10:
			monitor.setVideoStreamSupported((String)aValue);
			break;
		case 11:
			monitor.setDirectVideoSupported((String)aValue);
			break;
		case 12:
			monitor.setCompatibleFormats((String)aValue);
			break;
			
	}	
	fireTableCellUpdated(rowIndex,columnIndex);
}

@Override
   public boolean isCellEditable(int rowIndex, int columnIndex) {
       return true;
   }
}
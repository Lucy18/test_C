package Entity;

import java.util.Date;

public class Aircraft {
	
	private String airType;//飞机型号
	
	private String airNum;//飞机编号
	
	private int startAvailableTime;//最早可用时间，unix格式
	
	private int endAvailableTime;//最晚可用时间，unix格式
	
	private String origin;//起点机场
	
	private int seat;//座位数
	
	private Date startDateTime;//以正常格式描述最早可用时间，yyyy-mm-dd:hh-mm
	
	private Date endDateTime;//以正常格式描述最晚可用时间，yyyy-mm-dd:hh-mm

}

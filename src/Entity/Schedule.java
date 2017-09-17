package Entity;

import java.util.Date;

public class Schedule {
	
	private int flightID;//航班唯一编号
	
	private int startTime;//起飞时间
	
	private int endTime;//到达时间
	
	private String origin;//起飞机场
	
	private String destination;//到达机场
	
	private String airType;//飞机型号
	
	private String airNum;//飞机尾号
	
	private int duration;//航班经历时间
	
	private Date start;//以正常格式描述起飞时间，yyyy-mm-dd:hh-mm
	
	private Date end;//以正常格式描述到达时间，yyyy-mm-dd:hh-mm
}

package mvcdemo.model;

import java.util.Date;

public class ValueStore {

	private String vm_id;
	private Date start_Time;
	private Date end_Time;
	private float f_hours;
	private float f_billAmount;
	private String vm_Name;
	
	public String getVmName() {
		return vm_Name;
	}
	public void setVmName(String vmName) {
		this.vm_Name = vmName;
	}
	public float getHours() {
		return f_hours;
	}
	public void setHours(float hours) {
		this.f_hours = hours;
	}
	public float getBillAmount() {
		return f_billAmount;
	}
	public void setBillAmount(float billAmount) {
		this.f_billAmount = billAmount;
	}
	public String getVmid() {
		return vm_id;
	}
	public void setVmid(String vmid) {
		this.vm_id = vmid;
	}
	public Date getStartTime() {
		return start_Time;
	}
	public void setStartTime(Date startTime) {
		this.start_Time = startTime;
	}
	public Date getEndTime() {
		return end_Time;
	}
	public void setEndTime(Date endTime) {
		this.end_Time = endTime;
	}
		
	
}

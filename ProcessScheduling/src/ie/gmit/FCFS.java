package ie.gmit;

public class FCFS {
	
	private int id[]=new int[4];
	private int btime[]=new int[4];
	private int wtime[]=new int[4];
	private int total=0;
	private float avg;
	
	
	public int[] getId() {
		return id;
	}
	
	public void setId(int[] id) {
		this.id = id;
	}
	
	public int[] getBtime() {
		return btime;
	}
	
	public void setBtime(int[] btime) {
		this.btime = btime;
	}
	
	public int[] getWtime() {
		return wtime;
	}
	
	public void setWtime(int[] wtime) {
		this.wtime = wtime;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public float getAvg() {
		return avg;
	}
	
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
}

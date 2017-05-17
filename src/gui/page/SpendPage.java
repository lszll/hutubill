package gui.page;

public class SpendPage {
	//本月消费
	public String monthSpend;
	//今日消费
	public String todaySpend;
	//平均消费
	public String avgSpendPerDay;
	//本月剩余
	public String monthAvailable;
	//日均可用
	public String dayAvgAvaible;
	//距离月末
	public String monthLeftDay;
	//使用比例
	public int usagePercentage;
	//是否超支
	public boolean isOverSpend = false;
	
	public SpendPage(int monthSpend, int todaySpend, int avgSpendPerDay, int monthAvailable, int dayAvgAvailable, 
			int monthLeftDay, int usagePercentage) {
		this.monthLeftDay = "￥" + monthLeftDay;
		this.todaySpend = "￥" + todaySpend;
		this.avgSpendPerDay = "￥" + avgSpendPerDay;
		if (monthAvailable < 0) {
			isOverSpend = true;
		}
		if (!isOverSpend) {
			this.monthAvailable = "￥" + monthAvailable;
			this.dayAvgAvaible = "￥" + dayAvgAvailable;
		} else {
			this.monthAvailable = "超支" + (0 - monthAvailable);
			this.dayAvgAvaible = "￥0";
			
		}
		
		this.monthLeftDay = monthLeftDay + "天";
		this.usagePercentage = usagePercentage;
	}
}

package gui.page;

public class SpendPage {
	//��������
	public String monthSpend;
	//��������
	public String todaySpend;
	//ƽ������
	public String avgSpendPerDay;
	//����ʣ��
	public String monthAvailable;
	//�վ�����
	public String dayAvgAvaible;
	//������ĩ
	public String monthLeftDay;
	//ʹ�ñ���
	public int usagePercentage;
	//�Ƿ�֧
	public boolean isOverSpend = false;
	
	public SpendPage(int monthSpend, int todaySpend, int avgSpendPerDay, int monthAvailable, int dayAvgAvailable, 
			int monthLeftDay, int usagePercentage) {
		this.monthLeftDay = "��" + monthLeftDay;
		this.todaySpend = "��" + todaySpend;
		this.avgSpendPerDay = "��" + avgSpendPerDay;
		if (monthAvailable < 0) {
			isOverSpend = true;
		}
		if (!isOverSpend) {
			this.monthAvailable = "��" + monthAvailable;
			this.dayAvgAvaible = "��" + dayAvgAvailable;
		} else {
			this.monthAvailable = "��֧" + (0 - monthAvailable);
			this.dayAvgAvaible = "��0";
			
		}
		
		this.monthLeftDay = monthLeftDay + "��";
		this.usagePercentage = usagePercentage;
	}
}

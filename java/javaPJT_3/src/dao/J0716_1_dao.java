package dao;

import java.text.DecimalFormat;

public class J0716_1_dao {
	public int getTotal(int k , int e) {
		int total = k + e;
		return total;
	}
	public String getAva(int total, int count) {
		DecimalFormat df = new DecimalFormat("0.00");

		double ava = total/(double)count;
		String result = df.format(ava);
		return result;

	}
	public String getResult(String avarage) {
		String result = "";
		double ava = Double.parseDouble(avarage);
		if(ava > 90) result = "��";
		else if(ava > 80) result = "��";
		else if(ava > 70) result = "��";
		else if(ava > 60) result = "��";
		else result ="��";

		return result;
	}	}


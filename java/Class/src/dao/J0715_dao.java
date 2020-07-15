package dao;

import java.text.DecimalFormat;

public class J0715_dao {
		public int getTotal(int k, int e, int m) {
			int total = k + e + m;
			return total;
		}
		public double getAva(int total, int count) {
			DecimalFormat df = new DecimalFormat("0.0");

			double ava = total / (double)count;
			String result = df.format(ava);

			double re = Double.parseDouble(result);
			return re;
		}

		public String getResult(double ava) {
			String result = "";
			if(ava > 90) result = "��";
			else if(ava > 80) result ="��";
			else if(ava > 80) result ="��";
			else if(ava > 80) result ="��";
			return result;
		}
	}



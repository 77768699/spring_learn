package cn.lovevv.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {

		DateFormat df  = new SimpleDateFormat("yyyy-MM-dd");
		Date dd= df.parse("2019-07-21");
		System.out.println(df.parse("2019-07-22").getDay());
	}

}

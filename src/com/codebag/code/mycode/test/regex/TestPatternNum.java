package com.codebag.code.mycode.test.regex;

import java.util.regex.Pattern;

import android.content.Context;

import com.codebag.bag.CaseListView;
import com.codebag.bag.Entry;
import com.codebag.bag.Log;

/**
 * 测试字符串是否是数字
 * 
 * @author peter
 *
 */
public class TestPatternNum extends CaseListView {

	public TestPatternNum(Context context) {
		super(context);
	}

	@Entry()
	public void runMatcher() {
		boolean isNum = isNumber("123");
		Log.addLog(this, "isNum = "  + isNum);
	}
		
	public boolean isNumber(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		return pattern.matcher(str).matches();
	}
}

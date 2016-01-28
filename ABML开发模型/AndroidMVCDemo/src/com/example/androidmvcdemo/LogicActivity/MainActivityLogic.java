package com.example.androidmvcdemo.LogicActivity;

import com.example.androidmvcdemo.DataActivity.MainActivityData;
import android.os.Bundle;

/**
 * 逻辑层：<br>
 * 本层应尽量避免全局变量的出现<br>
 * 通过调用数据层和界面层提供的方法，实现程序逻辑，将数据和界面绑定，并显示出来<br>
 */
public class MainActivityLogic extends MainActivityData {
	private int x = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void setButtonData() {
		if (x < 5) {
			setTextView(getData(), true);
			x++;
		} else {
			setTextView(getData(), false);
			x = 0;
		}
	}

}

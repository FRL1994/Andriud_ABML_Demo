package com.example.androidmvcdemo.DataActivity;

import com.example.androidmvcdemo.BaseActivity.MainActivityBase;
import android.os.Bundle;

/**数据层：<br>
 * 本层应尽量避免全局变量的出现<br>
 * 数据抽象类，用来实现 数据层 的所有基础方法<br>
 * 得到数据，为每个数据定义get和set方法,并为逻辑层提供公开的数据操作方法<br>
 * (注意：所有的数据变量都应设置成非公开权限)<br>
 * (例如： private Button mButton;)
 */
public abstract class MainActivityData extends MainActivityBase {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	public String getData() {
		return getEditTextContent();
	}

}

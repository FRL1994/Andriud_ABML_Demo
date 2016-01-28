package com.example.androidmvcdemo.AbstractActivity;

import android.app.Activity;
import android.os.Bundle;

/**抽象层：<br>
 * 基础抽象类，用来抽象所有方法<br>
 * 定义抽象方法，为方法添加注释<br>
 * （注意：这里不允许实现任何功能，所有方法和注释都在本层定义）(fragment层的除外)
 */
public abstract class MainActivityAbstract extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

}

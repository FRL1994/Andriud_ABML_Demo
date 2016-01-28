package com.example.androidmvcdemo.BaseActivity;

import com.example.androidmvcdemo.R;
import com.example.androidmvcdemo.AbstractActivity.MainActivityAbstract;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 视图层：<br>
 * 视图抽象类，用来实现 视图层 的所有基础方法<br>
 * 得到控件，为每个控件定义操作事件,并为数据、逻辑层提供 非公开的 可重写的 抽象视图操作方法(或公开的，可直接调用的方法)<br>
 * (注意：所有的视图变量都应设置成非公开权限)<br>
 * (例如： private Button mButton;)
 */
@SuppressLint("RtlHardcoded")
public abstract class MainActivityBase extends MainActivityAbstract {

	private Button mButton;
	private EditText mEditText;
	private LinearLayout mShowLL;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findView();
		OnClick();
	}

	protected abstract void setButtonData();

	private void findView() {
		mButton = (Button) findViewById(R.id.hello_bt);
		mEditText = (EditText) findViewById(R.id.hello_et);
		mShowLL = (LinearLayout) findViewById(R.id.show_ll);
	}

	private void OnClick() {
		mButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				setButtonData();
			}
		});
	}

	public String getEditTextContent() {
		return mEditText.getText().toString();
	}

	public void setTextView(String text, boolean IsLeft) {
		TextView tv1 = new TextView(this);
		tv1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		if (IsLeft) {
			tv1.setGravity(Gravity.LEFT);
		} else {
			tv1.setGravity(Gravity.RIGHT);
		}
		tv1.setText(text);
		mShowLL.addView(tv1);
	}
}

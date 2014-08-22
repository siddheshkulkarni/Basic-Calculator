package com.example.scal;

import android.os.Bundle;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	EditText edtext;
	String operation;
	Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnadd,
			btnsub, btnmul, btndiv, btncancel, btnequal, btndot;
	float firstoperand, secondoperand;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		edtext = (EditText) findViewById(R.id.answer);
		edtext.setEnabled(false);
		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		btn3 = (Button) findViewById(R.id.button3);
		btn4 = (Button) findViewById(R.id.button4);
		btn5 = (Button) findViewById(R.id.button5);
		btn6 = (Button) findViewById(R.id.button6);
		btn7 = (Button) findViewById(R.id.button7);
		btn8 = (Button) findViewById(R.id.button8);
		btn9 = (Button) findViewById(R.id.button9);
		btn0 = (Button) findViewById(R.id.button0);
		btnadd = (Button) findViewById(R.id.buttonadd);
		btnsub = (Button) findViewById(R.id.buttonsub);
		btnmul = (Button) findViewById(R.id.buttonmul);
		btndiv = (Button) findViewById(R.id.buttondiv);
		btnequal = (Button) findViewById(R.id.buttonequal);
		btncancel = (Button) findViewById(R.id.buttoncancel);
		btndot = (Button) findViewById(R.id.button11);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		btn7.setOnClickListener(this);
		btn8.setOnClickListener(this);
		btn9.setOnClickListener(this);
		btn0.setOnClickListener(this);
		btnadd.setOnClickListener(this);
		btnsub.setOnClickListener(this);
		btnmul.setOnClickListener(this);
		btndiv.setOnClickListener(this);
		btncancel.setOnClickListener(this);
		btnequal.setOnClickListener(this);
		btndot.setOnClickListener(this);

	}

	public void performOperation() {
		if (operation.equals("+")) {
			edtext.setText(String.valueOf(firstoperand + secondoperand));
		} else if (operation.equals("-")) {
			edtext.setText(String.valueOf(firstoperand - secondoperand));
		} else if (operation.equals("*")) {
			edtext.setText(String.valueOf(firstoperand * secondoperand));
		} else if (operation.equals("/")) {
			edtext.setText(String.valueOf(firstoperand / secondoperand));
		}
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {

		case R.id.buttonadd:
			operation = "+";
			if (edtext.getText().toString().equals(""))
				break;
			firstoperand = Float.parseFloat(edtext.getText().toString());
			edtext.setText("");
			break;

		case R.id.buttonsub:
			operation = "-";
			if (edtext.getText().toString().equals(""))
				break;
			firstoperand = Float.parseFloat(edtext.getText().toString());
			edtext.setText("");
			break;

		case R.id.buttonmul:
			operation = "*";
			if (edtext.getText().toString().equals(""))
				break;
			firstoperand = Float.parseFloat(edtext.getText().toString());
			edtext.setText("");
			break;

		case R.id.buttondiv:
			operation = "/";
			if (edtext.getText().toString().equals(""))
				break;
			firstoperand = Float.parseFloat(edtext.getText().toString());
			edtext.setText("");
			break;

		case R.id.buttonequal:
			if (edtext.getText().toString().equals(""))
				break;
			secondoperand = Float.parseFloat(edtext.getText().toString());
			performOperation();
			break;

		case R.id.buttoncancel:
			edtext.setText("");
			secondoperand=firstoperand=0;
			break;

		default:
			String number = ((Button) v).getText().toString();
			String current = edtext.getText().toString();
			current += number;
			edtext.setText(current);
			break;
		}

	}
}

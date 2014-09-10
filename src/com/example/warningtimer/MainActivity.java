package com.example.warningtimer;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.activeandroid.ActiveAndroid;

public class MainActivity extends Activity {
	// protected static final int RTC = 0;
	Spinner t_year;
	Spinner t_month;
	Spinner t_day;
	EditText t_name;
	Spinner t_before;
	int timing;
	String i_year;
	String i_month;
	String i_day;
	String i_before;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// �A�C�e����ǉ����܂�
		for (int i = 2014; i < 2021; i++) {
			adapter.add(i + "");
		}
		t_year = (Spinner) findViewById(R.id.Spinner1);
		// �A�_�v�^�[��ݒ肵�܂�
		t_year.setAdapter(adapter);
		// �X�s�i�[�̃A�C�e�����I�����ꂽ���ɌĂяo�����R�[���o�b�N���X�i�[��o�^���܂�
		t_year.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				Spinner spinner = (Spinner) parent;
				// �I�����ꂽ�A�C�e�����擾���܂�
				String item = (String) spinner.getSelectedItem();
				Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG)
						.show();
				i_year = item;
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});

		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item);
		adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// �A�C�e����ǉ����܂�
		for (int i = 1; i < 13; i++) {
			adapter1.add(i + "");
		}
		t_month = (Spinner) findViewById(R.id.Spinner2);
		// �A�_�v�^�[��ݒ肵�܂�
		t_month.setAdapter(adapter1);
		// �X�s�i�[�̃A�C�e�����I�����ꂽ���ɌĂяo�����R�[���o�b�N���X�i�[��o�^���܂�
		t_month.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				Spinner spinner = (Spinner) parent;
				// �I�����ꂽ�A�C�e�����擾���܂�
				String item = (String) spinner.getSelectedItem();
				Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG)
						.show();
				i_month = item;
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});

		ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item);
		adapter11
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// �A�C�e����ǉ����܂�
		for (int i = 1; i < 32; i++) {
			adapter11.add(i + "");
		}
		t_before = (Spinner) findViewById(R.id.Spinner4);
		// �A�_�v�^�[��ݒ肵�܂�
		t_before.setAdapter(adapter11);
		// �X�s�i�[�̃A�C�e�����I�����ꂽ���ɌĂяo�����R�[���o�b�N���X�i�[��o�^���܂�
		t_before.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				Spinner spinner = (Spinner) parent;
				// �I�����ꂽ�A�C�e�����擾���܂�
				String item = (String) spinner.getSelectedItem();
				Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG)
						.show();
				i_day = item;
				timing = Integer.parseInt(item);

				Intent i = new Intent(getApplicationContext(),
						OtherActivity.class); // ReceivedActivity���Ăяo���C���e���g���쐬
				PendingIntent sender = PendingIntent.getBroadcast(
						MainActivity.this, 0, i, 0); // �u���[�h�L���X�g�𓊂���PendingIntent�̍쐬

				Calendar calendar = Calendar.getInstance(); // Calendar�擾
				calendar.setTimeInMillis(System.currentTimeMillis()); // ���ݎ������擾
				calendar.add(Calendar.SECOND, 3600);

				AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE); // AlramManager�擾
				am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
						sender);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});

		ArrayAdapter<String> adapter111 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item);
		adapter111
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// �A�C�e����ǉ����܂�
		for (int i = 1; i < 32; i++) {
			adapter111.add(i + "");
		}
		t_day = (Spinner) findViewById(R.id.Spinner3);
		// �A�_�v�^�[��ݒ肵�܂�
		t_day.setAdapter(adapter111);
		// �X�s�i�[�̃A�C�e�����I�����ꂽ���ɌĂяo�����R�[���o�b�N���X�i�[��o�^���܂�
		t_day.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				Spinner spinner = (Spinner) parent;
				// �I�����ꂽ�A�C�e�����擾���܂�
				String item = (String) spinner.getSelectedItem();
				Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG)
						.show();
				i_before = item;
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
		// 3t_month.setInputType(InputType.TYPE_DATETIME_VARIATION_DATE);
		t_day = (Spinner) findViewById(R.id.Spinner3);
		t_name = (EditText) findViewById(R.id.editText4);
		t_before = (Spinner) findViewById(R.id.Spinner4);

	}

	public void dasei(View v) {
		try {
			ActiveAndroid.beginTransaction();

			Item item = new Item();

			item.save();

			ActiveAndroid.setTransactionSuccessful();
		} finally {
			ActiveAndroid.endTransaction();
		}
		Intent intent = new Intent();
		intent.setAction(intent.ACTION_MAIN);
		intent.setClass(MainActivity.this, OtherActivity.class);
		startActivity(intent);
	}

	/*
	 * public void setTitle(String string) { At_year = string; }
	 * 
	 * public void setName(String string) { At_month = string; }
	 * 
	 * public void setWords(String string) { At_day = string; }
	 * 
	 * public void setNumber(String string) { At_before = string; }
	 */

	/*
	 * Item item = new Item(); item.At_year = i_year; item.At_month = i_month;
	 * item.At_day = i_day; item.At_before = i_before;
	 * 
	 * item.save();
	 * 
	 * // �S�Ď惊���� List<Item> list = new Select().from(Item.class).execute(); for
	 * (Item i : list) { Log.d("At_year: ", i.At_year); Log.d("At_month: ",
	 * i.At_month); Log.d("At_day: ", i.At_day); Log.d("At_before: ",
	 * i.At_before); }
	 */

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

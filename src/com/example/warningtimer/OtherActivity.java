package com.example.warningtimer;

import java.util.List;

import com.activeandroid.query.Select;

import android.app.Activity;
import android.os.Bundle;

public class OtherActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other);
		getAll(Item item);
	}
}
public static List<Item> getAll(Item item){
	return new Select()
	.from(Item.class)
	.where("Item = ?",item.getId())
	.orderBy("Name ASC")
	.execute();
.executeSingle();
	
}	
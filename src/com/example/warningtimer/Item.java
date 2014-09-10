package com.example.warningtimer;

import java.util.List;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

@Table(name = "table01")
public class Item extends Model {
	@Column(name = "i_year")
	public String At_year;

	@Column(name = "i_before")
	public String At_month;

	@Column(name = "i_day")
	public String At_day;

	/*
	 * @Column(name = "i_before") public String At_before;
	 */
	public Item() {
		super();
	}

	public static List<Item> getAll(Item item) {
		return new Select()//
				.from(Item.class)//
				.where("Item = ?", item.getId())//
				.orderBy("Name ASC")//
				.execute();//

	}
}

package com.example.warningtimer;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

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
}

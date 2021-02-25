package edu.bit.ex.page;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	private double pageNum;
	private int amount;

	public Criteria() {
		this(1, 10);
	}

	public Criteria(double pageNum, int amout) {
		this.pageNum = pageNum;
		this.amount = amout;
	}
}

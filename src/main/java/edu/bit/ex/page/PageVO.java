package edu.bit.ex.page;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageVO {
	private int displayPageCount = 5;
	private int startPage;
	private int endPage;
	private boolean prev, next;

	private int total;
	private Criteria cri;

	public PageVO() {

	}

	public PageVO(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		this.endPage = (int) (Math.ceil(cri.getPageNum() / displayPageCount) * displayPageCount);
		System.out.println("endPage = " + endPage);
		this.startPage = endPage - (displayPageCount - 1);

		int realEnd = (int) Math.ceil((total - 1.0) / cri.getAmount());

		if (realEnd <= this.endPage) {
			this.endPage = realEnd;
		}

		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}

	public String makeQuery(int page) {
		UriComponents uriComponentsBuilder = UriComponentsBuilder.newInstance().queryParam("pageNum", page)
				.queryParam("amout", cri.getAmount()).build();
		System.out.println(uriComponentsBuilder.toUriString());
		return uriComponentsBuilder.toUriString();
	}
}

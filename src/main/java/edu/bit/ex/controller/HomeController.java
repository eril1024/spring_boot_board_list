package edu.bit.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class HomeController {

	BoardService service;

	@RequestMapping("/")
	public String home(Model model) {
		BoardVO board = new BoardVO();
		board.setBcontent("컨텐츠");
		board.setBtitle("타이틀");
		board.setBname("홍길동");
		
		model.addAttribute("board", board);
		
		return "thymeleaf/index";
		
	}

}

package edu.bit.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.bit.ex.page.Criteria;
import edu.bit.ex.page.PageVO;
import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
public class BController {

	BoardService service;

	@GetMapping("/board")
	public String listPage(Model model, Criteria cri) {
		log.info("c.listPage()");
		model.addAttribute("list", service.list(cri));

		int total = service.getTotal(cri);
		log.info("total = " + total);

		model.addAttribute("pageMaker", new PageVO(cri, total));
		return "thymeleaf/list";
	}

	@GetMapping("/content_view")
	public String content_view(Model model, BoardVO boardVO) {
		log.info("c.content_view()");
		model.addAttribute("content_view", service.getContent(boardVO));
		return "thymeleaf/content_view";
	}

	@GetMapping("/reply_view")
	public String reply_view(Model model, BoardVO boardVO) {
		log.info("c.reply_view()");
		model.addAttribute("reply_view", service.getReplyView(boardVO));
		return "thymeleaf/reply_view";

	}

	@PostMapping("/reply")
	public String reply(BoardVO boardVO) {
		log.info("c.reply()");
		service.reply(boardVO);
		return "redirect:board";
	}

	@GetMapping("/delete")
	public String delete(BoardVO boardVO) {
		log.info("c.delete()");
		service.delete(boardVO);
		return "redirect:board";

	}

	@PostMapping("/modify")
	public String modify(BoardVO boardVO) {
		log.info("c.modify()");
		service.modify(boardVO);
		return "redirect:board";

	}

	@GetMapping("/write_view")
	public String write_view() {
		return "thymeleaf/write_view";
	}

	@PostMapping("/write")
	public String write(BoardVO boardVO) {
		log.info("c.write()");
		service.write(boardVO);
		return "redirect:board";
	}

}

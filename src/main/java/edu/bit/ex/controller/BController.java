package edu.bit.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.bit.ex.page.Criteria;
import edu.bit.ex.page.PageVO;
import edu.bit.ex.service.BoardService;
import lombok.AllArgsConstructor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
public class BController {

	BoardService service;

	@GetMapping("/board")
	public String list(Model model, Criteria cri) {
		log.info("listPage()");
		model.addAttribute("list", service.list(cri));

		int total = service.getTotal(cri);
		log.info("total = " + total);

		model.addAttribute("pageMaker", new PageVO(cri, total));
		return "thymeleaf/list";
	}

}

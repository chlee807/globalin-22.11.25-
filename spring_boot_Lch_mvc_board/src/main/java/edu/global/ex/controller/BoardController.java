package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.global.ex.page.Criteria;
import edu.global.ex.page.PageVO;
import edu.global.ex.service.BoardService;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	//http://localhost:8282/list2?pageNum=5&amount=10">1</a>
	   @GetMapping("/list2")
	   public String list2(Criteria cri, Model model) {
	      log.info("list2() ..");
	      log.info("list2() Criteria " + cri);      
	      
	      model.addAttribute("boards",boardService.getList(cri));
	      
	      int total = boardService.getTotal();
	      log.info("total" + total);         
	      
	      model.addAttribute("pageMaker", new PageVO(cri, total));   
	      
	      return "list2";
	   }
	
	@GetMapping("/board/tables")
	public String list(Model model) {
		log.info("list()..");

		model.addAttribute("boards", boardService.getList());
		return "board/table_board";
	}

	@GetMapping("/write_view")
	public String write_view() {
		log.info("write_view()..");

		return "write_view";
	}

	@PostMapping("/write")
	public String write(BoardVO boardVO) {
		log.info("write()..");

		boardService.register(boardVO);

		return "redirect:list";
	}

	// http://localhost:8282/content_view?bid=41
	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		log.info("content_view()..");

		int bid = boardVO.getBid();
		model.addAttribute("content_view", boardService.read(bid));

		return "content_view";
	}

	// http://localhost:8282/delete?bid=28
	@GetMapping("/delete")
	public String delete(BoardVO boardVO) {
		log.info("delete()..");

		int rn = boardService.remove(boardVO);
		log.info("delete() .. result number::" + rn);

		return "redirect:list";
	}

	// http://localhost:8282/reply_view?bid=28
	@GetMapping("/reply_view")
	public String reply_view(BoardVO boardVO, Model model) {
		log.info("reply_view()..");

		System.out.println(boardVO.getBid());
		model.addAttribute("reply_view", boardService.read(boardVO.getBid()));

		return "reply_view";
	}

	// http://localhost:8282/reply
	@PostMapping("/reply")
	public String reply(BoardVO boardVO) {
		log.info("reply()..");

		boardService.registerReply(boardVO);

		return "redirect:list";
	}
}

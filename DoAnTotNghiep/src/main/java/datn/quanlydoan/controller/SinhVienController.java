package datn.quanlydoan.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import datn.quanlydoan.service.SinhVienService;

@Controller
@Transactional
public class SinhVienController {
	@Autowired
	SinhVienService sinhVienService;

	@GetMapping("/sinhvien")
	public String index(Model model) {
		model.addAttribute("sinhVienService", sinhVienService.findAll());
		return "giaovu/listStudent";
	}
}

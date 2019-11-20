package datn.quanlydoan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import datn.quanlydoan.model.SinhVien;
import datn.quanlydoan.repository.SinhVienRepository;
@Component
public class SinhVienService {
	@Autowired
	SinhVienRepository sinhVienRepo;

	public List<SinhVien> findAll() {
		return sinhVienRepo.findAll();
	}
}

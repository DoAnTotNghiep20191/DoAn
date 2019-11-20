package datn.quanlydoan.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import datn.quanlydoan.model.GiangVien;
import datn.quanlydoan.model.TaiKhoan;

@Repository
public interface GiangVienRepository extends JpaRepository<GiangVien, Long> {

}
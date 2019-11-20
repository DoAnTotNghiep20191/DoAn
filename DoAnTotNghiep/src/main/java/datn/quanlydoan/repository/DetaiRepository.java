package datn.quanlydoan.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import datn.quanlydoan.model.DeTai;
import datn.quanlydoan.model.TaiKhoan;


@Repository
public interface DetaiRepository extends JpaRepository<DeTai, Long> {

}
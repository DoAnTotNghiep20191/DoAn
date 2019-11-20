package repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.BaiDang;
import model.TaiKhoan;

@Repository
public interface BaiDangRepository extends JpaRepository<BaiDang, Long> {
	

}
package controller;
 
import java.util.List;
 
import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
 
@Controller
@Transactional
@RequestMapping("/Trangchu-sinhvien")
public class SinhVienController {
 
    // GET: Hiển thị trang login
    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String login(Model model) {
 
        return "giangvien/TrangChu";
    }
 
    @RequestMapping(value = { "/thongtinsinhvien" })
    public String home(Model model) {
 
        return "giangvien/GiangVien";
    }
    
    @RequestMapping(value = { "/thongtingiangvien" })
    public String home1(Model model) {
 
        return "giangvien/GiangVien";
    }
    
    @RequestMapping(value = { "/danhsachbaitap" })
    public String home2(Model model) {
 
        return "giangvien/GiangVien";
    }
    
    @RequestMapping(value = { "/chitietbaitap" })
    public String home3(Model model) {
 
        return "giangvien/GiangVien";
    }
    
    @RequestMapping(value = { "/danhgiabaitap" })
    public String home4(Model model) {
 
        return "giangvien/GiangVien";
    }
    
    
    @RequestMapping(value = { "/thongke" })
    public String home5(Model model) {
 
        return "giangvien/GiangVien";
    }
    
    @RequestMapping(value = { "/danhsachtrochuyen" })
    public String home6(Model model) {
 
        return "giangvien/GiangVien";
    }
    
    @RequestMapping(value = { "/chitiettrochuyen" })
    public String home7(Model model) {
 
        return "giangvien/GiangVien";
    }
    
    @RequestMapping(value = { "/nopbaitap" }, method = RequestMethod.POST )
    public String home8(Model model) {
 
        return "giangvien/GiangVien";
    }
    
    @RequestMapping(value = { "/taotrochuyen" }, method = RequestMethod.POST )
    public String home9(Model model) {
 
        return "giangvien/GiangVien";
    }
    
    
    
    
    
 
}
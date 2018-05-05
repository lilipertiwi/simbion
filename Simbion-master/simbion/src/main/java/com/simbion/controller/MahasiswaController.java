package com.simbion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MahasiswaController {
	
	@Autowired
    
	@RequestMapping("/")
    public String index ()
    {
		return "index";
    }	
    
    @RequestMapping("/login")
    public String login ()
    {
        return "form-login";
    }
    
    @RequestMapping("/register")
    public String register()
    {
        return "form-register-mahasiswa";
    }
    
    @RequestMapping("/register-individual")
    public String register_i()
    {
        return "form-register-individual";
    }
    
    @RequestMapping("/register-yayasan")
    public String register_y()
    {
        return "form-register-yayasan";
    }
    
    @RequestMapping("/success")
    public String success()
    {
        return "tambah-sukses";
    }

    @RequestMapping("/viewall-pengumuman")
    public String viewall_pengumuman()
    {
        return "viewall-pengumuman";
    }
    
    @RequestMapping("/view-pengumuman")
    public String view_pengumuman()
    {
        return "view-pengumuman";
    }

    @RequestMapping("/skema/tambah")
    public String daftar_paket ()
    {
    	return "daftarskemabeasiswa";
    }
    
    @RequestMapping("/skema/tambah/beasiswa")
    public String daftar_beasiswa()
    {
    	return "beasiswa_aktif";
    }
    
    @RequestMapping("/skema/lihat")
    public String lihat_beasiswa()
    {
    	return "list_beasiswa";
    }
    
    @RequestMapping("/skema/detail")
    public String detail ()
    {
    	return "detail_beasiswa";
    }
    
    @RequestMapping("/info/pembayaran")
    public String info_bayar()
    {
    	return "info_pembayaran";
    }
    
    @RequestMapping("/viewall")
    public String viewall ()
    {
        return "viewall";
    }
    
    @RequestMapping("/beasiswa/daftar")
    public String daftarBeasiswa ()
    {
        return "daftarbeasiswa";
    }
    
    @RequestMapping("/beasiswa/donatur/lihat")
    public String lihatBeasiswa ()
    {
        return "lihat-beasiswa-donatur";
    }
    
    @RequestMapping("/beasiswa/donatur/detail/lihat")
    public String lihatDetailBeasiswa ()
    {
        return "detail-beasiswa-donatur";
    }
    
    @RequestMapping("/beasiswa/tempatwawancara")
    public String tempatWawancara ()
    {
        return "tempat-wawancara";
    } @RequestMapping("/lihat")
    public String view ()
    {
    	return "viewall";
    }
}

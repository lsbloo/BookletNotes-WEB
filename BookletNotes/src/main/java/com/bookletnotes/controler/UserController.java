package com.bookletnotes.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bookletnotes.repository.UserRepository;
import com.bookletnotes.model.User;
import java.util.List;
import java.util.Optional;


@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/listUser",method=RequestMethod.GET)
	public List<User> usuarioscadastrados(){
		return (List<User>) userRepository.findAll();
	}
	

	@RequestMapping(value="/cadastrarUsuario",method=RequestMethod.GET)
	public String cadastrarUsuario(User user) {
		
		//userRepository.saveAndFlush(user);
		return "/eventos/formularioCadastro";
	}
	
	@RequestMapping(value="/cadastrarUsuario",method=RequestMethod.POST)
	public String cadastrarUsuarioPOST(User user) {
		System.err.println(user.getNome());
		System.err.println(user.getEmail());
		System.err.println(user.getPassword());
		System.err.println(user.getLogin());
		System.err.println(user.getCpf());
		System.err.println(user.getEndereco());
		userRepository.save(user);
		//userRepository.saveAndFlush(user);
		return "index";
	}
	
	@RequestMapping(value="/usuariosCadastrados",method=RequestMethod.GET)
	public ModelAndView listaDeUsuarios() {
		ModelAndView m = new ModelAndView("index");
		Iterable<User> usuario = userRepository.findAll();
		if(usuario!=null) {
			m.addObject("usuarios",usuario);
		}else {
			System.err.println("REPOSITORIO DE USUARIOS VAZIO!");
		}
		
		return m;
	}
	
	@RequestMapping(value="/findUser/{id}",method=RequestMethod.GET)
	public ModelAndView detUser(@PathVariable("filtro") String id) {
		User user = userRepository.findByNome(Long.parseLong(id));
		ModelAndView m = new ModelAndView("DetailsBusca");
		
		System.out.println("okS!");
		m.addObject("buscaUser",user);
		return m;
		
		
	}
	
	
	

}

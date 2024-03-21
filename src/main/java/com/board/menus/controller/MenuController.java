package com.board.menus.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.menus.domain.MenuVo;
import com.board.menus.mapper.MenuMapper;

@Controller
@RequestMapping("/Menus")
public class MenuController {
	
	@Autowired
	private MenuMapper menuMapper;
	
	
	@RequestMapping("/WriteForm")
	public String writeForm() {
		return "menus/write";
	}
	
	
	/* @RequestMapping("/Write")
	public String write( MenuVo menuVo) {
		menuMapper.insertMenu( menuVo );
		return "menus/list";
	} */
	
	@RequestMapping("/List")
	public String list( Model model) {
		
		ArrayList<MenuVo> menuList = menuMapper.getMenuList();
		
		model.addAttribute( "menulist" + menuList );
		System.out.println( "MenuController list() menuList:" + menuList);
		
		return "menus/list";
	}
	
	

}

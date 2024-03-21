package com.board.menus.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.board.menus.domain.MenuVo;

@Mapper
public interface MenuMapper {

	void insertMenu(MenuVo menuVo);

	ArrayList<MenuVo> getMenuList();

	

}

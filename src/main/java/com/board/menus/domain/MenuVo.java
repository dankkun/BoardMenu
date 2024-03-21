package com.board.menus.domain;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MenuVo {
	
	@Nonnull
	private String menu_id;
	private String menu_name;
	private int menu_seq;
	
	

	
	

}

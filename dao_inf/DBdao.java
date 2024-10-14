package dao_inf;

import java.util.ArrayList;

import dto.WordDTO;

public interface DBdao {
	// 추상메서드 
	// 추상메서드는 구현이 안댐 
	public void add(WordDTO wdto);
	public ArrayList<WordDTO> selectAll();
	public void mod(WordDTO wdto);
	public void delete(WordDTO wdto);
}

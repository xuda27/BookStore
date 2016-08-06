package cn.tf.dao;

import java.util.List;

import cn.tf.domain.Category;

public interface CategoryDao {
	
	/**
	 * 
	 * @param category
	 */
	public void save(Category category);
	
	/**
	 * 查询所有分类
	 * @return 
	 */
	public List<Category> findAll();

	/**
	 * 通过指定
	 * @param categoryName
	 * @return
	 */
	Category findByName(String categoryName);

	public void deleteByName(String categoryName);
	

}

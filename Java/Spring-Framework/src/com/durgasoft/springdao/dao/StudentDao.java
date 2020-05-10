/**
 * 
 */
package com.durgasoft.springdao.dao;

import java.util.List;

import com.durgasoft.springdao.model.Student;

/**
 * @author i80779
 *
 */
public interface StudentDao {
	public int save(Student student) throws Exception;
	public boolean update(Student student) throws Exception;
	public boolean delete(Student student) throws Exception;
	public Student findById(Student student) throws Exception;
	public List<Student> findByName(Student student) throws Exception;
	public List<Student> findByEmail(Student student) throws Exception;
	public List<Student> findByAddress(Student student) throws Exception;
	public List<Student> findAll() throws Exception;

}

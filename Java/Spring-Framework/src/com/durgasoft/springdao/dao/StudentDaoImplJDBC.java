/**
 * 
 */
package com.durgasoft.springdao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import com.durgasoft.springdao.model.Student;

/**
 * @author i80779
 *
 */
public class StudentDaoImplJDBC implements StudentDao {

	private DataSource ds;
	/* (non-Javadoc)
	 * @see com.durgasoft.springdao.dao.StudentDao#save(com.durgasoft.springdao.model.Student)
	 */
	@Override
	public int save(Student student) throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
		ps.setInt(1, student.getId());
		ps.setString(2, student.getName());
		ps.setString(3, student.getEmail());
		ps.setString(4, student.getAddress());
		
		int status = ps.executeUpdate();
		con.close();
		return status;
	}

	/* (non-Javadoc)
	 * @see com.durgasoft.springdao.dao.StudentDao#update(com.durgasoft.springdao.model.Student)
	 */
	@Override
	public boolean update(Student student) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.durgasoft.springdao.dao.StudentDao#delete(com.durgasoft.springdao.model.Student)
	 */
	@Override
	public boolean delete(Student student) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.durgasoft.springdao.dao.StudentDao#findById(com.durgasoft.springdao.model.Student)
	 */
	@Override
	public Student findById(Student student) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.durgasoft.springdao.dao.StudentDao#findByName(com.durgasoft.springdao.model.Student)
	 */
	@Override
	public List<Student> findByName(Student student) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.durgasoft.springdao.dao.StudentDao#findByEmail(com.durgasoft.springdao.model.Student)
	 */
	@Override
	public List<Student> findByEmail(Student student) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.durgasoft.springdao.dao.StudentDao#findByAddress(com.durgasoft.springdao.model.Student)
	 */
	@Override
	public List<Student> findByAddress(Student student) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.durgasoft.springdao.dao.StudentDao#findAll()
	 */
	@Override
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

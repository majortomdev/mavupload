/*made by JoeKin 14-jul-20*/
package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import models.Video;

@Repository
public class VideoDAOImpl implements VideoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public long save(Video video) {
		return 0;
	}

	public Video get(long id) {
		return null;
	}

	public List<Video> list() {
		@SuppressWarnings("unchecked")
		List<Video> list = sessionFactory.getCurrentSession().createQuery("FROM Video").list();
		return list;
	}

	public void update(long id, Video video) {
		
	}

	public void delete(long id) {
		
	}

}

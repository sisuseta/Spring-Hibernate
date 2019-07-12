/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.user.dac.dao;

import com.sbmms.dac.impl.GenericDAOImpl;
import com.sbmms.user.dac.modal.User;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author TP00455540
 */
@Repository("userDAO")
public class UserDAO extends GenericDAOImpl<Integer, User> {
    @Transactional(readOnly=true)
    public com.sbmms.user.util.User findByUserName(String ssn) throws Exception{
        Criteria criteria = createEntityCriteria();
	criteria.add(Restrictions.eq("userName", ssn));
         Mapper map = new DozerBeanMapper();
         return map.map((User) criteria.uniqueResult(), com.sbmms.user.util.User.class);
    }

}

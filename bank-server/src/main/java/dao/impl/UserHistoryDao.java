package dao.impl;

import Const.UserOperateStatusType;
import Const.UserOperateType;
import dao.IUserHistoryDao;
import entity.UserHistoryEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtils;

import java.util.Date;
import java.util.List;

public class UserHistoryDao implements IUserHistoryDao {
    private static IUserHistoryDao instance = null;
    private Session session = HibernateUtils.getSessionFactory().openSession();

    public static IUserHistoryDao getInstance() {
        if (instance == null) {
            return new UserHistoryDao();
        }
        return instance;
    }

    @Override
    public void addOperationHistory(UserHistoryEntity operationHistory) {
        try {
            session.getTransaction().begin();

            session.save(operationHistory);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public List<UserHistoryEntity> getOperationHistoriesTodayByUserId(Long userId) {
        try {
            session.getTransaction().begin();

            Query query = session.createQuery("from UserHistoryEntity " +
                    "where userId = ? and " +
                    "year(operateTime) = ? and " +
                    "month(operateTime) = ? and " +
                    "day(operateTime) = ? order by operateTime desc");
            query.setParameter(0, userId);
            query.setParameter(1, new Date().getYear());
            query.setParameter(2, new Date().getMonth());
            query.setParameter(3, new Date().getDay());

            session.getTransaction().commit();

            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
    }

    @Override
    public UserHistoryEntity getLastLoginRecordByUserId(Long userId) {
        try {

            session.getTransaction().begin();
            Query query = session.createQuery("from UserHistoryEntity " +
                    "where userId=:userId and " +
                    "operateType=:operateType and " +
                    "status=:status " +
                    "order by operateTime desc");
            query.setParameter("userId", userId);
            query.setParameter("operateType", UserOperateType.LOGIN);
            query.setParameter("status", UserOperateStatusType.SUCCESS);
            query.setMaxResults(1);
            session.getTransaction().commit();
            return (UserHistoryEntity) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
    }

    public Long getBiggestOperationNo() {
        try {
            session.getTransaction().begin();
            Query query = session.createQuery("select operateNo from UserHistoryEntity order by operateNo desc ");

            Long id = (Long) query.setMaxResults(1).uniqueResult();

            session.getTransaction().commit();
            return id;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }
    }

//    public int selectUserOperationHistoriesByUserId(Long userId) {
//        Session session = HibernateUtils.getSessionFactory().openSession();
//        session.beginTransaction();
//        Query query = session.createQuery("from UserEntity where userId=?");
//        query.setParameter(0, userId);
//        query.setMaxResults(1);
//
//        return result;
//    }
}

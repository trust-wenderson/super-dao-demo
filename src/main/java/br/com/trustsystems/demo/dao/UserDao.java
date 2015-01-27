package br.com.trustsystems.demo.dao;


import br.com.trustsystems.demo.entities.User;
import br.com.trustsystems.demo.provider.DatabasePersistenceProvider;
import br.com.trustsystems.persistence.dao.IPersistenceProvider;
import br.com.trustsystems.persistence.dao.TypedDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserDao extends TypedDao<Long, User>
{

    @Autowired
    private DatabasePersistenceProvider dbPersistenceProvider;

    public UserDao()
    {
        super(Long.class, User.class);
    }

    @Override
    protected IPersistenceProvider getPersistenceProvider()
    {
        return dbPersistenceProvider;
    }
}

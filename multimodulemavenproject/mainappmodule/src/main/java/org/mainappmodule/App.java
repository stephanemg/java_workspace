package org.mainappmodule;

import java.util.HashMap;
import java.util.Map;

import org.daomodule.Dao;
import org.entitymodule.User;
import org.userdaomodule.UserDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  Map<Integer, User> users = new HashMap<>();
          users.put(1, new User("Julie"));
          users.put(2, new User("David"));
          Dao userDao = new UserDao(users);
          userDao.findAll().forEach(System.out::println);
    }
}

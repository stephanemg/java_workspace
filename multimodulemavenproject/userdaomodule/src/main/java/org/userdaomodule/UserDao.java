package org.userdaomodule;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.daomodule.Dao;
import org.entitymodule.User;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UserDao implements Dao<User> {

	  Map<Integer, User> users;
	 
	    
	 


		@Override
	    public Optional<User> findById(int id) {
	        return Optional.ofNullable(users.get(id));
	    }
	 
	    @Override
	    public List<User> findAll() {
	        return new ArrayList<>(users.values());
	    }
}

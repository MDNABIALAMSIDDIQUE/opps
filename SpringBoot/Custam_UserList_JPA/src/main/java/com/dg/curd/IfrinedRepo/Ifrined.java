package com.dg.curd.IfrinedRepo;
			
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dg.curd.modal.Userinfo;
		
		public interface Ifrined extends CrudRepository<Userinfo, Integer> {
		//Custom Query
			@Query("select u  from Userinfo u")
			public List<Userinfo> getAllUser();
			
			
			// Custom Query Method with where 
			@Query("select u from Userinfo u WHERE u.name  =:n")
			public List<Userinfo>getFriendNamme(@Param("n") String name);
			
			// Custom Query Method with where 
						@Query("select u from Userinfo u WHERE u.name  =:n and u.city=:c")
						public List<Userinfo>getFriendNamme2(@Param("n") String name,@Param("c")String city);
						
						
			//natvie Query
						@Query(value ="Select * from  Userinfo",nativeQuery = true)
						public List<Userinfo> getUserInfo();
			
			// Custom Method
			public List<Userinfo> findByName(String name);
			public  List<Userinfo> findByNameAndCity(String name, String city); 
			
			
		}

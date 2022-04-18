package com.MTB.DTOtoEntity;
import org.springframework.stereotype.Component;

import com.MTB.dto.UsersDTO;
import com.MTB.entites.Users;



@Component
public class UserDtoToEntity {
   public Users usersConvertUsersDtoEntity(UsersDTO usersDTO) {
	   Users us =new Users();
	   us.setId(usersDTO.getId());
	   us.setName(usersDTO.getName());
	   us.setDateOfBirth(usersDTO.getDateOfBirth());
	   us.setEmailId(usersDTO.getEmailId());
	   us.setMobileNumber(usersDTO.getMobileNumber());
	   us.setPassward(usersDTO.getPassward());
	   us.setcPassward(usersDTO.getcPassward());
	   return us;
   }
   public Users entityToDto(Users users) {
	   Users usersDTO = new Users();
	   usersDTO.setId(users.getId());
	   usersDTO.setName(users.getName());
	   usersDTO.setEmailId(users.getEmailId());
	   usersDTO.setMobileNumber(users.getMobileNumber());
	   usersDTO.setDateOfBirth(users.getDateOfBirth());
	   usersDTO.setPassward(users.getPassward());
	   usersDTO.setcPassward(users.getcPassward());
	   return usersDTO;
	   }
}
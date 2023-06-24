package com.yourBus.yourBus.Services;
import com.yourBus.yourBus.Payloads.UserDTO;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Page;

public interface UserService {
    public UserDTO createUser(UserDTO userDTO);
    public Page<UserDTO> getUsers(int page, int size, String sortBy, String sortOrder);
    public void deleteUser(Long id);
    public UserDTO updateUser(Long id, UserDTO userDTO);

    InputStreamResource getUserAsExcel();
    InputStreamResource getUserAsPdf() throws Exception;
    InputStreamResource getUserCsv();


}

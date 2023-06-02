package mu.mcb.reward.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mu.mcb.reward.enums.Role;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

  private String firstname;
  private String lastname;
  private String email;
  private String password;
  private Role role;
}

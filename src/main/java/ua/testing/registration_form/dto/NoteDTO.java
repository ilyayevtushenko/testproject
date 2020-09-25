package ua.testing.registration_form.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class NoteDTO {

    private String firstName;
    private String lastName;
    private String login;
    private String email;
    private String password;

}

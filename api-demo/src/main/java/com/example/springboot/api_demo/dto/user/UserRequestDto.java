package com.example.springboot.api_demo.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserRequestDto {

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]{1,253}\\.[a-zA-Z]{2,}$";

    @NotBlank(message = "名前は必須です。空文字以外の値をセットしてください。")
    private String name;
    @Pattern(regexp = EMAIL_REGEX, message = "メールアドレスは必須です。255文字以内の有効なメールアドレスを入力してください。")
    private String email;
    private boolean isActive;
}

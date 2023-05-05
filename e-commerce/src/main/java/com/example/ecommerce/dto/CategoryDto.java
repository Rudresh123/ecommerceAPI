package com.example.ecommerce.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer id;
    private @NotEmpty String categoryName;
    private @NotEmpty String description;
    private @NotEmpty String imageUrl;
}

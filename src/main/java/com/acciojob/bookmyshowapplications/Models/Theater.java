package com.acciojob.bookmyshowapplications.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "theaters")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Theater {

    @Id
    private Integer theaterId;

    private String name;

    private String address;

    private Integer noOfScreens;
}

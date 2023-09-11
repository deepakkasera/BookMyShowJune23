package models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {
    private String name;

    @ManyToOne
    private Region region;

    @OneToMany
    private List<Screen> screens;
}

/*
Find the cardinalities only for Non primitive attributes.

   1  --->    1
Theatre --- Region => M:1
   M   <--    1

    1    ->    M
Theatre ---- Screen => 1:M
    1    <-      1
 */
package com.ai.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
/**
 * Created by fdarmoch on 2015-12-28.
 */
public class Sth {

public Sth(){};

        @Id
        @GeneratedValue
        private Integer id;
        private String name;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }




}

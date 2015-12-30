package com.ai.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
/**
 * Created by fdarmoch on 2015-12-28.
 */
public class Sth2 {

public Sth2(){};

        @Id
        @GeneratedValue
        private Integer id;

        private String name;

        private Integer value;
///////////////////////////////////////////////////////////////////////


        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Integer getValue() {
                return value;
        }

        public void setValue(Integer value) {
                this.value = value;
        }

}

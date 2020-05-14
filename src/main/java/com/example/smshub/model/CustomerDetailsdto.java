package com.example.smshub.model;

public class CustomerDetailsdto {
       
       private int customer_id;
       private String name;
       private String operator_type;
       private String enterprise;
       private int customer_status;
       
       public void setCustomer_status(int customer_status) {
                       this.customer_status=customer_status;
       }
       public int getCustomer_status() {
                       return customer_status;
       }
       public int getCustomer_id() {
              return customer_id;
       }
       public void setCustomer_id(int customer_id) {
              this.customer_id = customer_id;
       }
       public String getName() {
              return name;
       }
       public void setName(String name) {
              this.name = name;
       }
       public String getOperator_type() {
              return operator_type;
       }
       public void setOperator_type(String operator_type) {
              this.operator_type = operator_type;
       }
       public String getEnterprise() {
              return enterprise;
       }
       public void setEnterprise(String enterprise) {
              this.enterprise = enterprise;
       }
}

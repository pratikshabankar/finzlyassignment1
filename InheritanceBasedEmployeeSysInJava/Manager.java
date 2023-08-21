package InheritanceBasedEmployeeSysInJava;

 class Manager extends Employee {
     private String department;




     public Manager(int id, String name, String department) {
         super(id, name);
         this.department = department;
     }
     @Override
     public String toString() {
         return "Manager[ id " +super.getId()+"name"+super.getName()+
                 "department='" + department + "]" ;

     }


 }

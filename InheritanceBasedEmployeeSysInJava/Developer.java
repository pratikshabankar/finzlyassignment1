package InheritanceBasedEmployeeSysInJava;

 class Developer extends Employee {
     private String programmingLanguage;

     public Developer(int id, String name, String programmingLanguage) {
         super(id, name);
         this.programmingLanguage = programmingLanguage;
     }
     @Override
     public String toString() {
         return "Developer [id =" + super.getId()+" name "+ super.getName() +" programmingLanguage=" + programmingLanguage + "]";
     }

 }

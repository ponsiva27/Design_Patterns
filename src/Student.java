public class Student {

      private int id;
      private String name;
      private double PSP;

      private Student(Builder build){
            this.id = build.getId();
            this.name = build.getName();
            this.PSP = build.getPSP();
      }


      public static Builder getBuilder(){
            return new Builder();
      }



      public static class Builder {


            private int id;

            private String name;
            private double PSP;

            public int getId() {
                  return id;
            }

            public Builder setId(int id) {
                  this.id = id;
                  return this;
            }



            public String getName() {
                  return name;
            }

            public Builder setName(String name) {
                  this.name = name;
                  return this;
            }

            public double getPSP() {
                  return PSP;
            }

            public Builder setPSP(double PSP) {
                  this.PSP = PSP;
                  return this;
            }

            public Student build(){
                  if(PSP<40){
                        throw new IllegalArgumentException("Student scored less mark"+ PSP );
                  }
                  return new Student(this);
            }

      }
}

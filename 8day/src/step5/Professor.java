package step5;

public class Professor extends Person{
	
		private String[] subjects;
		
		
		public void print_subj() {
			System.out.println(name+"교수의 개설 과목");
			for(int i=0;i<subjects.length;i++) {
				System.out.println("subjects"+subjects[i]);
			}
		}


		public String[] getSubjects() {
			return subjects;
		}


		public void setSubjects(String[] subjects) {
			this.subjects = subjects;
		}
		
		
}

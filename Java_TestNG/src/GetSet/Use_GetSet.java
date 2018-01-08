package GetSet;

public class Use_GetSet {

	public static void main(String a[]) {

		Getters_Setters gs = new Getters_Setters();
		gs.setAge(25);
		gs.setIdNum("VLS1269");
		gs.setName("Madhu");

		System.out.println("Values are : " + gs.getName() + " " + gs.getIdNum() + " " + gs.getAge());

	}
}
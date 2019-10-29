package capitulo005;

public class AutoPolicyTest {

	public static void main(String[] args) {
		
		AutoPolicy policy1 =
				new AutoPolicy (11111111, "Toyota Camry", "NJ");
		AutoPolicy policy2 =
				new AutoPolicy (22222222, "Ford Fusion", "ME");
		
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
		
	}

	public static void policyInNoFaultState (AutoPolicy policy) {
		System.out.println("A autopolítica equivale a: ");
		System.out.printf("Conta #: %d; Carro: %s; Estado %s %s é um estado sem culpa%n%n", policy.getAccountNumber(),policy.getMakeAndModel(),policy.getState(),(policy.isNoFaultState() ? "sim,": "não"));
	}
}

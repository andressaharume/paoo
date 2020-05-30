package fatec_ipi_paoo_sabado_strategy_exercicio;

public abstract class Character {
	
	WeaponBehavior weaponBehavior;
	
	public abstract void fight () ;
	
	public void setWeapon (WeaponBehavior w) {
		this.weapon = w;
	}

}

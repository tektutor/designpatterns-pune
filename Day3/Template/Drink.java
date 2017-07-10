public abstract class Drink {

	protected abstract void pickIngredients();
	protected abstract void mix();
	protected abstract void heat();
	protected abstract void dispense();

	public final void prepareDrink() {
		pickIngredients();
		mix();
		heat();
		dispense();
	}

}

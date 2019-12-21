package creational.builderpattern;

class BuilderPattern {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder( hawaiianPizzabuilder );
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
	}
}

//Product
class Pizza{
	private String sauce;
	private String topping;
	private String dough;
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getDough() {
		return dough;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	@Override
	public String toString() {
		return "Pizza [sauce=" + sauce + ", topping=" + topping + ", dough=" + dough + "]";
	}
	
	
}
/*Abstract Builder*/
abstract class PizzaBuilder{
	protected Pizza pizza;
	
	public Pizza getPizza(){
		return pizza;
	}
	
	public void createNewPizzaProduct() {
        pizza = new Pizza();
    }
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
}

/*Concrete Builder*/
class SpicyPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("pan baked");
		
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("hot");
		
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("pepperoni+salami");
		
	}
	
}

/*Concrete Builder*/
class HawaiianPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
}


/* "Director" */
class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
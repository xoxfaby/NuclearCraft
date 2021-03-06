package nc.recipe.ingredient;

import java.util.List;

import nc.recipe.IngredientSorption;
import net.minecraftforge.fluids.FluidStack;

public interface IFluidIngredient {
	
	public FluidStack getStack();
	
	public default FluidStack getNextStack() {
		FluidStack nextStack = getStack();
		nextStack.amount = getNextStackSize();
		return nextStack;
	}
	
	public List<FluidStack> getInputStackList();
	
	public List<FluidStack> getOutputStackList();
	
	public String getIngredientName();
	
	public String getIngredientNamesConcat();
	
	public default int getNextStackSize() {
		return getMaxStackSize();
	}
	
	public int getMaxStackSize();
	
	public void setMaxStackSize(int stackSize);
	
	public boolean matches(Object object, IngredientSorption sorption);
	
	public boolean isValid();
}

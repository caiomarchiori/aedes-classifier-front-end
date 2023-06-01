package Model.Interfaces;

import Model.Item;

public interface IConta {
	void addItem(Item item, int qtde);

	void removeItem(int index);

	double getTotal();

	StringBuilder listar();
}

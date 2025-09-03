package com.funso.abstractfactory;

public class ElfKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new ElfCastle();
	}

	@Override
	public King createKing() {
		// TODO Auto-generated method stub
		return new ElfKing();
	}

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new ElfArmy();
	}

}

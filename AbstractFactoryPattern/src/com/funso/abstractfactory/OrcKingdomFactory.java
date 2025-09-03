package com.funso.abstractfactory;

public class OrcKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new OrcCastle();
	}

	@Override
	public King createKing() {
		// TODO Auto-generated method stub
		return new OrcKing();
	}

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new OrcArmy();
	}

}

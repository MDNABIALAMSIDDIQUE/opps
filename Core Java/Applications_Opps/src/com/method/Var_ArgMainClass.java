package com.method;

public class Var_ArgMainClass  extends VarArgMethed_N_Number{
	public static void main(String[] args) {
		
		VarArgMethed_N_Number argMethed_N_Number = new VarArgMethed_N_Number();
		argMethed_N_Number.Add(2);
		argMethed_N_Number.Add();
		argMethed_N_Number.Add(20,10);
		argMethed_N_Number.Add(10,30,10);
	}
}

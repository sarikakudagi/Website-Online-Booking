package com.ilp.dao;
import java.util.*;

public class RandomGenerate {
	public static int random()
	{
		Random rd=new Random();
		int a=rd.nextInt(100000);
		return a;
	}

}

package com.heraizen.cj.day6.object;

public class DbConnection {
	static int i = 0;

	static DbConnection getObject() {
		if (i < 1) {
			i++;
			System.out.println(i + " create successfully");
			return new DbConnection();
		} else {
			try {
				throw new ObjectCreationException("you Already create an object for this Class");
			} catch (ObjectCreationException oce) {
				System.out.println(oce.getMessage());
			}
			return null;
		}

	}

	private DbConnection() {

	}
}

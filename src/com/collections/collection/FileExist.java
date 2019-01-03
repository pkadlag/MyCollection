/*A Java FileExist Application
accept the complete path of a file from the user and display whether the file exist or not.*/

package com.collections.collection;

import java.io.File;

public class FileExist {

	private String file;

	public FileExist(String file) {
		super();
		this.file = file;
	}

	public boolean isFileExists(FileExist object) {
		if (object.file == file) {
			return true; // (File Exist)
		}

		else {
			return false; // (File.notExist())
		}
	}

}

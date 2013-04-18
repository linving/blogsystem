package com.yingming.blogsystem.support;

import java.io.File;

public class FileOperation {
	public static boolean makeFolder(String folderPath) {
		File file = new File(folderPath);
		if (!file.exists()) {
			if (!file.mkdirs()) {
				return false;
			}
		}
		return true;
	}

	public static boolean deleteFile(String saveLocation) {
		File file = new File(saveLocation);
		if (file.exists()) {
			if (!file.delete()) {
				return false;
			}
		}
		return true;
	}
}

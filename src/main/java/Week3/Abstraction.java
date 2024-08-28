package Week3;

abstract class FileStorage {
	
	    abstract void SaveFile();
	}

	class LocalFileStorage extends FileStorage {
	    @Override
	    void SaveFile() {
	        System.out.println("Processing the Local FileStorage");
	    }
	}

	class CloudFileStorage extends FileStorage {
	    @Override
	    void SaveFile() {
	        System.out.println("Processing the Cloud FileStorage");
	    }
	}

	public class Abstraction {
	    public static void main(String[] args) {
	        LocalFileStorage localFileStorage = new LocalFileStorage();
	        CloudFileStorage cloudFileStorage = new CloudFileStorage();

	        localFileStorage.SaveFile();
	        cloudFileStorage.SaveFile();
	    }
	}

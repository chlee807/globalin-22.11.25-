package filename_with_extension;

public class FilenameWithExtension {
	public static void main(String[]args) {
		String fileNameWithExtension = "Hello.java";
		StringBuilder fileName = new StringBuilder();
		StringBuilder Extension = new StringBuilder();
		StringBuilder ExtensionReverse = new StringBuilder();
		int splitPoint = 0;
		for (int i = fileNameWithExtension.length()-1; i >= 0; i--) {
			if (fileNameWithExtension.charAt(i) == '.') {
				splitPoint = i;
				break;
			}
			ExtensionReverse.append(fileNameWithExtension.charAt(i));
		}
		for (int i = 0; i < splitPoint; i++) {
			fileName.append(fileNameWithExtension.charAt(i));
		}
		for (int i = ExtensionReverse.length()-1; i >= 0; i--) {
			Extension.append(ExtensionReverse.charAt(i));
		}
		System.out.println(fileName);
		System.out.println(Extension);
	}
}

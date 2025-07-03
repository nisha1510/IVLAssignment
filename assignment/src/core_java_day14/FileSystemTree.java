package core_java_day14;

import java.util.ArrayList;
import java.util.List;

class FileNode {
	String name;
	List<FileNode> children;

	public FileNode(String name) {
		this.name = name;
		this.children = new ArrayList<>();
	}

	public void addChild(FileNode child) {
		children.add(child);
	}

	public void print(String prefix) {
		System.out.println(prefix + name);
		for (FileNode child : children) {
			child.print(prefix + " ");
		}
	}
}

public class FileSystemTree {
	
	public static void main(String[] args) {
		FileNode root = new FileNode("Root");
		FileNode doc = new FileNode("Document");
		doc.addChild(new FileNode("core_java.docx"));
		doc.addChild(new FileNode("dsa.docx"));
		doc.addChild(new FileNode("bank_app.docx"));
		
		root.addChild(doc);
		root.print(" ");
		
	}
}

package core_java_day12;

import java.util.Stack;

public class BrowserHistory {

	Stack<String> backStack = new Stack();
	Stack<String> forwardStack = new Stack();
	String currentPage = "Home";

	public void visitPage(String url) {
		backStack.push(currentPage);
		currentPage = url;
		forwardStack.clear();
		System.out.println("visited "+currentPage);
	}
	
	public void back() {
		if(!backStack.isEmpty()) {
			forwardStack.push(currentPage);
			currentPage = backStack.pop();
			System.out.println("went back to "+currentPage);
		}
		else
		{
			System.out.println("No pages to go back");
		}
	}
	
	public void forward() { 
		if(!forwardStack.isEmpty()) {
    		backStack.push(currentPage);
    		currentPage = forwardStack.pop();
    		System.out.println("Went forward to : " +currentPage);
    	}
    	else
    	{
    		System.out.println("No pages to go to forward!");
    	}
	}
	
	public void currentPage() {
		System.out.println("current page : "+currentPage);
	}

	public static void main(String[] args) {
		BrowserHistory history = new BrowserHistory();
		history.visitPage("google.com");
		history.visitPage("openai.com");
		history.visitPage("github.com");
		
		history.back();
		history.back();
		history.back();
		
		history.forward();
		history.visitPage("stackOverflow");
		history.currentPage();
	}
}

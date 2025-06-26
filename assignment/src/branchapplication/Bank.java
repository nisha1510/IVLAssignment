package branchapplication;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Branch> branches = new ArrayList<>();

    public void addBranch(Branch branch) {
        branches.add(branch);
    }
    public Branch getBranchByName(String branchName) {
        for (Branch b : branches) {
            if (b.getBranch_name().equalsIgnoreCase(branchName)) {
                return b;
            }
        }
        return null; // or throw an exception if not found
    }

    public void showCustomersByBranchName(String branchName) {
        Branch branch = getBranchByName(branchName);
        if (branch != null) {
            branch.showCustomerList();
        } else {
            System.out.println("Branch '" + branchName + "' not found.");
        }
    }
}

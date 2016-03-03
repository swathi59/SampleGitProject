import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@ManagedBean(name ="helloworld")
@SessionScoped
public class HelloWorld {

	// TreeNode instance
    private TreeNode root;
    
 
    public HelloWorld(){
        // This is the root node, so it's data is root and its parent is null
        this.root = new DefaultTreeNode("Root Node", null);
        // Create child node
        TreeNode child = new DefaultTreeNode("Module", this.root);
        // Reference the parent of child node
        child.setParent(this.root);
        //Create descendent nodes
       TreeNode descendent = new DefaultTreeNode("Enter Module details below", child);
        // Reference the parent of descendent node
       descendent.setParent(child);
    }
 
    public TreeNode getRoot() {
        return root;
    }
 
    public void setRoot(TreeNode root) {
        this.root = root;
    }	
    
}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
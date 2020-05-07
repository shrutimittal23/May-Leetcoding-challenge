class Solution {
 HashMap<Integer, Pair> map = new HashMap<>();
 
 public boolean isCousins(TreeNode root, int x, int y) {
      traverse(root, 0, 0);   
     if(map.get(x).height == map.get(y).height && map.get(x).parent                != map.get(y).parent){
           return true;
       }
       return false;
 }
 public void traverse(TreeNode root, int l, int p){
      if(root == null)
         return;
 
      map.put(root.val, new Pair(l, p));
      traverse(root.left, l+1, root.val);
      traverse(root.right, l+1, root.val);
      }
}
class Pair {
 int height;
 int parent;
 Pair(int h, int p){
 this.height = h;
 this.parent = p;
 }
}
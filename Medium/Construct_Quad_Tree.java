/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        return fun(grid, 0, 0, grid.length);
    }

    public Node fun(int grid[][], int i, int j, int n) {
        if (Same(grid, i, j, n))
            return new Node(grid[i][j] == 1 ? true : false, true);

        Node node = new Node(true, false);
        node.topLeft = fun(grid, i, j, n / 2);
        node.topRight = fun(grid, i, j + n / 2, n / 2);
        node.bottomLeft = fun(grid, i + n / 2, j, n / 2);
        node.bottomRight = fun(grid, i + n / 2, j + n / 2, n / 2);

        return node;
    }

    public boolean Same(int grid[][], int i, int j, int n) {
        for (int x = i; x < i + n; x++) {
            for (int y = j; y < j + n; y++) {
                if (grid[x][y] != grid[i][j])
                    return false;
            }
        }
        return true;
    }

}
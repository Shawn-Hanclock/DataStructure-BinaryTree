### Project Details
> <table>
>   <tr>
>     <th>Main.java</th>
>     <th>BinaryTree.java</th>
>     <th>Node.java</th>
>   </tr>
>   <tr style="horizontal-align:top">
>     <td>N/A</td>
>     <td>- final root: Node</td>
>     <td>- data: Integer<br>- left: Node<br>- right:Node<br>- parent: Node</td>
>   </tr>
>   <tr style="horizontal-align:top">
>     <td>+ static main(String[] args): void</td>
>     <td>+ getRoot(): Node<br>+ treeLeaf(): int<br>+ addData(data: int): void<br>+ addData(data: int[]): void<br>+ toString(): String</td>
>     <td>+ setData(data: int): void<br>+ getData(): Integer<br>+ getRight(): Node<br>+ getParent(): Node<br>+ findHeight(): int<br>- findNext(): Node<br>+ addNew(addData: int): void<br>- isLeaf(): boolean<br>+ leafCount(): int<br>+ printBranches(): String</td>
>   </tr>
> </table>

### Assignment Requirements
> 1. Data visualization 
> 2. Unit testing
> 3. The actual java code

### Resources/ Research
<p>Helpful article from <i>geeksforgeeks</i> about the Complete Binary Tree, 
<a href="https://www.geeksforgeeks.org/complete-binary-tree/">link</a>.</p>

 - "For the creation of a Complete Binary Tree, we require a queue data structure to keep track of the inserted nodes."
<p>Lecture from MIT with an introduction to Binary Trees, <a href="https://ocw.mit.edu/courses/6-006-introduction-to-algorithms-spring-2020/376714cc85c6c784d90eec9c575ec027_MIT6_006S20_lec6.pdf">link</a>.</p>

 - "Binary tree is pointer-based data structure with three pointers per node"
 - parent, left, right

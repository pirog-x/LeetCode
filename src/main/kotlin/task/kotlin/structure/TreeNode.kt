package task.kotlin.structure


class TreeNode(var `val`: Int = 0,
               var left:TreeNode? = null,
               var right: TreeNode? = null) {}


/*
class TreeNode {
    @JvmField
    public var `val` = 0
    @JvmField
    public var left: TreeNode? = null
    @JvmField
    public var right: TreeNode? = null

    constructor()
    constructor(value: Int) {
        this.`val` = value
    }

    constructor(value: Int, left: TreeNode?, right: TreeNode?) {
        this.`val` = value
        this.left = left
        this.right = right
    }
}
*/

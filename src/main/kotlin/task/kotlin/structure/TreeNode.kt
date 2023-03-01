package task.kotlin.structure

class TreeNode {
    @JvmField
    public var value = 0
    @JvmField
    public var left: TreeNode? = null
    @JvmField
    public var right: TreeNode? = null

    constructor()
    constructor(value: Int) {
        this.value = value
    }

    constructor(value: Int, left: TreeNode?, right: TreeNode?) {
        this.value = value
        this.left = left
        this.right = right
    }
}

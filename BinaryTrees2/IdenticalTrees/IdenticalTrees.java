boolean isSame(Node p, Node q){

    if(p == null && q == null)
        return true;      // Both ended together

    if(p == null || q == null)
        return false;     // One ended, the other didn't

    if(p.data != q.data)
        return false;     // Values are different

    return isSame(p.left, q.left)
        && isSame(p.right, q.right); // Both left and right must match
}

Queue<Node> q = new LinkedList<>();
q.offer(root);

boolean leftToRight = true;

while(!q.isEmpty()){

    int size = q.size();

    List<Integer> level = new ArrayList<>();

    for(int i = 0; i < size; i++){

        Node node = q.poll();

        if(leftToRight)
            level.add(node.data);
        else
            level.add(0, node.data);

        if(node.left != null)
            q.offer(node.left);

        if(node.right != null)
            q.offer(node.right);
    }

    ans.add(level);

    leftToRight = !leftToRight;
}

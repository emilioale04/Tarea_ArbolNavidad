public class App {
    public static void main(String[] args) throws Exception {
        char tree[] = "                    ".toCharArray();
        for (int i = 0; i < (tree.length-2)/2; i++) {
            tree[(tree.length-2)/2 - i] = tree[i + (tree.length-2)/2] = '+';
            System.out.println(tree);
        }
        System.out.println("________| |________ :) Emilio");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        char tree[] = "                    ".toCharArray();
        for (int i = 1; i < (tree.length)/2-1; i++) {
            tree[(tree.length)/2 - i] = tree[i + (tree.length)/2-1] = '+';
            System.out.println(tree);
        }
        System.out.println("________|  |________ :) Emilio");
    }
}

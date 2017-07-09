package com.algorithdemo.tree;

public class BinarySearchTree<K, V> {
    
    private Node<K, V> root;
    
    public V get(K key){
        return get(root, key);
    }
    
    private V get(Node<K, V> node, K key){
        return null;
    }

    static class Node<K, V>{
        
        private Node<K, V> left;
        
        private Node<K, V> right;
        
        private K key;
        
        private V value;

        public Node<K, V> getLeft() {
            return left;
        }

        public void setLeft(Node<K, V> left) {
            this.left = left;
        }

        public Node<K, V> getRight() {
            return right;
        }

        public void setRight(Node<K, V> right) {
            this.right = right;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node [left=" + left + ", right=" + right + ", key=" + key
                    + ", value=" + value + "]";
        }
        
        
    }
}

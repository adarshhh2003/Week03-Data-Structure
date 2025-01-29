package SinglyLinkedList.SocialMediaFriendConnections;

public class SocialMediaFriendCollection {
    public static void main(String[] args) {
        SocialMedia network = new SocialMedia();

        network.addUser(1, "Alice", 25);
        network.addUser(2, "Bob", 30);
        network.addUser(3, "Charlie", 28);

        network.addFriend(1, 2);
        network.addFriend(1, 3);
        network.addFriend(2, 3);

        System.out.println("Social Network Users:");
        network.displayUsers();

        System.out.println("\nMutual Friends between Alice and Bob:");
        System.out.println(network.findMutualFriends(1, 2));

        System.out.println("\nFriends of Alice:");
        network.displayFriends(1);

        System.out.println("\nRemoving friend connection between Alice and Bob");
        network.removeFriend(1, 2);
        network.displayFriends(1);
    }
}
